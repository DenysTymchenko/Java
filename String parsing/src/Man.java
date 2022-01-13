public class Man {
    private String name;
    private String position;
    private int age;
    private double height;

    public Man(String name, String position, String age, String height) {
        this.name = name;
        this.position = position;
        this.age = Integer.parseInt(age);
        this.height = Double.parseDouble(height);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
