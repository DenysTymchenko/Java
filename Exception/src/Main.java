public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            for (int i = 0; i <= 10; i++) {
                array[i] = i;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }
}
