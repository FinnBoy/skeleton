package net.awaken.collection;

import java.util.*;

/**
 * Fixed Map.
 * Key: String, Value: Integer.
 *
 * @author Finn Zhao
 */
public class FixedIntMap {

    private final String[] keys;

    private final Integer[] values;

    private final int size;

    private final SameHashEntry[] sameHashEntries;

    /**
     * check
     *
     * @param keys   literals
     * @param values int values
     */
    private void validate(String[] keys, Integer[] values) {
        if (keys == null) {
            throw new IllegalArgumentException("cause: keys is null");
        }

        for (String key : keys) {
            if (key == null) {
                throw new IllegalArgumentException("cause: keys item is null");
            }
        }

        if (values != null) {
            if (keys.length != values.length) {
                throw new IllegalArgumentException("cause: keys length != values length");
            }
            for (Integer value : values) {
                if (value == null) {
                    throw new IllegalArgumentException("cause: values item is null");
                }
            }
        }

    }

    /**
     * set
     *
     * @param keys   literals
     * @param values int values
     */
    private void init(String[] keys, Integer[] values) {

        Integer[] vals = values;

        if (values == null) {
            int len = keys.length;
            vals = new Integer[len];
            for (int i = 0; i < len; i++) {
                vals[i] = i;
            }
        }

        int len = keys.length;

        int hash;
        int location;
        SameHashEntry sameHashEntry;
        for (int i = 0; i < len; i++) {
            hash = this.hash(keys[i]);
            location = this.location(hash);
            if (sameHashEntries[location] == null) {
                sameHashEntries[location] = new SameHashEntry(location);
            }
            sameHashEntry = sameHashEntries[location];
            sameHashEntry.add(new Entry(keys[i], vals[i], hash));
        }

        for (int i = 0; i < len; i++) {
            sameHashEntry = sameHashEntries[i];
            if (sameHashEntry == null) {
                continue;
            }
            sameHashEntries[i] = sameHashEntry.fixed();
        }
    }

    public FixedIntMap(Map<String, Integer> map) {
        if (map == null) {
            throw new IllegalArgumentException("cause: map is null");
        }
        int size = map.size();
        String[] keys = map.keySet().toArray(new String[size]);
        Integer[] values = map.values().toArray(new Integer[size]);

        // 1. Check
        this.validate(keys, values);

        // 2. Set
        this.keys = keys;
        this.values = values;
        this.size = keys.length;
        this.sameHashEntries = new SameHashEntry[this.size];

        this.init(keys, values);
    }

    public FixedIntMap(String[] keys, Integer[] values) {

        // 1. Check
        this.validate(keys, values);

        // 2. Set
        this.keys = keys;
        this.values = values;
        this.size = keys.length;
        this.sameHashEntries = new SameHashEntry[this.size];

        this.init(keys, values);
    }

    /**
     * get int value.
     *
     * @param key literals
     * @return int value
     */
    public Integer get(String key) {
        final int hash = this.hash(key);
        final int location = this.location(hash);
        final SameHashEntry sameHashEntry = this.sameHashEntries[location];
        if (sameHashEntry == null) {
            return null;
        }
        final Entry[] entries = sameHashEntry.getEntries();
        for (Entry entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    public String[] getKeys() {
        return keys;
    }

    public Integer[] getValues() {
        return values;
    }

    /********************************* private *********************************/

    private int hash(String key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    private int location(int hash) {
        return (this.size - 1) & hash;
    }

    /******************************* inner class *******************************/

    private class SameHashEntry {

        SameHashEntry(int location) {
            this.location = location;
            this.entries = null;
            this.fixed = false;
            this.initEntries = new LinkedList<Entry>();
        }

        SameHashEntry(SameHashEntry sameHashEntry) {
            int size = sameHashEntry.initEntries.size();
            this.location = sameHashEntry.getLocation();
            this.entries = sameHashEntry.initEntries.toArray(new Entry[size]);
            this.fixed = true;
        }

        private final boolean fixed;

        private final int location;

        private final Entry[] entries;

        private List<Entry> initEntries;

        SameHashEntry fixed() {
            if (this.fixed) {
                throw new RuntimeException("");
            }
            return new SameHashEntry(this);
        }

        void add(Entry entry) {
            if (this.fixed) {
                return;
            }
            this.initEntries.add(entry);
        }

        Entry[] getEntries() {
            return entries;
        }

        int getLocation() {
            return location;
        }
    }

    private class Entry {

        Entry(String key, Integer value, int hash) {
            this.key = key;
            this.value = value;
            this.hash = hash;
        }

        private final String key;
        private final Integer value;

        private final int hash;

        String getKey() {
            return key;
        }

        Integer getValue() {
            return value;
        }

        int getHash() {
            return hash;
        }

    }

}
