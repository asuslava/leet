public class Main {
    static void main(String[] args) {

        String s = "   fly me   to   the moon  ";
        int length = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length += 1;
            }
            if (s.charAt(i - 1) == ' ')
                if (s.charAt(i) != ' ') {
                    break;
                }
        }
        System.out.println(length);
    }
}
