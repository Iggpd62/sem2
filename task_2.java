// Задание 2. Если необходимо, исправьте данный код.

public class task_2 {
    try {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8}; // объявил и инициализировал массив `intArray` перед использованием
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } 
    catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }   
}