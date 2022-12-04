package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

public class Order {

    private String priorityValue;
    private Priority priority;

    public Order(String priority) {
        this.priorityValue = priority;
    }

    public Order(Priority priority) {
        this.priority = priority;
    }

    public String getPriorityValue() {
        return priorityValue;
    }

    public Priority getPriority() {
        return priority;
    }
}
