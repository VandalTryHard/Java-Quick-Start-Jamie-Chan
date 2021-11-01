import java.util.Scanner;
import java.util.InputMismatchException;

public class ErrorDemo2_6_5 {
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);

        int choice = 0;

        int[] numbers = {10, 11, 12, 13, 14, 15};
        System.out.print("Plese enter the index of the array: ");
        try{
            choice = input.nextInt();
            System.out.printf("numbers[%d] = %d%n", choice, numbers[choice]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index is invalid.");
        }catch (InputMismatchException e){
            System.out.println("Error: You did nit enter an integer.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        input.close();
    }
}
