public class MainSection6_63_challange {
    public static void main(String[] args) {

        System.out.println(sumOdd(1,11));

    }


    public static boolean isOdd(int number)
    {
        if(number<0) return false;

        if(number%2 == 0){
            return false;
        }
        else
        {
            return true;
        }


    }

    public static int sumOdd(int start, int end)
    {
        int temp;
        int sum = 0;

        if((start<=0 || end <= 0) || (start > end)) return -1;

        // if(start > end)
        // {
        //     temp = start;
        //     start = end;
        //     end = temp;
        // }

        for(int i = start; i <= end; i++)
        {
            if(isOdd(i)) sum = sum+i;
        }


        return sum;
    }
}