public class Main {
    public static void main(String[] args) {

        int stairs = 5;
        int combination = 1;
        int step = 0;


        for (int i = 1; i <= stairs; i++) {
            int previousCombination = combination;
            combination = step + previousCombination;
            step = previousCombination;
        }
        System.out.println(combination);
    }
}
