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

            while (isValid) {

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
                if (isValid){
                    prefix.append(letter);
                } else {
                    break;
                }
                break;
            }
        }
        return prefix.toString();
    }
}