import java.util.Arrays;

class BubbleSortSol {
    public void swap(int nums[], int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }

    public void sort(int[] nums) {
        boolean isSorted = true;

        for (int i = 0; i < nums.length; i++) {
            /*
             * if elements are sorted then it run only for one pass so the value of isSorted
             * remains true
             */
            for (int j = 1; j < nums.length - i; j++) {
                /*
                 * Check if previews element was greater than current element.
                 */
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j - 1, j);
                    isSorted = false;
                }
            }

            /*
             * After one pass is over if isSorted reamins true we will breakthrough the
             * loop.
             */
            if (isSorted) {
                return;
            }

        }
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = { 8, 5, 1, 2, 3, 0 };
        new BubbleSortSol().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
