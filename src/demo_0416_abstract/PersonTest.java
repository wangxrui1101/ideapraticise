package demo_0416_abstract;

/*
    *@version:0416_abstract
    *@author:minglang
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people=new Person[2];
        //可以定义一个抽象类对象，但该类对象的具体内容必须是非抽象子类
        people[0]=new Employee("zhangsan",5000,2012,7,5);
        people[1]=new Student("lisan","yuwen");
        for (Person p:people){
            System.out.println(p.getName()+","+p.getDescription());
        }
    }
}
