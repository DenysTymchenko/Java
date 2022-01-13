public class Main {
    public static void main(String[] args) {
        String s = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.";
        Man info = new Man(s.substring(4, 8), s.substring(54, 65), s.substring(14, 16), s.substring(32, 37));
        System.out.println(
                "Имя: " + info.getName() + "\n" +
                        "Должность: " + info.getPosition() + "\n" +
                        "Возраст: " + info.getAge() + "\n" +
                        "Рост: " + info.getHeight());
    }
}
