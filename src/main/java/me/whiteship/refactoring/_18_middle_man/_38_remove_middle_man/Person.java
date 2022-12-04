package me.whiteship.refactoring._18_middle_man._38_remove_middle_man;

public class Person {

    private String name;

    private Department department;

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

//    Person getManager() {
//        return getDepartment().getManager();
//    }
}
