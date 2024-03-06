import java.util.Scanner;

public class MainSection6_70 {
    public static void main(String[] args) {

        int currentYear = 2023;

     //
        try{
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear)
    {
        String name = System.console().readLine("Hi, what is your name? ");
        System.out.println("Hi " + name + ", Thanks ");
        return "";
    }

    public static String getInputFromScanner(int currentYear)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is your name? ");
        String name = scanner.nextLine();

        boolean validDOB = false;
        int age = 0;
        System.out.println("When You were born ?");

        do {
            System.out.println("Enter a year of birth >= " + (currentYear -125) + " and <= " + currentYear);
        try {
            age = checkData(currentYear, scanner.nextLine());
            validDOB = age < 0 ? false : true;
        }catch(NumberFormatException e)
        {
            System.out.println("Characters are not allowed. ");
        }
        }
        while(!validDOB);

        System.out.println("Hi " + name + ", you are " + (age));
        return "";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear -125;

        if((dob < minimumYear ) || (dob > currentYear))
        {
            return -1;
        }
        return (currentYear-dob);
    }
}