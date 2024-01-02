public class MainSection6_58 {
    public static void main(String[] args) {

        getNato('A');
        getNato('Z');


    }

    public static void getNato(char character)
    {
        switch(character){
            case 'A'->System.out.println("Able");
            case 'B'->System.out.println("Bravo");
            case 'C'->System.out.println("Charlie");
            case 'D'->System.out.println("Dog");
            case 'E'->System.out.println("Easy");
            default -> System.out.println("Invalid");
        }

    }


}