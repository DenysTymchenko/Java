public class Main {
    static boolean answer = false;

    public static void main(String[] args) {
        int random = (int) (Math.random() * 1000000);
        System.out.println(random);

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    double seconds = 0;
                    while (!answer) {
                        System.out.println(seconds);
                        seconds += 0.1;
                        Thread.sleep(1);
                    }
                } catch (Exception e) {

                }
            }
        });
        timer.start();

        Thread findRandom = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (!answer) {
                        int botRandom = (int) (Math.random() * 900000 + 100000);
                        if (botRandom == random) {
                            System.out.println(botRandom);
                            answer = true;
                        }
                    }
                } catch (Exception e) {

                }
            }
        });
        findRandom.start();
    }
}

