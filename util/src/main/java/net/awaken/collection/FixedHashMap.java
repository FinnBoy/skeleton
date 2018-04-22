package net.awaken.collection;

import java.util.*;

/**
 * Fixed Map.
 * Key: String, Value: Integer.
 *
 * @author Finn Zhao
 */
public class FixedHashMap {

    private final String[] keys;

    private final Integer[] values;

    private final int size;

    private final SameHashEntry[] sameHashEntries;

    public FixedHashMap(String[] keys, Integer[] values) {

        // 1. Check
        if (keys == null) {
            throw new RuntimeException("");
        }

        int kSize = keys.length;

        for (int i = 0; i < kSize; i++) {
            if (keys[i] == null) {
                throw new RuntimeException("");
            }
        }

        if (values != null) {
            int vSize = values.length;
            if (kSize != vSize) {
                throw new RuntimeException("");
            }
            for (int i = 0; i < vSize; i++) {
                if (values[i] == null) {
                    throw new RuntimeException("");
                }
            }
        }

        // 2. Set
        Integer[] vals = values;

        if (values == null) {
            vals = new Integer[kSize];
            for (int i = 0; i < kSize; i++) {
                vals[i] = i;
            }
        }

        this.keys = keys;
        this.values = values;
        this.size = kSize;
        this.sameHashEntries = new SameHashEntry[this.size];


        int hash;
        int location;
        SameHashEntry sameHashEntry;
        for (int i = 0; i < kSize; i++) {
            hash = this.hash(keys[i]);
            location = this.location(hash);
            if (sameHashEntries[location] == null) {
                sameHashEntries[location] = new SameHashEntry(location);
            }
            sameHashEntry = sameHashEntries[location];
            sameHashEntry.add(new Entry(keys[i], vals[i], hash));
        }

        for (int i = 0; i < kSize; i++) {
            sameHashEntry = sameHashEntries[i];
            if (sameHashEntry == null) {
                continue;
            }
            sameHashEntries[i] = sameHashEntry.fixed();
        }
    }

    /**
     * get int value.
     *
     * @param key
     * @return
     */
    public Integer get(String key) {
        final int hash = this.hash(key);
        final int location = this.location(hash);
        final SameHashEntry sameHashEntry = this.sameHashEntries[location];
        if (sameHashEntry == null) {
            return null;
        }
        final Entry[] entries = sameHashEntry.getEntries();
        Entry entry;
        for (int i = 0, size = entries.length; i < size; i++) {
            entry = entries[i];
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

        public SameHashEntry(int location) {
            this.location = location;
            this.entries = null;
            this.fixed = false;
            this.initEntries = new LinkedList<Entry>();
        }

        public SameHashEntry(SameHashEntry sameHashEntry) {
            int size = sameHashEntry.initEntries.size();
            this.location = sameHashEntry.getLocation();
            this.entries = sameHashEntry.initEntries.toArray(new Entry[size]);
            this.fixed = true;
        }

        private final boolean fixed;

        private final int location;

        private final Entry[] entries;

        private List<Entry> initEntries;

        public SameHashEntry fixed() {
            if (this.fixed) {
                throw new RuntimeException("");
            }
            return new SameHashEntry(this);
        }

        public void add(Entry entry) {
            if (this.fixed) {
                return;
            }
            this.initEntries.add(entry);
        }

        public Entry[] getEntries() {
            return entries;
        }

        public int getLocation() {
            return location;
        }
    }

    private class Entry {

        public Entry(String key, Integer value, int hash) {
            this.key = key;
            this.value = value;
            this.hash = hash;
        }

        private final String key;
        private final Integer value;

        private final int hash;

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }

        public int getHash() {
            return hash;
        }

    }

}
