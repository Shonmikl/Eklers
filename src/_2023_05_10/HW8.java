package _2023_05_10;

import java.util.regex.Pattern;

public class HW8 {
    /**
     * Дан двумерный массив строк, необходимо выбрать
     * все уникальные слова из массива и вернуть отсортированный
     * список слов в порядке убывания частоты их появления в массиве.
     */

    private static void m8() {
        String[][] words = {{"apple", "orange", "pear", "orange"},
                {"orange", "pear", "pear", "apple"},
                {"apple", "orange", "orange", "pear"},
                {"orange", "pear", "apple", "pear"}};

        //code....
    }


    /**
     * Есть двумерный массив строк, представляющий таблицу данных,
     * где первый столбец - это имена, а остальные столбцы -
     * это числовые значения. Вам нужно написать программу,
     * которая найдет среднее значение для каждого числового
     * столбца, игнорируя строки, которые не могут быть преобразованы в числа.
     */

    private static void m9() {
        String[][] data = {
                {"name1", "10", "20", "30"},
                {"name2", "40", "50", "not a number"},
                {"name3", "60", "70", "80"}
        };

        // Регулярное выражение для проверки, является ли строка числом
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        //code....
    }
}