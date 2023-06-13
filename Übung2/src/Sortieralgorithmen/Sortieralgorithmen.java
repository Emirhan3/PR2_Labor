package Sortieralgorithmen;
import java.util.Arrays;
import java.util.Random;

public class Sortieralgorithmen {
    public static void main(String[] args) {
        int[] arr = zufallsArrayGenerieren(100, 1, 10000);

        System.out.println("Ursprüngliches Array:");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[] selectionSortArray = Arrays.copyOf(arr, arr.length);
        selectionSort(selectionSortArray);
        long selectionSortTime = System.currentTimeMillis();
        System.out.println("Selection Sort:");
        System.out.println(Arrays.toString(selectionSortArray));
        System.out.println("Zeit zum Sortieren: " + selectionSortTime + " ms");
        System.out.println();

        int[] insertionSortArray = Arrays.copyOf(arr, arr.length);
        insertionSort(insertionSortArray);
        long insertionSortTime = System.currentTimeMillis();
        System.out.println("Insertion Sort:");
        System.out.println(Arrays.toString(insertionSortArray));
        System.out.println("Zeit zum Sortieren: " + insertionSortTime + " ms");
        System.out.println();

        int[] bubbleSortArray = Arrays.copyOf(arr, arr.length);
        bubbleSort(bubbleSortArray);
        long bubbleSortTime = System.currentTimeMillis();
        System.out.println("Bubble Sort:");
        System.out.println(Arrays.toString(bubbleSortArray));
        System.out.println("Zeit zum Sortieren: " + bubbleSortTime + " ms");
        System.out.println();
        
        int[] mergeSortArray = Arrays.copyOf(arr, arr.length);
        mergeSort(mergeSortArray);
        long mergeSortTime = System.currentTimeMillis();
        System.out.println("Merge Sort:");
        System.out.println(Arrays.toString(mergeSortArray));
        System.out.println("Zeit zum Sortieren: " + mergeSortTime + " ms");
        System.out.println();

        int[] quickSortArray = Arrays.copyOf(arr, arr.length);
        quickSort(quickSortArray, 0, quickSortArray.length - 1);
        long quickSortTime = System.currentTimeMillis();
        System.out.println("Quick Sort:");
        System.out.println(Arrays.toString(quickSortArray));
        System.out.println("Zeit zum Sortieren: " + quickSortTime + " ms");
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mitte = arr.length / 2;
            int[] links = Arrays.copyOfRange(arr, 0, mitte);
            int[] rechts = Arrays.copyOfRange(arr, mitte, arr.length);

            mergeSort(links);
            mergeSort(rechts);

            merge(arr, links, rechts);
        }
    }

    public static void merge(int[] arr, int[] links, int[] rechts) {
        int i = 0, j = 0, k = 0;

        while (i < links.length && j < rechts.length) {
            if (links[i] <= rechts[j]) {
                arr[k] = links[i];
                i++;
            } else {
                arr[k] = rechts[j];
                j++;
            }
            k++;
        }

        while (i < links.length) {
            arr[k] = links[i];
            i++;
            k++;
        }

        while (j < rechts.length) {
            arr[k] = rechts[j];
            j++;
            k++;
        }
    }

    public static void quickSort(int[] arr, int niedrig, int hoch) {
        if (niedrig < hoch) {
            int pivotIndex = partition(arr, niedrig, hoch);

            quickSort(arr, niedrig, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, hoch);
        }
    }

    public static int partition(int[] arr, int niedrig, int hoch) {
        int pivot = arr[hoch];
        int i = niedrig - 1;

        for (int j = niedrig; j < hoch; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[hoch];
        arr[hoch] = temp;

        return i + 1;
    }

    public static int[] zufallsArrayGenerieren(int größe, int min, int max) {
        int[] arr = new int[größe];
        Random zufall = new Random();

        for (int i = 0; i < größe; i++) {
            arr[i] = zufall.nextInt(max - min + 1) + min;
        }

        return arr;
    }
}

