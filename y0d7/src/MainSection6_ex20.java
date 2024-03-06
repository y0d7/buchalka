public class MainSection6_ex20 {
    public static void main(String[] args) {

        System.out.println(  hasSameLastDigit(41,22,71));

    }


    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        if (number1 < 10 || number2 < 10 || number3 < 10  || number1 > 1000 || number2 > 1000 || number3 > 1000) {
            return false;
        }

        if((number1 % 10 == number2 % 10) || (number2 % 10 == number3 % 10) || (number1 % 10 == number3 % 10) ) {
            return true;
        }

        return false;

    }

    public static boolean isValid(int number)
    {
        if(number < 10 || number > 1000)
            return false;
        return true;
    }

}