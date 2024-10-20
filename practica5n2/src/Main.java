import java.util.Scanner;

public class FunctionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод значений a и b
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();

        // Ввод значения x
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        // Переменная для результата
        double result;

        // Логика расчета f(x)
        if (x >= 0 && x < 7) {
            result = Math.sin(x);
        } else if (x == 7) {
            result = 3 * Math.exp(a * x + 1) - 1;
        } else if (x > 7 && x < 11) {
            result = 1 / (b * x - a);
        } else {
            System.out.println("Значение x выходит за допустимый диапазон.");
            return;
        }

        // Вывод результата
        System.out.println("f(x) = " + result);
    }
}