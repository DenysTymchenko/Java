public class WorkWithArray {
    public static int biggest(int[] array) {
        int biggest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
        }
        return biggest;
    }

    public static int lowest(int[] array) {
        int lowest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }
        return lowest;
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j != array.length - 1 && array[j] > array[j + 1]) {
                    int remember = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = remember;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
