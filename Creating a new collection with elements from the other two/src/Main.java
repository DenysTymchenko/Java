import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(28);
        numbers.add(31);
        numbers.add(89);
        numbers.add(64);
        numbers.add(21);
        numbers.add(0);
        numbers.add(19);
        numbers.add(40);
        numbers.add(32);

        ArrayList<String> names = new ArrayList<>();
        names.add("Андрей");
        names.add("Ваня");
        names.add("Кирилл");
        names.add("Антон");
        names.add("Соня");
        names.add("Витя");
        names.add("Костя");
        names.add("Катя");
        names.add("Оля");
        names.add("Дима");

        ArrayList<String> namesAndNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            namesAndNumbers.add(numbers.get(i) + " " + names.get(i));
        }
        for (String i : namesAndNumbers) {
            System.out.println(i);
        }

    }
}
