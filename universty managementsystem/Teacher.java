public class Teacher extends Person {
    private String teacherId;
    private double salary;

    public Teacher(String name, int age, String cnic, String teacherId, double salary) {
        super(name, age, cnic);
        this.teacherId = teacherId;
        this.salary = salary;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("----- Teacher -----");
        System.out.println("Name: " + getName() + " | ID: " + teacherId);
        System.out.println("Age: " + getAge() + " | Salary: " + salary);
    }
}