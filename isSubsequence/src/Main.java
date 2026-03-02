public class Main {

    static void main(String[] args) {

        String s = "asbsdfd";
        String t = "abd";
        StringBuilder string = new StringBuilder();
        int position = 0;

        boolean isSub = false;

        for (int i = 0; i < t.length(); i++) {

            if (t.length() > s.length()) {
                break;
            }

            for (int j = position; j < s.length(); j++) {

                char letterT = t.charAt(i);
                char letterS = s.charAt(j);

                if (letterT == letterS) {
                    string.append(letterS);
                    position++;
                    break;
                }
            }
        }
        if (t.equals(string.toString())) {
            isSub = true;
        }
        System.out.println(isSub);
    }
}
