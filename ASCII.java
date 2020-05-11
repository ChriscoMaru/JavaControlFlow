import java.util.Scanner;
public class ASCII {

    public static void main(String[] args) {

        printNumbers();
        printUpperCase();
        printLowerCase();

        String name;
        String choice;
        String car;
        String pet;
        int num;
        int petAge;
        int playerNum;
        int model;
        String actor;
        int ranNum;
        


        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        System.out.println("Hey " + name);
        System.out.println("Would you like to move forward? yes / no");
        choice = keyboard.nextLine();

        if(choice.equals("no")) {
            System.out.println("Not all can be great");
        }else {
            System.out.println("Do you have a car? yes/no");
            car = keyboard.nextLine();

            System.out.println("What is your pets name?");
            pet = keyboard.nextLine();

            System.out.println("How old are they?");
            petAge = keyboard.nextInt();

            System.out.println("Would you say you have a lucky number?");
            num = keyboard.nextInt();

            System.out.println("What are the last 4 of your SSN? ( ͡° ͜ʖ ͡°) ");
            playerNum = keyboard.nextInt();

            System.out.println("What year is that car of yours? Just the last two digits please.");
            model = keyboard.nextInt();

            System.out.println("What is the name of your favorite actor or actress?");
            actor = keyboard.nextLine();

            System.out.println("Hit me with a random number.");
            ranNum = keyboard.nextInt();
            
        }
        
    }

    public static void printNumbers() {
        // decimal ASCII values for integers = 48-57
        for (int c = 48; c < 58; c++) {
            System.out.print((char) c);
        }
        System.out.println();
    }

    public static void printLowerCase() {
        // Decimal ASCII values for Lowercase letter = 69-90
        for (int c = 97; c < 122; c++) {
            System.out.print((char) c);
        }
        System.out.println();
    }

    public static void printUpperCase() {

        for (int c = 65; c < 90; c++) {
            System.out.print((char) c);
        }
        System.out.println();
    }
    
}