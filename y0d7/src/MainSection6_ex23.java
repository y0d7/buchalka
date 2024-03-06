public class MainSection6_ex23 {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(0));

    }


    public static boolean isPerfectNumber(int number1) {
        if (number1 < 1) {
            return false;
        }

        int sum=0;

        for(int i = 1; i<number1;i++)
        {
            if(number1%i == 0){
                sum= sum+i;
            }
        }

        if(sum==number1)
        {
            return true;
        }

            return false;

    }

}