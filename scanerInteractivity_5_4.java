
import java.util.Scanner;

public class scanerInteractivity_5_4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int myInt = input.nextInt();
        System.out.printf("You entered %d.%n%n", myInt);

        System.out.print("Enter an double: ");
        double myDouble = input.nextDouble();
        System.out.printf("You entered %.2f.%n%n", myDouble);

        System.out.print("Enter an line: ");
        input.nextLine();
        String myText = input.nextLine();
        System.out.println("You entered: " + myText);
    }
}