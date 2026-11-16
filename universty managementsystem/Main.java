import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        courses.add(new Course("CS101", "Programming Fundamentals", 3));
        courses.add(new Course("CS201", "Object Oriented Programming", 3));
        courses.add(new Course("CS301", "Data Structures", 3));

        int choice = -1;
        while (choice != 0) {
            System.out.println("\n==== UNIVERSITY MANAGEMENT SYSTEM ====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Show All Students");
            System.out.println("4. Show All Teachers");
            System.out.println("5. Show All Courses");
            System.out.println("6. Enroll Student in Course");
            System.out.println("7. Search Student by ID");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Please enter a number!");
                sc.nextLine();
                continue;
            }

            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                addTeacher();
            } else if (choice == 3) {
                if (students.isEmpty()) {
                    System.out.println("No Students Found!");
                } else {
                    for (Student s : students) {
                        s.displayInfo();
                    }
                }
            } else if (choice == 4) {
                if (teachers.isEmpty()) {
                    System.out.println("No Teachers Found!");
                } else {
                    for (Teacher t : teachers) {
                        t.displayInfo();
                    }
                }
            } else if (choice == 5) {
                for (Course c : courses) {
                    c.showCourse();
                }
            } else if (choice == 6) {
                enrollStudent();
            } else if (choice == 7) {
                searchStudent();
            } else if (choice == 0) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    static void addStudent() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("CNIC: ");
        String cnic = sc.nextLine();
        System.out.print("Student ID: ");
        String id = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();
        students.add(new Student(name, age, cnic, id, dept));
        System.out.println("Student Added Successfully!");
    }

    static void addTeacher() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("CNIC: ");
        String cnic = sc.nextLine();
        System.out.print("Teacher ID: ");
        String id = sc.nextLine();
        System.out.print("Salary: ");
        double sal = sc.nextDouble();
        sc.nextLine();
        teachers.add(new Teacher(name, age, cnic, id, sal));
        System.out.println("Teacher Added Successfully!");
    }

    static void enrollStudent() {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                System.out.println("Available Courses:");
                for (Course c : courses) {
                    c.showCourse();
                }
                System.out.print("Enter Course Name: ");
                String cn = sc.nextLine();
                s.enrollCourse(cn);
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    static void searchStudent() {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                s.displayInfo();
                return;
            }
        }
        System.out.println("Student Not Found!");
    }
}