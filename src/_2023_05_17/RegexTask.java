package _2023_05_17;

import java.util.regex.Pattern;

public class RegexTask {
    /**
     * Задача 1 (Сложность 4/10):
     * Найти и заменить все email адреса в строке на "REDACTED".
     */

    //  String input = "Contact us at info@example.com or support@example.com";
    private static String replace(String input) {
        String replacement = "REDACTED";
        return null;
    }

    /**
     * Задача 2 (Сложность 6/10):
     * Проверить, является ли строка валидным номером телефона
     * в формате "+X-XXX-XXX-XXXX", где X - цифра.
     */

    //String phoneNumber = "+1-555-123-4567";
    private static boolean check(String phoneNumber) {
        return true;
    }

    /**
     * Задача 3 (Сложность 8/10):
     * Проверить, является ли строка валидным URL-адресом,
     * начинающимся с "http://" или "https://",
     * и содержащим доменное имя и путь.
     */

    // String url = "https://www.example.com/path/to/page.html";
    private static boolean isValidURL(String URL) {
        return true;
    }

    //HW

    /**
     * Задача с уровнем сложности 4:
     * Напишите программу на Java, которая будет проверять,
     * является ли заданная строка допустимым именем переменной.
     * Допустимые имена переменных должны начинаться с буквы или
     * знака подчеркивания, а затем могут содержать любую комбинацию
     * букв, цифр и знаков подчеркивания. Минимальная длина имени
     * переменной должна быть 2 символа.
     */

    private static boolean isValid() {
        return true;
    }

    /**
     *Задача 1 (Уровень сложности: 5)
     *Проверить, является ли строка действительным IP-адресом формата IPv4.
     *String ipAddress = "192.168.0.1";
     */
    private static boolean isValidIP(String IP) {
        return true;
    }

    /**
     * Задача 2 (Уровень сложности: 7)
     * Найти все даты в формате "DD-MM-YYYY" в заданной строке.
     * String text = "Some text with dates: 01-01-2022, 31-12-2023, 15-02-2024";
     */

    private static void findDate(String text) {

    }

    /**
     * Задача с уровнем сложности 10:
     * Напишите программу на Java, которая
     * будет парсить и анализировать структуру
     * HTML-документа. Вам нужно найти все ссылки
     * (<a> теги) в HTML-коде и вывести их атрибуты
     * href и текст ссылки.
     *
     */

    private static void pars(String html) {
        Pattern LINK_PATTERN = Pattern.compile("?", Pattern.CASE_INSENSITIVE);
    }

    /**
     * Написать программу, которая ищет все файлы определенного расширения
     * на вашем компьютере
     *
     */

    private static void fileSearch(String dom) { //.pdf .mp3

    }
}