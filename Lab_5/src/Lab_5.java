
public class Lab_5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Отсутствуют аргументы в командной строке");
        } else {
            System.out.println("Аргументы в командной строке:");
            for (String arg : args) {
                System.out.printf("%s\n", arg);
            }
        }
    }
}