package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import java.util.List;

public class Priority {

    private String value;
    List<String> legalValues = List.of("low","normal","high", "rush");

    public Priority(String value) {
        if (legalValues.contains(value))
            this.value = value;
        else
            throw new IllegalArgumentException("illegal value of priority " + value);
    }

    @Override
    public String toString() {
        return this.value;
    }

    private int index() {
        return legalValues.indexOf(this.value);
    }

    public boolean higherThan(Priority other) {
        return this.index() > other.index();
    }
}
