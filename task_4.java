// Задание 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.  
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        try {
            String input = readStringFromUser();
            System.out.println("Введенная строка: " + input);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String readStringFromUser() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new Exception("Пустые строки недопустимы");
        }

        return input;
    }
    
}
