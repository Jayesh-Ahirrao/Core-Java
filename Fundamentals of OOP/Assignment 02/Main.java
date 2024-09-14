public class Main {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.displayWithFormat('.');

        d1.setDay(29);
        d1.setMonth(10);
        d1.setYear(1999);

        d1.displayWithFormat('/');
    }
}
