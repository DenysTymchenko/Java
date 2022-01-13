package HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet();
        names.add("Денис");
        names.add("Вова");
        names.add("Максим");
        names.add("Денис");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
