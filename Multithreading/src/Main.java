public class Main {
    static boolean isFive = false;

    public static void main(String[] args) {
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int seconds = 0;
                    while (true) {
                        if (seconds == 5) {
                            isFive = true;
                        }
                        System.out.println(seconds);
                        Thread.sleep(1000);
                        seconds++;
                    }
                } catch (Exception e) {

                }
            }
        });
        timer.start();

        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int seconds = 0;
                    while (!isFive) {
                        System.out.println(seconds);
                        Thread.sleep(1000);
                        seconds++;
                    }
                } catch (Exception e) {

                }
            }
        });
        timer2.start();
    }
}
