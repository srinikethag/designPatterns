package Builder.productionReady;

public class Client {

    public static void main(String[] args) {

        Student student = Student.getBuilder()
                .setName("Rahul")
                .setAge(24)
                .setPsp(90.1)
                .setPhoneNum("8756498743")
                .setUniName("IITB")
                .build();

        student.enroll();
    }
}
