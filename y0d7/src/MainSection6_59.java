public class MainSection6_59 {
    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(11);


    }

    public static void printDayOfWeek(int day)
    {
    String dayOfTheWeek =
            switch(day){
                case 0 -> {yield "Sunday";}
                case 1 -> "Monday";
                default -> "Invalid day";
            };
        System.out.println(day + " stands for " + dayOfTheWeek);
    }


}