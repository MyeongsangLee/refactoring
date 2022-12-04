package me.whiteship.refactoring._18_middle_man._38_remove_middle_man;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void manager() {
        Person keesun = new Person("keesun");
        Person nick = new Person("nick");
        keesun.setDepartment(new Department("m365deploy", nick));

        Person manager = keesun.getDepartment().getManager();
        assertEquals(nick, manager);
    }

}