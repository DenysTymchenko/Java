package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Денис");
        employees.add("Никита");
        employees.add("Давид");
        employees.add("Дима");
        employees.add("Женя");

        employees.remove("Женя");
        employees.remove(0);

        System.out.println("Список сотрудников:");
        for (String name : employees) {
            System.out.println(name);
        }

        int index = 1;
        System.out.println("Под индексом " + index + " находится сотрудник - " + employees.get(index));
        System.out.println("Количество сотрудников: " + employees.size());
    }
}
