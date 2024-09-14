public class Main {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student(101, "Student 2", 5);
        Student student03 = new Student(102, "Student 3", 5 , new int[] {100, 100, 100, 100, 100});

        student01.display();
        student02.display();
        student03.display();
    }
}
