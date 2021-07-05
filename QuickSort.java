import java.util.*;

class QuickSortSol {
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int start, int end) {
        /* base condition */
        if (start >= end)
            return;

        /*
         * In partition why we are passing the start, end becaue we don't want to
         * traverse entire array
         */
        var boundary = partition(array, start, end);
        /* left part */
        sort(array, start, boundary - 1);
        /* right part */
        sort(array, boundary + 1, end);
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start - 1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot)
                /* before swap you have to increment the boundary */
                swap(array, i, ++boundary);
        }

        return boundary;
    }

    private void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}

public class QuickSort {
    public static void main(String[] args) {
        int nums[] = { 7, 3, 1, 5, 7, 2, 3, 1, 2 };
        new QuickSortSol().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
