package _2023_05_08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOex {
    public static void main(String[] args)  {
        try (FileReader fileReader = new FileReader("111.txt")) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
