import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {
        enum Color {
            RED, GREEN, BLUE
        };
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n1. Введите целое число от 1 до 3: ");
        int choice = scanner.nextInt();;

        switch (choice) {
            case 1:
                System.out.println("Вы ввели число 1.");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Неверный вариант");
        }

        System.out.println("\n2. Введите день недели: ");
        String day = scanner.next();;

        switch (day) {
            case "Monday":
                System.out.println("Понедельник");
                break;
            case "Tuesday":
                System.out.println("Вторник");
                break;
            default:
                System.out.println("Другой день");
        }

        System.out.println("\n3. Введите символ: ");
        char symbol = scanner.next().charAt(0);;

        switch (symbol) {
            case 'A':
                System.out.println("Вы ввели символ 'A'.");
                break;
            case 'B':
                System.out.println("Вы ввели символ 'B'.");
                break;
            default:
                System.out.println("Другой символ.");
        }

        Color color = Color.RED;

        switch (color) {
            case RED:
                System.out.println("Красный");
                break;
            case GREEN:
                System.out.println("Зеленый");
                break;
            case BLUE:
                System.out.println("Синий");
                break;
        }
    }
}