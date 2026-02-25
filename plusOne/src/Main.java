public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int one = 1;

        for (int i = arr.length-1; i >= 0; i--) {
            int sum = arr[i] + one;
            arr[i] = sum % 10;
            one = sum / 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}