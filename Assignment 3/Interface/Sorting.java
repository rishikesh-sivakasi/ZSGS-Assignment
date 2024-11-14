package Interface;

import java.util.Arrays;
import java.util.Scanner;

interface Sortable {
     public int[] sort(int[] arr);
}
 
class BubbleSort implements Sortable{

    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j]>arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
     }
}

class QuickSort implements Sortable {

     @Override
     public int[] sort(int[] arr) {
         quickSort(arr, 0, arr.length - 1);
         return arr;
     }
 
     private  void quickSort(int[] arr, int low, int high) {
         if (low < high) {
             int pivotIndex = partition(arr, low, high);
             quickSort(arr, low, pivotIndex - 1);
             quickSort(arr, pivotIndex + 1, high);
         }
     }
 
     private int partition(int[] arr, int low, int high) {
         int pivot = arr[high]; 
         int i = low - 1;
         for (int j = low; j < high; j++) {
             if (arr[j]<=pivot) {
                 i++;
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
         int temp = arr[i + 1];
         arr[i + 1] = arr[high];
         arr[high] = temp;
         return i + 1; 
     }
 }
 
 class MergeSort implements Sortable {

     @Override
     public int[] sort(int[] arr) {
         if (arr == null || arr.length < 2) {
             return arr;
         }
         mergeSort(arr, 0, arr.length - 1);
         return arr;
     }
 
     private void mergeSort(int[] arr, int left, int right) {
         if (left < right) {
             int mid = left + (right - left) / 2;
             mergeSort(arr, left, mid);
             mergeSort(arr, mid + 1, right);
             merge(arr, left, mid, right);
         }
     }
 
     private void merge(int[] arr, int left, int mid, int right) {
         int leftSize = mid - left + 1;
         int rightSize = right - mid;
         int[] leftArray = new int[leftSize];
         int[] rightArray = new int[rightSize];
         System.arraycopy(arr, left, leftArray, 0, leftSize);
         System.arraycopy(arr, mid + 1, rightArray, 0, rightSize);
         int i = 0, j = 0;
         int k = left;
 
         while (i < leftSize && j < rightSize) {
             if (leftArray[i]<=rightArray[j]) {
                 arr[k] = leftArray[i];
                 i++;
             } else {
                 arr[k] = rightArray[j];
                 j++;
             }
             k++;
         }
         while (i < leftSize) {
             arr[k] = leftArray[i];
             i++;
             k++;
         }
         while (j < rightSize) {
             arr[k] = rightArray[j];
             j++;
             k++;
         }
     }
 }
 

public class Sorting {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the no . of array element");
          int n = sc.nextInt();
          int[] arr = new int[n];
          for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
          }
          System.out.println("1.Bubble Sort");
          System.out.println("2.Quick Sort");
          System.out.println("3.Merge Sort");
          System.out.println("Enter the sorting method type");
          switch (sc.nextInt()) {
               case 1:
                    Sortable b = new BubbleSort();
                    arr = b.sort(arr);
                    System.out.println(Arrays.toString(arr));
                    break;
               case 2:
                    Sortable q = new QuickSort();
                    arr = q.sort(arr);
                    System.out.println(Arrays.toString(arr));
                    break;
               case 3:
                    Sortable m = new MergeSort();
                    arr = m.sort(arr);
                    System.out.println(Arrays.toString(arr));
                    break;
               default:
                    System.out.println("Enter the valid input");
                    break;
          }
          sc.close();
     }
     
}