package demo_0416_abstract;

/*
    *@version :04_16_abstract
    *@author: minglang
 */

public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
