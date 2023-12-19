package section3;

public class E39 {
    public static void e39_challange() {
        double first = 20.00;
        double second = 100.00;

        double result = ((first+ second)*100)%40.00;

        boolean isZero = (result == 0.00) ? true : false;
        System.out.println("Result : " + result + "," +isZero);

    }
}
