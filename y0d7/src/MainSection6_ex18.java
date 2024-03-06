public class MainSection6_ex18 {
    public static void main(String[] args) {

        getEvenDigitSum(2000);

    }


    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int part = 0;


        while (number > 0) {
            part = number % 10;

            if (part % 2 == 0) {
                sum = sum + (part);
            }
            number = number / 10;

        }
        System.out.println(sum);

        return sum;

    }


}