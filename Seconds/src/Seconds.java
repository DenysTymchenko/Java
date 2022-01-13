public class Seconds {
    public static void main(String[] args) {
        int TotalSeconds = 500000;
        int days = TotalSeconds / 86400;
        int hours = (TotalSeconds - (days * 86400)) / 3600;
        int minutes = (TotalSeconds - ((days * 86400) + (hours * 3600))) / 60;
        int seconds = TotalSeconds - ((days * 86400) + (hours * 3600) + (minutes * 60));

        System.out.println(TotalSeconds + " секунд это:");
        System.out.println(days + " дней");
        System.out.println(hours + " часов");
        System.out.println(minutes + " минут");
        System.out.println(seconds + " секунд");
    }
}
