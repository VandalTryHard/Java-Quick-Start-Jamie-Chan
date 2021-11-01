
import java.util.Scanner;
public class ifDemo_contril_commands_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter you age: ");
        int userAge = input.nextInt();
        if (userAge < 0 || userAge > 120){
            System.out.println("Invalid Age");
            System.out.println("Age must be between 0 and 100");
        }
        else if (userAge<18)
            System.out.println("Sorry ou are underage");
        else if (userAge<21)
            System.out.println("You neew parental consent");
        else{
            System.out.println("You age: " + userAge);
            System.out.println("Congratulations!");
            System.out.println("You may sign up for the event!");
        }
        input.close();
    }
}
