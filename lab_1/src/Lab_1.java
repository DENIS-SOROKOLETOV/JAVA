//Написать программу, демонстрирующую методы для работы с объектами String

import java.sql.SQLOutput;
import java.util.*;

public class Lab_1 {
    public static void main(String[] args) {

        String string1 = new String();
        String string2 = "example"; //строка заданная в ковычках
        String string3 = new String(new char[] {'e', 'x', 'a', 'm', 'p', 'l', 'e'}); //строка заданная массивом символов через конструктор String
        String string4 = new String(new char[] {'n', 'o', 't', 'e', 'x', 'a', 'm', 'p', 'l', 'e'}, 3, 7); //строка заданная считыванием
        //7 символов из массива символов, начиная с 3 номера
        String string5 = "5" + 5; //приведение к строке

        System.out.println("string 1: " + string1);
        System.out.println("string 2: " + string2);
        System.out.println("string 3: " + string3);
        System.out.println("string 4: " + string4);
        System.out.println("string 5: " + string5);

        char[] charsFromString3; //конвертация 3 строки из строчного типа в массив символов
        charsFromString3 = string3.toCharArray();

        for (int i = 0; i < charsFromString3.length; i++)
        {
            System.out.print("char[" + i + "] = " + charsFromString3[i] + ", ");
        }

        System.out.println("\nДлина string2: "+string2.length());

        String string6 = "example";
        String string7 = "Example";

        System.out.println("string2 = string6: " + (string2 == string6)); //один адрес памяти
        System.out.println("string2 = example: " + (string2 == "example")); //один адрес памяти
        System.out.println("string2 = string7: " + (string2 == string7)); //разные адреса памяти
        System.out.println("string2 = string4: " + (string2 == string4)); //разные адреса памяти

        System.out.println(string2.equals(string6)); //сравнение по значению
        System.out.println(string2.equals(string7)); //сравнение по значению
        System.out.println(string2.equalsIgnoreCase(string7)); //сравнение по значению, не учитывая регистр

        String str8 = null;

        if (str8 == null) {
            System.out.println("str8 = null: null string");
        } else {
            System.out.println("str8 = null: NOT null string");
        }

        str8 = "";
        if (str8.length() == 0) {
            System.out.println("str8 = \"\": empty string");//проверка на пустоту с помощью длины строки
        } else {
            System.out.println("str8 = \"\": NOT empty string");
        }

        if (str8 == null) {
            System.out.println("str8 = \"\": null string");
        } else {
            System.out.println("str8 = \"\": NOT null string");
        }

        String str9 = new String();
        if (str9.isEmpty()) {
            System.out.println("11: empty string");//проверка на пустоту с помощью метода isEmpty()
        } else {
            System.out.println("11: NOT empty string");
        }

        if (str9 == null) {
            System.out.println("11: null string");
        } else {
            System.out.println("11: NOT null string");
        }

        System.out.println("Конкатенация строк: " + string2.concat(string7));
        System.out.println("Сборка строки с учетом разделителя: " + String.join(" ", "Lab", "num", "one"));
        if (string2.compareTo(string7) == 0)//сравнение строк с помощью compareTo
        {
            System.out.println("string2 = string7");
        } else {
            System.out.println("string2 != string7");
        }

        String string10 = "exam";
        System.out.println("Есть ли в string7 подстрока exam: " + string7.regionMatches(0, string10, 0, 4));
        System.out.println("Есть ли в string7 подстрока exam без учета регистра: " + string7.regionMatches(true, 0, string10, 0, 4));

        System.out.println("Индекс первого вхождения символа e в string2: " + string2.indexOf('e'));
        System.out.println("Индекс последнего вхождения символа e в string2: " + string2.lastIndexOf('e'));
        System.out.println("Начинается ли string2 с ex: " + string2.startsWith("ex"));
        System.out.println("Заканчивается ли string2 на ex: " + string2.endsWith("ex"));

        String string11 = " example ";
        System.out.println("Убрали начальные и конечные пробелы в строке string11: " + string11.trim());

        System.out.println("string7: " + string7);
        System.out.println("Все символы string7 в нижний регистр: " + string7.toLowerCase());
        System.out.println("Все символы string7 в верхний регистр: " + string7.toUpperCase());
        StringBuilder stringBuilder = new StringBuilder("example");
        System.out.println("Символ с 1 индексом: " + stringBuilder.charAt(1)); //вывод символа под номером 1
        stringBuilder.setCharAt(0, 'E');//замена символа с нулевым индексом на символ E
        System.out.println("Замена символа e на E: " + stringBuilder.toString()); //для вывода переводим stringBuilder в строковый тип с помощью toString()

        int startIndex = 0, endIndex = 4;
        char[] tmpChars = new char[4];
        stringBuilder.getChars(startIndex, endIndex, tmpChars, 0); //набор символов между определенными индексами
        System.out.println(tmpChars);

        stringBuilder.append('s'); //добавление символа s в конец строки
        System.out.println(stringBuilder.toString());
        stringBuilder.insert(4, ' '); //добавление символва " " между exam и ples
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(4, 6); //удаление части строки, начиная с 4 по 5 символ
        System.out.println(stringBuilder.toString());
        stringBuilder.deleteCharAt(4);//удаление одного символа под 4 номером
        System.out.println(stringBuilder.toString());
        String string12 = stringBuilder.substring(0); //обрезает строку с 0 символа и до конца
        System.out.println(string12);
        String string13 = stringBuilder.substring(0, 4); //обрезает строку с 0 символа по 3 символ
        System.out.println(string13);
        stringBuilder.setLength(2);//изменение длины строки
        System.out.println(stringBuilder.toString());
        stringBuilder.replace(0, 2, "example");//замена строки с 0 по 1 индекс на строку example
        System.out.println(stringBuilder.toString());
        stringBuilder.reverse(); //изменение порядка символов в строке на обратный
        System.out.println(stringBuilder.toString());
    }
}