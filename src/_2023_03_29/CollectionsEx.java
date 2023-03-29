package _2023_03_29;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsEx {
    public static void main(String[] args) {
        Map<Emp, Integer> map = new TreeMap<>();
        map.put(new Emp("Nikolay", 25), 2500);
        map.put(new Emp("Sem", 26), 3500);
        map.put(new Emp("Olga", 25), 3000);
        map.put(new Emp("Mikhail", 38), 12500);
        map.put(new Emp("Sergey", 25), 4100);
        map.put(new Emp("Roma", 29), 2250);

        //{Olga=3000, Roma=2250, Sem=3500, Mikhail=12500, Sergey=4100, Nikolay=2500}

        System.out.println(map);
    }
}

@ToString
@AllArgsConstructor
class Emp implements Comparable<Emp>{
    String name;
    int age;

    //o1.compareTo(o2)
    @Override
    public int compareTo(Emp o) {
        return this.age == o.age ? this.name.compareTo(o.name) : this.age - o.age;
    }
}
