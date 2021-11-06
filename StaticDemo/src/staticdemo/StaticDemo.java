/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticdemo; //NetBeans
/**
 *
 * @author Val
 */
class MyClass {
    //Нестатические поля и методы
    public String message = "Hello World";
    public void displayMessage(){
        System.out.println("Message = " + message);
    }

    //Статические поля и методы
    public static String greetings = "Good morning";
    public static void displayGreetings(){
        System.out.println("Greetings = " + greetings);
    }
}
public class StaticDemo {
    public static void main(String[] args){
        MyClass sd = new MyClass();

        System.out.println(sd.message);
        sd.displayMessage();

        System.out.println(sd.greetings);
        sd.displayGreetings();
    }
}
