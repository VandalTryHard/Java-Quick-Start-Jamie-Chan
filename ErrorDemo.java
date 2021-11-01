import java.util.Scanner;

public class ErrorDemo {
    public static void main (String[] args){
        int num, deno;
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Plese enter the numerator: ");
            num = input.nextInt();
            System.out.print("Please enter the denumerator: ");
            deno = input.nextInt();
            System.out.print("Result: " + num/deno);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.print("---End of Error Handling Example----");
        }
        input.close();
    }

}
