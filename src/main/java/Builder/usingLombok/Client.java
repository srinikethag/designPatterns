package Builder.usingLombok;

public class Client {

    public static void main(String[] args) {

        LombokStudent student = LombokStudent.builder()
                .name("Rahul")
                .age(24)
                .psp(90.1)
                .phoneNum("8756498743")
                .uniName("IITB")
                .build();

        student.enroll();


    }
}
