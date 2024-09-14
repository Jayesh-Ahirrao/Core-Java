public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.display();

        System.out.println("After changes through setters");

        p1.setX(10);
        p1.setY(20);

        p1.display();
    }
}
