package Builder.basicSolution;

public class Client {

    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setName("Rahul");
        studentBuilder.setAge(24);
        studentBuilder.setPsp(90.1);
        studentBuilder.setPhoneNum("8756498743");
        studentBuilder.setUniName("IITB");

        Student student = new Student(studentBuilder);
        student.enroll();


    }
}
