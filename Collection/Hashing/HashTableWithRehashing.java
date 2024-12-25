package Hashing;


public class HashTableWithRehashing {
    static class HashNode {
        int key;
        String value;

        public HashNode(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    static class HashTable {
        private HashNode[] table;
        private int size;
        private double loadFactorThreshold;

        public HashTable(int initialCapacity, double loadFactorThreshold) {
            table = new HashNode[initialCapacity];
            this.loadFactorThreshold = loadFactorThreshold;
            this.size = 0;
        }

        private int hashFunction(int key) {
            return key % table.length;
        }

        public void put(int key, String value) {
            if ((double) size / table.length > loadFactorThreshold) {
                rehash(); 
            }

            int index = hashFunction(key);
            while (table[index] != null && table[index].key != key) {
                index = (index + 1) % table.length;
            }

            if (table[index] == null) {
                size++; 
            }

            table[index] = new HashNode(key, value);
        }

        public String get(int key) {
            int index = hashFunction(key);

            while (table[index] != null) {
                if (table[index].key == key) {
                    return table[index].value;
                }
                index = (index + 1) % table.length; 
            }

            return null;
        }

        private void rehash() {
            System.out.println("Rehashing... Current capacity: " + table.length);
            HashNode[] oldTable = table;
            table = new HashNode[oldTable.length * 2];
            size = 0;

            for (HashNode node : oldTable) {
                if (node != null) {
                    put(node.key, node.value);
                }
            }
            System.out.println("Rehashing complete. New capacity: " + table.length);
        }

        public void printTable() {
            System.out.println("HashTable Contents:");
            for (int i = 0; i < table.length; i++) {
                if (table[i] != null) {
                    System.out.println("Index " + i + ": (" + table[i].key + ", " + table[i].value + ")");
                } else {
                    System.out.println("Index " + i + ": null");
                }
            }
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(5, 0.75); 

        hashTable.put(1, "Apple");
        hashTable.put(6, "Banana"); 
        hashTable.put(11, "Cherry"); 
        hashTable.put(2, "Date");
        hashTable.put(7, "Elderberry"); 
        hashTable.put(12, "Fig"); 

        System.out.println("\nBefore Rehashing:");
        hashTable.printTable();

        System.out.println("\nAfter Adding More Elements (Rehashing Triggered):");
        hashTable.put(3, "Grape");
        hashTable.put(8, "Honeydew");

        hashTable.printTable();
    }
}

