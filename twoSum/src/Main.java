public class Main {

    public static void main(String[] args) {

        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;

        int[] res = new int[2];

        for (int i = 1; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}