package net.awaken.infrastructure.db;

import net.awaken.infrastructure.Identifiable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Finn Zhao
 */
public class DataContext {

    private static ThreadLocal<Map<Identifiable, Object>> container = new ThreadLocal<Map<Identifiable, Object>>();

    private static Map<Identifiable, Object> get() {
        return container.get();
    }

    private static void set(Map<Identifiable, Object> resources) {
        container.set(resources);
    }

    public static boolean isActive() {
        return container.get() != null;
    }

    public static void create() {
        Map<Identifiable, Object> resources = get();
        if (resources == null) {
            set(new HashMap<Identifiable, Object>());
        }
    }

    public static DataSessionHolder getSessionHolder(DataStore dataStore) {
        Map<Identifiable, Object> resources = get();
        if (resources == null) {
            return null;
        }
        return (DataSessionHolder) resources.get(dataStore);
    }

    public static void put(Identifiable identifiable, Object object) {
        Map<Identifiable, Object> resources = get();
        if (resources == null) {
            throw new UnsupportedOperationException("cause: resources is null");
        }
        resources.put(identifiable, object);
    }
}
