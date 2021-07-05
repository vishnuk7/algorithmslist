import java.util.*;

class SolutionMerge {
    public void sort(int[] nums) {
        /*
         * Base condition
         */
        if (nums.length < 2)
            return;

        int mid = nums.length / 2;

        int[] left = new int[mid];
        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }

        int[] right = new int[nums.length - mid];
        for (int i = mid; i < nums.length; i++) {
            right[i - mid] = nums[i];
        }

        sort(left);
        sort(right);
        merge(left, right, nums);

    }

    public void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        /*
         * compare each element form left and right and put the result into result array
         */
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        /*
         * Put remaining items from left into the result
         */
        while (i < left.length) {
            result[k++] = left[i++];
        }
        /*
         * Put remaining items form right into the result
         */
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
}

public class Merge {
    public static void main(String[] args) {
        int nums[] = { 5, 1, 2, 3, 8, 6, 1, 0, 1, 23 };
        new SolutionMerge().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
