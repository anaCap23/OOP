package sortingAlgorythms;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 2, 3, 4, 8};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        int[] leftMid = new int[mid];
        int[] rightMid = new int[n - mid];

        System.arraycopy(arr, 0, leftMid, 0, mid);
        System.arraycopy(arr, mid, rightMid, 0, arr.length - mid);

        mergeSort(leftMid, mid);
        mergeSort(rightMid, n - mid);

        merge(arr, leftMid, rightMid, mid, n - mid);
    }

    public static void merge(int[] arr, int[] leftMid, int[] rightMid, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (leftMid[i] <= rightMid[j])
                arr[k++] = leftMid[i++];
            else
                arr[k++] = rightMid[j++];
        }

        while (i < left)
            arr[k++] = leftMid[i++];

        while (j < right)
            arr[k++] = rightMid[j++];
    }
}