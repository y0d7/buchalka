public class MainSection6_ex16 {
    public static void main(String[] args) {

        isPalindrome(707);

    }


    public static boolean isPalindrome(int number) {

        String part = "";

        if (number < 0) {
            number = number * (-1);
        }
        int base = number;

        while (number > 0) {
            int modulo = number % 10;
            part = part + modulo;
            number = number / 10;
        }
        if (base == Integer.parseInt(part)) {
            return true;
        } else {
            return false;
        }

    }


}