public class MainSection6_ex17 {
    public static void main(String[] args) {

        sumFirstAndLastDigit(252);

    }


    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        } else if (number< 10) {
            return number;
        }
        else{
            int sum = 0;

            sum = number%10;

            while (number >= 10)
            {
                number = number/10;
            }
            sum = sum + number;

            return sum;
        }





    }


}