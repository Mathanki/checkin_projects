public class Student extends Person implements Studyable {

    private String major;

    public Student() {
    }
    public Student(String firstName, String lastName, int age, String major) {
        super(firstName, lastName, age);
        this.major = major;

    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getFullName());
        System.out.println("Age: " + getAge());
        System.out.println("Major: " + major);
    }

    @Override
    public void describeStudy() {
        System.out.println("I am studying " + major);
    }
}
