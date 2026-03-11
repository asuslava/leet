public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int one = 1;

        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] != 9) {
                arr[i] += 1;
                //return arr;
            }
            arr[i] = 0;
        }
        arr = new int[arr.length + 1];
        arr[0] = 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}