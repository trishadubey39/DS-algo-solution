package Sorting;

import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 8 };

        BubbleSort ob = new BubbleSort();
        ob.sort(arr);
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }

    private void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
