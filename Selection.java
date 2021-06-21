import java.util.*;

class SelectionSol {
    public void swap(int[] nums, int first, int second) {
        int temp = first;
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public void sort(int[] nums) {
        int minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            swap(nums, minIndex, i);
        }
    }
}

public class Selection {
    public static void main(String[] args) {
        int nums[] = { 5, 2, 3, 4, 2, 8, 10 };
        new BubbleSortSol().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
