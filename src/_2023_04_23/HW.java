package _2023_04_23;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class HW {
    /**
     * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10);
     * - Фильтрация списка на нечетные числа
     * - Определение максимального значения в списке
     * - Получение среднего значения списка целых чисел
     * - Нахождение суммы чисел, кратных 3 и 5, из списка чисел
     * - Поиск наибольшей длины последовательности из уникальных чисел в списке
     *
     * List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
     * - Преобразование списка строк в список чисел
     *
     * List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
     * - Фильтрация списка строк на те, которые начинаются с 'a' и преобразование их в верхний регистр
     * - Получение списка уникальных слов из списка строк, длина которых больше 4 символов
     *
     * List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
     * List<String> names = people.stream()
     * - Преобразование списка объектов класса в список их имен, отсортированных по возрасту
     */
}

@AllArgsConstructor
@Setter
@Getter
@ToString
class Person {
    private String name;
    private int age;
}
