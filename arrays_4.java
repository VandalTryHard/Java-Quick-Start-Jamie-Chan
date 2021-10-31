import java.util.Arrays; //4.2.1 Методы массивов
public class arrays_4 {
    public static void main(String[] args) {
        int[] userAge;
        userAge = new int[] {23, 24, 25, 26, 27, 28, 29, 30};
        userAge[0] = 42;
        System.out.println(userAge[0]);
        
        //4.2.1 Методы массивов!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        int[] arr1 = {0, 2, 4, 6, 8, 10};
        int[] arr2 = {0, 3, 6, 9, 12, 15};
        int[] arr3 = {0, 2, 4, 6, 8, 10};
        
        //equals()
        boolean result1 = Arrays.equals(arr1, arr2);
        boolean result2 = Arrays.equals(arr1, arr3);
        System.out.println(result1);
        System.out.println(result2);
        
        //copyOfRange()
        int[] arrList = {0, 12, 64, -78, 35, -63, 4, -8};
        int[] arrList1 = Arrays.copyOfRange(arrList, 1, 4);
        System.out.println(arrList1[0]);
        
        //toString()
        int[] numbers = {6, 3, 32, -95, 31, -3};
        System.out.println(Arrays.toString(numbers));
        
        //sort()
        int[] numbersSort = {93, 1, -96, 45, 22, 0, -99999, 9999};
        Arrays.sort(numbersSort);
        System.out.println(Arrays.toString(numbersSort));
        
        //binarySearch()
        int[] numberSearch = {98, 242, -48, 0, 12, 44, 98, -23, 9};
        Arrays.sort(numberSearch);
        int found = Arrays.binarySearch(numberSearch, -1);
        System.out.println(found); //-3 показывает что число -1 находилось бы под индексом 3-1=2
        
        //4.2.2 ОПРЕДЕЛЕНИЕ ДЛИНЫ МАССИВА!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        int[] search1 = {56, 12, 43, 645, -55, 5, -69};
        System.out.println(search1.length);

        //4.3. ПРИМИТИВНЫЕ ТИПЫ И ССЫЛОЧНЫЕ ТИПЫ
        //4.4. СТРОКИ И НЕИМЕНЯЕМОСТЬ
        
    }
    
}
