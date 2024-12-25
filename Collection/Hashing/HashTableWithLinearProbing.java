package Hashing;

public class HashTableWithLinearProbing {
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
         private int capacity;
 
         public HashTable(int capacity) {
             this.capacity = capacity;
             table = new HashNode[capacity];
             size = 0;
         }
 
         private int hashFunction(int key) {
             return key % capacity;
         }
 
         public void put(int key, String value) {
             if (size == capacity) {
                 System.out.println("HashTable is full. Cannot insert key: " + key);
                 return;
             }
 
             int index = hashFunction(key);
             while (table[index] != null && table[index].key != key) {
                 index = (index + 1) % capacity;
             }
 
             if (table[index] == null) {
                 size++;
             }
 
             table[index] = new HashNode(key, value);
         }
 
         public String get(int key) {
             int index = hashFunction(key);
             int originalIndex = index;
 
             while (table[index] != null) {
                 if (table[index].key == key) {
                     return table[index].value;
                 }
 
                 index = (index + 1) % capacity; 
                 if (index == originalIndex) {
                     break; 
                 }
             }
 
             return null;
         }
 
         public void printTable() {
             System.out.println("HashTable Contents:");
             for (int i = 0; i < capacity; i++) {
                 if (table[i] != null) {
                     System.out.println("Index " + i + ": (" + table[i].key + ", " + table[i].value + ")");
                 } else {
                     System.out.println("Index " + i + ": null");
                 }
             }
         }
     }
 
     public static void main(String[] args) {
         HashTable hashTable = new HashTable(7);
 
         hashTable.put(1, "Apple");
         hashTable.put(8, "Banana"); 
         hashTable.put(15, "Cherry");
         hashTable.put(2, "Date");
         hashTable.put(9, "Elderberry");
 
         System.out.println("Value for key 1: " + hashTable.get(1));
         System.out.println("Value for key 8: " + hashTable.get(8));
         System.out.println("Value for key 15: " + hashTable.get(15));
         System.out.println("Value for key 2: " + hashTable.get(2));
         System.out.println("Value for key 9: " + hashTable.get(9));
 
         System.out.println("\nHash Table Contents:");
         hashTable.printTable();
     }
 }
 
