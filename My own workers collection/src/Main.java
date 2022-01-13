public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Денис");
        employees.add("Никита");
        employees.add("Дима");
        employees.add("Давид");
        employees.add("Руслан");
        employees.add("Влад");

        employees.remove("Влад");
        employees.remove("Руслан");

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
