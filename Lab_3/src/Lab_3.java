import java.util.Scanner;
public class Lab_3{
    public static void main(String[] args) {

        /* Выводит "Да", если введенное пользователем число отрицательное
                и нечетное или положительное и четное. В ином случае выводит "Нет" */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if ((a < 0 && a % 2 != 0) || (a > 0 && a % 2 == 0))
        {
            System.out.println("Да");
        }
        else
            System.out.println("Нет");
        /*Тернарный оператор*/
        System.out.println((a < 0 && a % 2 != 0) || (a > 0 && a % 2 == 0) ? "Yes" : "No");
        /*Демонстрация побитовых операций*/
        int a1 = 2; //010
        int b1 = 5;//101
        int a2 = 4; //100
        int b2 = 5; //101
        int b3 = -5;
        System.out.println(a1 & b1); // результат 0 0*1 1*0 0*1 = 0
        System.out.println(a2 & b2); // результат 4 1*1 0*0 0*1 = 100 = 4
        System.out.println(a1 | b1); // результат 7 0+1 1+0 0+1 = 111 = 7
        System.out.println(a2 | b2); // результат 5 1+1 0+0 0+1 = 101 = 5
        System.out.println(a1 ^ b1); // результат 7 0xor1 1xor0 0xor1 = 111 = 7
        System.out.println(a2 ^ b2); // результат 1 1xor1 0xor0 0xor1 = 001 = 1
        System.out.println(~a1); // результат -3
        /*Демонстрация сдвигов*/
        System.out.println(b1 >> a1); //сдвиг числа 5 на 2 разряда вправо
        System.out.println(b1 << a1); //сдвиг числа 5 на 2 разряда влево
        System.out.println(b3 >>> a1); //беззнаковый сдвиг -5 на 2 вправо
    }
}