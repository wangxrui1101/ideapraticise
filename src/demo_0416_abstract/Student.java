package demo_0416_abstract;

/*
    *@version :0416_abstract_student
    * @author:minglang
 */

public class Student extends Person{
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
    public String getDescription(){
        return "a Student majoring in"+major;
    }
}
