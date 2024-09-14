class Employee {
    private int employee_id;
    private String employee_name; // ref - null
    private int salary;

    public Employee() {
        employee_id = 101;
        employee_name = "Employee";
        salary = 50000;
    }

    public Employee(int employee_id, String employee_name, int salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Id: " + employee_id);
        System.out.println("Employee Name: " + employee_name);
        System.out.println("Employee Salary: " + salary);
    }

    public static  Employee[] getNEmployees(int size) {
        Employee emp[] = new Employee[size];

        for (int i = 0; i < size; i++) {
            emp[i] = new Employee(i, ("employee ".concat(Integer.toString(i))), (100000 * i));
        }

        return emp;
    }
}