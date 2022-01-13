package TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Яна");
        names.add("Дима");
        names.add("Вова");
        names.add("Антон");
        names.add("Дима");

        for (String name : names) {
            System.out.println(name);
        }

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
