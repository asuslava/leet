public class Main {
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = 1;
        int len = arr.length;

        for (int j = 1; j < len; j++) {
            if (arr[j] != arr[i-1]) {
                arr[i] = arr[j];
                i++;
            }
        }
        System.out.println(i);

    }
}