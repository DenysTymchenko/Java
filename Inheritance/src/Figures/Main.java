package Figures;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(12,6.5);
        System.out.println(rect.S());

        Triangle triangle = new Triangle(10,5,8);
        System.out.println(triangle.S());
    }
}