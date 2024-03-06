public class MainSection6_ex22 {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(10, 30));

    }


    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number1 < 10 || number2 < 10) {
            return -1;
        }

        int greatestCommonDivider = 0;
        int minValue = Math.min(number1, number2);

        for(int i=1; i<=minValue; i++)
        {
            if((number1%i == 0) && (number2%i == 0))
            {
                greatestCommonDivider = i;
            }
        }

        if(greatestCommonDivider!=0)
        {
            return greatestCommonDivider;
        }

            return -1;
    }

}