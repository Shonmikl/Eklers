package _2023_04_05;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    private String name;
    private int course;
    private char sex;
    private double avgGrade;
}
