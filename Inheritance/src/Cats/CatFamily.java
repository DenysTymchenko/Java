package Cats;

public class CatFamily {
    private int ears;
    private int paws;
    private boolean bigClaws;


    public CatFamily(int ears, int paws, boolean bigClaws) {
        this.ears = ears;
        this.paws = paws;
        this.bigClaws = bigClaws;
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public void info() {
        System.out.println("Ears: " + ears + ". Paws: " + paws + ". Big claws: " + bigClaws);
    }

    public void eat() {
        System.out.println("Eating ");
    }
}
