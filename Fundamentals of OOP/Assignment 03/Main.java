public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.display();

        System.out.println("After changes through setters");

        b1.setBreadth(10);
        b1.setDepth(20);
        b1.setLength(30);

        b1.display();

        System.out.println("Volume: " + b1.calVolume());
    }
}
