package sortingAlgorythms;

public class Sort {


    public static void SelectionSort(int[] mas) {
        if (mas == null || mas.length == 0) {
            return;
        }
        for (int j = 0; j < mas.length; j++) {
            int minI = j;
            for (int i = j + 1; i < mas.length; i++) {
                if (mas[minI] > mas[i]) {
                    minI = i;
                }
            }
            swap(mas, j, minI);
        }
    }

    public static void swap(int[] mas, int i, int j) {
        int temp = mas[i];
        mas[i] = mas[j];
        mas[j] = temp;

    }

    public static int[] bubbleSort(int[] array) {
        int i = 0;
        int buf;
        char swap = 0;

        if (array.length == 0)
            return null;
        while (i < array.length) {
            if (i + 1 != array.length && array[i] > array[i + 1]) {
                buf = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buf;
                swap = 1;
            }
            i++;
            if (i == array.length && swap == 1) {
                swap = 0;
                i = 0;
            }
        }
        return array;
    }

    void gnomeSort(int[] a) {
        int i = 1;
        while (i < a.length) {
            if (i == 0 || a[i - 1] <= a[i])
                i++;
            else {
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
                i--;
            }
        }
    }

}

