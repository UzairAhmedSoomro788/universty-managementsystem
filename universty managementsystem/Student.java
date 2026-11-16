import java.util.ArrayList;

public class Student extends Person {
    private String studentId;
    private String department;
    private ArrayList<String> courses;

    public Student(String name, int age, String cnic, String studentId, String department) {
        super(name, age, cnic);
        this.studentId = studentId;
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void enrollCourse(String course) {
        courses.add(course);
        System.out.println("Enrolled in: " + course);
    }

    @Override
    public void displayInfo() {
        System.out.println("----- Student -----");
        System.out.println("Name: " + getName() + " | ID: " + studentId);
        System.out.println("Age: " + getAge() + " | Dept: " + department);
        System.out.println("Courses: " + courses);
    }
}