public class MainSection6_61 {
    public static void main(String[] args) {

//        System.out.println(0 + " is" + (isPrime(0)? "": " NOT") + " a prime number" );
//        System.out.println(1 + " is" + (isPrime(1)? "": " NOT") + " a prime number" );
//        System.out.println(2 + " is" + (isPrime(2)? "": " NOT") + " a prime number" );
//        System.out.println(3 + " is" + (isPrime(3)? "": " NOT") + " a prime number" );
//        System.out.println(8 + " is" + (isPrime(8)? "": " NOT") + " a prime number" );
//        System.out.println(17 + " is" + (isPrime(17)? "": " NOT") + " a prime number" );

        countPrimes(10,50);
    }

    public static void countPrimes(int number1, int number2)
    {
        int start = number1, end = number2;
        if(number1>number2)
        {
            start = number2;
            end = number1;
        }

        int counter = 0;

        for(int i=start; (i<end); i++)
        {
           // System.out.println("i: " + i+ ", counter: " +counter);
            if (isPrime(i)) {
                System.out.println("Number " + i + " is prime");
                counter++;
            }
            if(counter >= 3) break;

        }

    }


    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= (number / 2); i++) {
            {
                if (number % i == 0) {
                    return false;
                }
            }

        }
        return true;
    }


}