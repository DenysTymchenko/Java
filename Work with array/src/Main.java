public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 22, 13, 1, 0};

        System.out.println(WorkWithArray.biggest(arr));
        System.out.println(WorkWithArray.lowest(arr));
        System.out.println(WorkWithArray.average(arr));
        WorkWithArray.sort(arr);
    }
}
