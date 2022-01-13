public class Months {
    public static void main(String[] args) {
        String[] months = {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь"
        };

        String name = months[10];

        switch (name) {
            case "Декабрь", "Январь", "Февраль": {
                System.out.println("Зима");
                break;
            }
            case "Март", "Апрель", "Май": {
                System.out.println("Весна");
                break;
            }
            case "Июнь", "Июль", "Август": {
                System.out.println("Лето");
                break;
            }
            default: {
                System.out.println("Осень");
                break;
            }
        }
    }
}
