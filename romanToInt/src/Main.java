public class Main {
    static void main(String[] args) {

        String s = "MCMXCIV";
        int result = 0;

        for (int i = s.length()-1; i >= 0; i--) {

            char letter = s.charAt(i);
            int number;

            switch (letter) {
                case 'I':
                    number = 1;
                    result += number;
                    break;
                case 'V':
                    if (i != 0 && s.charAt(i-1) == 'I') {
                        number = 4;
                        result += number;
                        i--;
                    } else {
                        number = 5;
                        result += number;
                    }
                    break;
                case 'X':
                    if (i != 0 && s.charAt(i-1) == 'I') {
                        number = 9;
                        result += number;
                        i--;
                    } else {
                        number = 10;
                        result += number;
                    }
                    break;
                case 'L':
                    if (i != 0 && s.charAt(i-1) == 'X') {
                        number = 40;
                        result += number;
                        i--;
                    } else {
                        number = 50;
                        result += number;
                    }
                    break;
                case 'C':
                    if (i != 0 && s.charAt(i-1) == 'X') {
                        number = 90;
                        result += number;
                        i--;
                    } else {
                        number = 100;
                        result += number;
                    }
                    break;
                case 'D':
                    if (i != 0 && s.charAt(i-1) == 'C') {
                        number = 400;
                        result += number;
                        i--;
                    } else {
                        number = 500;
                        result += number;
                    }
                    break;
                case 'M':
                    if (i != 0 && s.charAt(i-1) == 'C') {
                        number = 900;
                        result += number;
                        i--;
                    } else {
                        number = 1000;
                        result += number;
                    }
                    break;
            }
        }
        System.out.println(result);
    }
}