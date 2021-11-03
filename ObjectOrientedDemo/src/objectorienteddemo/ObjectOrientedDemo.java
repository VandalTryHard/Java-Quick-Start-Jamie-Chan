/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectorienteddemo;

/**
 *
 * @author Val
 */
public class ObjectOrientedDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        Staff staff1 = new Staff("Peter");
        staff1.setHoursWorked(160);
        int pay = staff1.calculatePay(1000, 400);
        System.out.println("Pay = " + pay);

        Staff staff2 = new Staff("Valentin");
        staff2.setHoursWorked(400);
        pay = staff2.calculatePay();
        System.out.println("Pay = " + pay);

        Staff staff3 = new Staff("Jane", "Lee");
        staff3.setHoursWorked(160);
        pay = staff3.calculatePay();
        System.out.println("Pay = " + pay);

        //Проверка данны с использованием set-методов
        System.out.println("\n\nUpdating Jane's Hours Worked to -10");
        staff3.setHoursWorked(-10);
        System.out.println("\nHours Worked = " +staff3.getHoursWorked());
        pay = staff3.calculatePay();
        System.out.println("Pay = " + pay);
    }
    
}
