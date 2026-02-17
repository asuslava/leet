public class Main {
    public static void main(String[] args) {
        
        String[] strs = {"flower", "floght", "fl"};

        String resultOne = findPrefixOne(strs);
        System.out.println(resultOne);

        String resultTwo = findPrefixTwo(strs);
        System.out.println(resultTwo);
    }

    public static String findPrefixOne(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char letter = strs[0].charAt(i);
            boolean isValid = true;

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length()) {
                    isValid = false;
                    break;
                }

                char currentLetter = strs[j].charAt(i);

                if (letter != currentLetter) {
                    isValid = false;
                    return prefix.toString();
                }
            }

            if (isValid) {
                prefix.append(letter);
            } else {
                break;
            }
        }
        return prefix.toString();
    }

    public static String findPrefixTwo(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char letter = strs[0].charAt(i);
            boolean isValid = true;
            int j = 1;

            while (isValid && j < strs.length) {

                if (i >= strs[j].length() || letter != strs[j].charAt(i)) {
                    isValid = false;
                } else {
                    j++;
                }
            }

            if (isValid){
                prefix.append(letter);
            } else {
                break;
            }
        }
        return prefix.toString();
    }
}