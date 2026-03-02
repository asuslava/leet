public class Main {
    static void main (String[] args) {

        String haystack = "hello";
        String needle = "ll";
        int position = -1;


            for (int i = 0; i <= haystack.length()-needle.length(); i++) {

                if (needle.length() > haystack.length()) {
                    break;
                }

                boolean isValid = true;

                for (int j = 0; j < needle.length(); j++) {
                    char letterHaystack = haystack.charAt(i + j);
                    char letterNeedle = needle.charAt(j);

                    if (letterHaystack != letterNeedle) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    position = i;
                    break;
                }
            }
        System.out.println(position);
    }
}
