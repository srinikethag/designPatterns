package Builder.basicSolution;

public class Student {

    private final String name;
    private final int age;
    private final String uniName;
    private final double psp;
    private final String phoneNum;

    public Student(StudentBuilder studentBuilder) {

        // validations
        if (studentBuilder.getAge() == 0) {
            throw new IllegalArgumentException("Age is invalid");
        }

        if (studentBuilder.getPsp() < 0) {
            throw new IllegalArgumentException("Negative psp is not allowed");
        }

        this.name = studentBuilder.getName();
        this.age = studentBuilder.getAge();
        this.uniName = studentBuilder.getUniName();
        this.psp = studentBuilder.getPsp();
        this.phoneNum = studentBuilder.getPhoneNum();
    }

    public void enroll() {
        System.out.println("Enrolling the student with the following details " + this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", uniName='" + uniName + '\'' +
                ", psp=" + psp +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
