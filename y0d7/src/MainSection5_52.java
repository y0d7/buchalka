public class MainSection5_52 {
    public static void main(String[] args) {

        double inches1 = convertToCentimeters(10);
        System.out.println(inches1);
        double inches2 = convertToCentimeters(5,3);
        System.out.println(inches2);
    }

    public static double convertToCentimeters(int height) {
        return height * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        return convertToCentimeters ((12*heightInFeet+heightInInches));
    }
}