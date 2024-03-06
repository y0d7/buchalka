import java.util.Scanner;

public class MainSection6_73 {
    public static void main(String[] args) {

        double sum=0;
        int counter=1;
        double number = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            try{
                System.out.println("Please enter the number #" + counter);
                number = Double.parseDouble(scanner.nextLine());
                sum=sum+number;
                counter++;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter the correct number");
            }


        }while(counter < 6);

        System.out.println("The sum = " + sum);

    }

}