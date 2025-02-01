package hashmapimplementation;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */

public class MyHashMap<K, V> {

    private static final int INITIAL_SIZE = 1 << 4;
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    public Entry[] hashTable;

    public MyHashMap() {
        this.hashTable = new Entry[INITIAL_SIZE];
    }


    public MyHashMap(int capacity) {
        int tableSize = tableSizeFor(capacity);
        this.hashTable = new Entry[tableSize];
    }

    final int tableSizeFor(int capacity) {
        int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    class Entry<K, V> {
        public K key;
        public V value;
        public Entry next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value) {
        int hasCode = key.hashCode() % hashTable.length;
        hasCode = hasCode < 0 ? 0 : hasCode;
        Entry node = node = hashTable[hasCode];

        if (node == null) {
            Entry newNode = new Entry(key, value);
            hashTable[hasCode] = newNode;
        } else {
            Entry previousNode = node;
            while (node != null) {
                if (node != null) {
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            Entry newNode = new Entry(key, value);
            previousNode.next = newNode;

        }
    }


    public V get(K key) {
        int hasCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hasCode];
        while (node != null) {
            if (node.key.equals(key)) {
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }


    public static void main(String[] args) {
        MyHashMap<String, String> myMap = new MyHashMap<>(7);
        myMap.put("name", "sandeep");
        myMap.put("fName", "Brijendra");
        myMap.put("age", "27");
        myMap.put("address", "kanpur");

        String name = myMap.get("name");
        System.out.println(name);

    }


}
