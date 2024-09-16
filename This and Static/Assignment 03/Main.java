

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.display();

        Date d2 = new Date(29, 10, 1999);
        d2.display();

        d2.getDate().display();

        d2.displayWithFormat('-');
        d2.displayWithFormat('/');
        d2.displayWithFormat('.');
    }
}
