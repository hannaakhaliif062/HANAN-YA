
public class Student {

    // Private fields - Encapsulation
    private String studentId;
    private String name;
    private int age;
    private String department;
    private double gpa;

    // university name
    private static String universityName = "JAMHURIYA University";

    // Constructor
    public Student(String studentId, String name, int age,
                   String department, double gpa) {

        this.studentId = studentId;
        this.name = name;
        this.department = department;

        // Age validation
        if (age >= 18 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be between 18 and 100.");
            this.age = 18;
        }

        // GPA validation
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA. GPA must be between 0.0 and 4.0.");
            this.gpa = 0.0;
        }
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getGpa() {
        return gpa;
    }

    // Setter for GPA with validation
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println(
                    "Invalid GPA. GPA must be between 0.0 and 4.0."
            );
        }
    }

    // Display student information
    public void displayStudentInfo() {
        System.out.println("University: " + universityName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
        System.out.println("Status: " + (hasPassed() ? "Passed" : "Failed"));
    }

    // Check whether student has passed
    public boolean hasPassed() {
        return gpa >= 2.0;
    }

    // Main method
    public static void main(String[] args) {

        // Create four Student objects
        Student student1 = new Student(
                "C6240368",
                "Hanan khaliif",
                19,
                "Networking and security",
                3.25
        );

        Student student2 = new Student(
                "C6240200",
                "anisa",
                22,
                "Computer Science",
                1.85
        );

        Student student3 = new Student(
                "C6240386",
                "Aliya Hussen",
                21,
                "Networking and security",
                3.75
        );

        Student student4 = new Student(
                "C6240099",
                "Maryan Omar",
                20,
                "Networking and security",
                2.10
        );

        // Display Student 1
        System.out.println("===== STUDENT 1 =====");
        student1.displayStudentInfo();

        // Display Student 2
        System.out.println("\n===== STUDENT 2 =====");
        student2.displayStudentInfo();

        // Display Student 3
        System.out.println("\n===== STUDENT 3 =====");
        student3.displayStudentInfo();

        // Display Student 4
        System.out.println("\n===== STUDENT 4 =====");
        student4.displayStudentInfo();

        // Demonstrate GPA validation
        System.out.println("\n===== GPA VALIDATION =====");

        student1.setGpa(4.0);

        System.out.println(
                "Student 1 updated GPA: " + student1.getGpa()
        );

        // Invalid GPA
        student2.setGpa(5.0);

        // Demonstrate pass/fail
        System.out.println("\n===== PASS/FAIL STATUS =====");

        System.out.println(
                "Student 1 passed: " + student1.hasPassed()
        );

        System.out.println(
                "Student 2 passed: " + student2.hasPassed()
        );

        System.out.println(
                "Student 3 passed: " + student3.hasPassed()
        );

        System.out.println(
                "Student 4 passed: " + student4.hasPassed()
        );
    }
}