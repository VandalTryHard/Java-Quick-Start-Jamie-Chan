
public class interactivity_5 {
    public static void main(String[] argv){
        System.out.println("Hello interactivity Java");
        //5.1 ОПЕРАТОРЫ ВЫВОДА

        //5.1.2 Выводы значения переменной
        int number = 5;
        System.out.println(number);
        //5.1.3 Вывод результатов без присваивания переменной
        System.out.println(30+5);
        System.out.println("Oracle".substring(1, 4));
        //5.1.4 Использование КОНКАТЕНАЦИИ
        System.out.println("Hello, " + "how are you?" + 
        "I love Java!");
        int result = 5;
        System.out.println("My result for test task is " + result);
        System.out.println("Hello you know what 5+5="+(5+5));

        //5.2 СЛУЖЕБНЫЕ ПОСЛЕДОВАТЕЛЬНОСТИ
        // \t Табуляция
        System.out.println("Hello \tJava World!");
        //5.2.1 \n Переход на новую строку
        System.out.println("Hellow \nJava World");
        //5.2.2 \\ Вывод самого символа \
        System.out.println("\\");
        //5.2.3 Вывод \ чтобы символ не интерпретировался как завершение строки
        System.out.println("Hello \"Java");

        //5.3 ФОРМАТИРОВАНИЕ ВЫВОДА
        System.out.println("The answer for 5.45 divided by 3 id " + (5.45/3));
        System.out.printf("The answer for %.2f divided by %d is %.2f ", 5.45, 3, 5.45/3);
        //5.3.1 Преобразователи
        //целочисленный преобразователь d
        System.out.printf("\n%d", 12);
        //преобразователь новой строки n
        System.out.printf("\n%d%n%d", 11, 3);
        //5.3.2 Флаги
        System.out.printf("%n%8d", 12);
        System.out.printf("%n%10.2f", 12.4);
        //Флаг разделителя групп разрядов (,)
        System.out.printf("%n%,d", 123456789);
        System.out.printf("\n" + "%,.2f", 12345.56789);

        //5.4. ПОЛУЧЕНИЕ ВВОДА ОТ ПОЛЬЗОВАТЕЛЯ
        //см. interactivity_5_4.java
        

        

    }
}
