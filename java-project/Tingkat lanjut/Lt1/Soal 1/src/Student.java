public class Student {

    private String name;
    private int age;
    private boolean gpa;

    public Student(String name, int age, boolean gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void display() {
        System.out.println("Name :" + this.name);
        System.out.println("Name :" + this.age);
        System.out.println("Name :" + this.gpa);
        System.out.println("");
    }
}
