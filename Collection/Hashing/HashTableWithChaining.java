package Hashing;

import java.util.LinkedList;

public class HashTableWithChaining {
    static class HashNode {
        int key;
        String value;

        public HashNode(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }
    }

    static class HashTable {
        private LinkedList<HashNode>[] table;
        private int size;

     public HashTable(int size) {
            this.size = size;
            table = new LinkedList[size];
            for (int i = 0; i < size; i++) {
                table[i] = new LinkedList<>();
            }
        }

        private int hashFunction(int key) {
            return key % size;
        }

        public void put(int key, String value) {
            int index = hashFunction(key);
            for (HashNode node : table[index]) {
                if (node.key == key) {
                    node.value = value; 
                    return;
                }
            }
            table[index].add(new HashNode(key, value)); 
        }

        public String get(int key) {
            int index = hashFunction(key);
            for (HashNode node : table[index]) {
                if (node.key == key) {
                    return node.value;
                }
            }
            return null; 
        }

        public void printTable() {
            for (int i = 0; i < size; i++) {
                System.out.print("Index " + i + ": ");
                for (HashNode node : table[i]) {
                    System.out.print(node + " -> ");
                }
                System.out.println("null");
            }
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(5); 

        hashTable.put(1, "Apple");
        hashTable.put(6, "Banana");
        hashTable.put(11, "Cherry");
        hashTable.put(2, "Date");
        hashTable.put(7, "Elderberry");

        System.out.println("Value for key 1: " + hashTable.get(1));
        System.out.println("Value for key 6: " + hashTable.get(6));
        System.out.println("Value for key 11: " + hashTable.get(11));

        System.out.println("\nHash Table Contents:");
        hashTable.printTable();
    }
}
