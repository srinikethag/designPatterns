package Builder.usingLombok;

import lombok.Builder;

@Builder
public class LombokStudent {

    private final String name;
    private final int age;
    private final String uniName;
    private final double psp;
    private final String phoneNum;

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
