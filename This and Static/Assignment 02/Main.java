public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Harry Potter and the chamber of secrets");
        b2.setPrice(29631.0f);

        b1.display();
        b2.display();
    }
}
