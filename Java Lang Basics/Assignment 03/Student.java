public class Student {
    private  int rollNumber;
    private  String name;
    private  int numberOfSubjects;
    private  int [] marks;

    public Student(){
        rollNumber = 1;
        name = "Student";
        numberOfSubjects = 2;
        marks = new int[numberOfSubjects];
    }

    public Student(int rollNumber, String name, int numberOfSubjects, int[] marks){
        this.rollNumber = rollNumber;
        this.name = name;
        this.numberOfSubjects = numberOfSubjects;
        this.marks = new int[numberOfSubjects];

        // System.arraycopy(marks, 0, this.marks, 0, this.marks.length);
        for(int i = 0 ; i < this.marks.length; i++){
            this.marks[i] = marks[i];
        }
    }

    public Student(int rollNumber, String name, int numberOfSubjects){
        this.rollNumber = rollNumber;
        // Unless an explicit copy of original is needed, use of this constructor is unnecessary since Strings are immutable.
        // this.name = new String(name);
        this.name = name;
        this.numberOfSubjects = numberOfSubjects;
        this.marks = new int[numberOfSubjects];
    }

    public void display(){
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Number of Subjects: " + numberOfSubjects);
        System.out.print("Marks: ");
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println("\n");
    }
}
