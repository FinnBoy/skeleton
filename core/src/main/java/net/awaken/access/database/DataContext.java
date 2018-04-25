package net.awaken.access.database;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Finn Zhao
 */
public class DataContext {

    private static ThreadLocal<Map<Object, Object>> container = new ThreadLocal<Map<Object, Object>>();

    private static Map<Object, Object> get() {
        return container.get();
    }

    private static void set(Map<Object, Object> resources) {
        container.set(resources);
    }

    public static boolean isActive() {
        return container.get() != null;
    }

    public static void create() {
        Map<Object, Object> resources = get();
        if (resources == null) {
            set(new HashMap<Object, Object>());
        }
    }

    public static DataSessionHolder getSessionHolder(DataStore dataStore) {
        Map<Object, Object> resources = get();
        if (resources == null) {
            return null;
        }
        return (DataSessionHolder) resources.get(dataStore);
    }

    public static void put(Object key, Object value) {
        Map<Object, Object> resources = get();
        if (resources == null) {
            throw new UnsupportedOperationException("cause: resources is null");
        }
        resources.put(key, value);
    }
}
