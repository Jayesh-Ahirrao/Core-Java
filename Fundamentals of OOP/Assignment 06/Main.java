public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(102, "Employee 2", 12000000);

        e1.display();
        e2.display();

        Employee[] empArr = Employee.getNEmployees(5);

        for (Employee emp : empArr) {
            emp.display();
        }
    }

}
