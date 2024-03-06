import java.util.Scanner;

public class MainSection6_74 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;;

        boolean exitLoop = false;

        do{
            System.out.println("Please provide the value. If You enter any character the system will exit.");
            try{
                int value = Integer.parseInt(scanner.nextLine());
                if(value < min) min=value;
                if(value>max) max=value;

            }catch(NumberFormatException nfe)
            {
                System.out.println("Exit loop");
                exitLoop = true;
            }





        }while(!exitLoop);

        System.out.println("Min = " + min + ", max = " + max);
    }

}