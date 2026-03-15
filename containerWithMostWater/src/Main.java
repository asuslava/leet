import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {

        int[] height = {8,7,2,1};
        int maxArea = 0;
        int area;

        int i = 0;
        int j = height.length-1;

        while (i < j) {

            int left = height[i];
            int right = height[j];
            int min = min(left, right);
            area = min*(j-i);
            if (maxArea < area) {
                maxArea = area;
            }
            if (left < right) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println(maxArea);
    }
}