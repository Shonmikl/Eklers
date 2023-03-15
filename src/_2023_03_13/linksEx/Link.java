package _2023_03_13.linksEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
@Getter
public class Link implements Comparable<Link> {
    String name;
    String colorType;
    String text;
    Page page;

    private final static Random RANDOM = new Random();

    public Page goToPage(Link link) {
        log();
        scan();
        return link.getPage();
    }

    private static void log() {
        System.out.println(RANDOM.nextInt(13));
    }

    private static void scan() {
        System.out.println(RANDOM.nextInt(13));
    }


    @Override
    public int compareTo(Link o) {
        return 0;
    }
}

class Page {
    String name;
    List<Link> list = new ArrayList<>();
}

class Main {
    public static void main(String[] args) {
        Link link = new Link
                ("Github", "Black", "TEXT", new Page());
//        link.goToPage(new Link())

    }
}


