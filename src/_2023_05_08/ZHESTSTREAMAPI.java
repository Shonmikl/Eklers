package _2023_05_08;

import _2023_03_06.Person;

import java.awt.print.Book;
import java.util.List;

public class ZHESTSTREAMAPI {

    /**
     * Дан список целых чисел.
     * Найдите минимальное и максимальное значения в списке и выведите их на консоль.
     * 5-10
     */

    public static void getNums(List<Integer> integers) {
    }

    /**
     * Дан список строк. Найдите все строки, которые начинаются с буквы "A",
     * отсортируйте их по алфавиту и выведите на консоль.
     * 6-10
     */

    public static void getA(List<String> strings) {
    }

    /**
     * Дан список объектов класса Person,
     * содержащих поля name и age.
     * Найдите средний возраст всех людей в списке и выведите его на консоль.
     * 7-10
     */

    public static void getAvgAge(List<Person> people) {
    }

    /**
     * Дан список строк, каждая строка
     * содержит название города и его население в тысячах человек,
     * разделенных запятой. Необходимо найти топ N городов с
     * наибольшим населением. Напишите метод, который принимает
     * список строк и число N и возвращает список топ N городов.
     * String str = "New-York,10000"
     *
     * 8-10
     */

    public static List<String> getTOPNCities(List<String> cities, int n) {
        return null;
    }

    /**
     * Дана коллекция объектов класса Book, содержащая поля title,
     * author и year. Напишите метод, который находит автора,
     * написавшего наибольшее количество книг. Если таких авторов несколько,
     * то вернуть список их имен.
     *
     * 9-10
     */

    public static List<String> getMostProAuthors(List<Book> books) {
        return null;
    }

    /**
     * Дана коллекция объектов класса Person, содержащая поля name и список
     * friends, представляющий список друзей данного человека. Напишите метод,
     * который находит двух людей в коллекции, у которых максимальное число общих друзей.
     * Если таких людей несколько, то вернуть список их имен.
     * 10-10
     */

    public static List<String> findMostCommonFriends(List<Person> people) {
        return null;
    }
}
