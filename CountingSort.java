import java.util.Arrays;

/*
    Counting Sort is not comparison sort in counting sort we use another array where stote occurance of a element in the index of another array
*/

class CountingSortSol {
    public void sort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        sort(array, max);
    }

    private void sort(int[] array, int max) {
        int[] counts = new int[max + 1];

        for (var item : array)
            counts[item]++;

        int k = 0;
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                array[k++] = i;
            }
        }

    }
}

public class CountingSort {
    public static void main(String[] args) {
        int nums[] = { 5, 1, 7, 2, 6, 4, 1 };
        new CountingSortSol().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
