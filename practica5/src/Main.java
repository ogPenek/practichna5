public class MathCalculations {
    public static void main(String[] args) {
        // Заданные значения
        double a = 0.1;
        double b = 88;
        double c = 2 * Math.pow(10, -7);
        double k = 1; // Предполагаемое значение для k, так как оно не указано

        // Вычисление x
        double x = Math.pow(a, 2) * Math.exp(-Math.pow((a / b), 2));

        // Вычисление y
        double y = Math.atan(Math.sqrt((4 * k) / (Math.pow(a, 2) * c) - 1));

        // Вывод результатов
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}