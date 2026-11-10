import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        // сканер для чтени клавиатуры
        Scanner scanner = new Scanner(System.in);

        // надо ввести целое число сюд
        System.out.print("Введите целое число: ");
        int originalNumber = scanner.nextInt();

        // Копируем число в отдельную переменную для разбора в цикле
        int temp = originalNumber;
        int reversedNum = 0;

        // Цикл работает, пока в числе остались цифры
        while (temp != 0) {
            // Забираем последнюю цифру числа
            int remainder = temp % 10;

            // Сдвигаем разряд реверса влево и добавляем цифру
            reversedNum = reversedNum * 10 + remainder;

            // Отрезаем последнюю цифру от исходного числа
            temp = temp / 10;
        }

        // Выводим число на экран
        System.out.println("\nРезультат");
        System.out.println("Число в обратном порядке: " + reversedNum);

        // Проверяем, совпадает ли число с начальным
        if (originalNumber == reversedNum) {
            System.out.println("Результат: Число является палиндромом");
        } else {
            System.out.println("Результат: Число не является палиндромом");
        }

        scanner.close();
    }
}
