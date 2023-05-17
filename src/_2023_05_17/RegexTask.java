package _2023_05_17;

public class RegexTask {
    /**
     *Задача 1 (Сложность 4/10):
     *Найти и заменить все email адреса в строке на "REDACTED".
     */

    private static void replace() {
        String input = "Contact us at info@example.com or support@example.com";
        String replacement = "REDACTED";
    }

    /**
     *Задача 2 (Сложность 6/10):
     *Проверить, является ли строка валидным номером телефона
     *в формате "+X-XXX-XXX-XXXX", где X - цифра.
     */

    private static void check() {
        String phoneNumber = "+1-555-123-4567";
    }

    /**
     * Задача 3 (Сложность 8/10):
     * Проверить, является ли строка валидным URL-адресом,
     * начинающимся с "http://" или "https://",
     * и содержащим доменное имя и путь.
     */

    private static void checkURL() {
        String url = "https://www.example.com/path/to/page.html";
    }
}