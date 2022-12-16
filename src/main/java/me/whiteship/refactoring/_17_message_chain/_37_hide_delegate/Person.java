package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

public class Person {

    private String name;

    private Department department;
    private Person manager;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    //추가
    public Person getManager() {
        return getDepartment().getManager();
    }
}
