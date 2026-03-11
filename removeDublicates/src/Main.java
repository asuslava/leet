public class Main {
    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3};
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        int newLength = i+1;

        for (int k = 0; k < newLength; k++) {
            System.out.println(nums[k]);
        }
    }
}