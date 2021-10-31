public class control_commands_6 {
    public static void main(String[] args){
        //6  УПРАВЛЯЮЩИЕ КОМАНДЫ
        //6.1 Операторы сравнения
        int x = 5;
        int y = 4;
        System.out.println(x==y);
        int z = 5;
        int c = 4;
        System.out.println(z!=c);
        // Оператор AND (&&)
        System.out.println(5==5 && 2>1 && 3!=7);
        System.out.println(5==5 && 2<1 && 3!=7);
        //Опертор OR (||)
        System.out.println(5==5 || 2<1 || 3==7);
        System.out.println(5==6 || 2<1 || 3==7);

        // 6.2 Команды принятия решений
        // 6.2.1 Команда IF
        // смотри ifDemo_contril_commands_6.java
        //6.2.2 Тернарный оператор (?)
        System.out.println(3>2 ? 10:5);
        int myNum = 3>4 ? 10:5;
        System.out.println(myNum);
        //6.2.3 Комада switch
        //смотри switchDemo_contril_commands_6.java

        // 6.3 Циклы
        // 6.3.1 Команда FOR
        for (int i=0; i<5; i++){
            System.out.println(i);
        }
        int[] myNumbers = {10, 20, 30, 40, 50, 60};
        for (int i=0; i<myNumbers.length; i++){
            System.out.println(myNumbers[i]);
        }
        //6.3.2 Расширенная команда FOR
        for (int item: myNumbers){
            System.out.println(item);
        }
        // 6.3.3 Команда WHILE
        int count=5;
        while(count>0){
            System.out.println("Counter=" + count);
            count = count - 1;
        }
        // 6.3.4 Цикл DO-WHILE
        int counter = 100;
        do {
            System.out.println("Counter = "+ counter);
            counter++;
        }while(counter<0);

        //6.4 Команды перехода
        
    }
}
