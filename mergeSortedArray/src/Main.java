import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int temp;
        boolean swapped;

        for (int i = 0; i < nums2.length; i++) {
            nums1[i+m] = nums2[i];
        }

        for (int i = 0; i < nums1.length-1; i++) {
            swapped = false;
            for (int j = 0; j < nums1.length - i - 1; j++) {
                if (nums1[j] > nums1[j+1]) {
                    temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.println(Arrays.toString(nums1));

    }
}
