public class MainSection6_62 {
    public static void main(String[] args) {

        getSumOfRange(1, 1000);

    }


    public static void getSumOfRange(int start, int end) {
        int temp;
        if (start > end) {
            temp = start;
            start = end;
            end = temp;
        }
        int sumOfNumber = 0;
        int counter = 0;

        for (int i = start; i < end && counter <5; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("This number is " + i);
                sumOfNumber = sumOfNumber + i;
                counter++;
            }


        }
        System.out.println("Sum = " + sumOfNumber + ", counter: " + counter);
    }


}