public class MainSection6_ex19 {
    public static void main(String[] args) {

        System.out.println(  hasSharedDigit(12,23));

    }


    public static boolean hasSharedDigit(int number1, int number2) {

        if (number1 < 10 || number2 < 10 || number1 > 99 || number2 > 99) {
            return false;
        }
        int[] results = {0,0,0,0,0,0,0,0,0};


        while (number1 > 0 && number2 > 0) {
            int part1 = number1 % 10;
            int part2 = number2 % 10;

            results[part1-1] = results[part1-1]+1;
            results[part2-1] = results[part2-1]+1;

            number1 = number1 / 10;
            number2 = number2 / 10;

        }

        for(int i = 0; i<results.length; i++)
        {
            if(results[i]>1)
            {
                return true;
            }
        }

        return false;

    }


}