public class Array {
    public static void main(String[] args) {
        int[] first = new int[900];
        for (int i = 0; i < first.length; i++) {
            first[i] = 100 + i;
        }

        int[] second = new int[first.length];
        for (int i = 0, j = first.length - 1; i < first.length; i++, j--) {
            second[i] = first[j];
        }
        for (int i : second) {
            System.out.println(i);
        }

    }
}
