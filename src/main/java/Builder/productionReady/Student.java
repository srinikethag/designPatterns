package Builder.productionReady;

public class Student {

    private final String name;
    private final int age;
    private final String uniName;
    private final double psp;
    private final String phoneNum;

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    private Student(StudentBuilder studentBuilder) {

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

    // static inner class
    public static class StudentBuilder {

        private String name;
        private int age;
        private String uniName;
        private double psp;
        private String phoneNum;

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public StudentBuilder setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        public String getUniName() {
            return uniName;
        }

        public StudentBuilder setUniName(String uniName) {
            this.uniName = uniName;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
