public abstract class Person {
    private String name;
    private int age;
    private String cnic;

    public Person(String name, int age, String cnic) {
        this.name = name;
        this.age = age;
        this.cnic = cnic;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCnic() {
        return cnic;
    }

    public abstract void displayInfo();
}