public class MainSection6_65 {
    public static void main(String[] args) {
        int evenAmount = 0;
        int oddAmount = 0;
        int j = 4;
        while (j <= 20 && evenAmount < 5) {
            j++;
            if (!(isEvenNumber(j))) {
                oddAmount++;
                continue;
            }
            evenAmount++;
            System.out.println(j + " is even number " + isEvenNumber(j));

        }
        System.out.println("Even " + evenAmount + ", odd " + oddAmount);


    }

    public static boolean isEvenNumber ( int number)
    {
        if (number < 0) return false;

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}

