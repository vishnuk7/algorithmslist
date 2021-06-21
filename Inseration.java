import java.util.Arrays;

class InserationSol {
    public void sort(int[] nums) {
        int current, j;
        for (int i = 1; i < nums.length; i++) {
            current = nums[i];
            j = i - 1;
            while (j >= 0 && nums[j] > current) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = current;
        }
    }
}

public class Inseration {
    public static void main(String[] args) {
        int nums[] = { 5, 2, 3, 6, 7, 59, 1, 10 };
        new InserationSol().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
