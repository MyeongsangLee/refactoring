package me.whiteship.refactoring._10_data_clumps;

import me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value.TelephoneNumber;

public class Office {

    private String location;

    private TelephoneNumber officePhoneNumber;

    public Office(String location, TelephoneNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }

    public String officePhoneNumber() {
        return officePhoneNumber.toString();
    }

    public TelephoneNumber getOfficePhoneNumber() {
        return officePhoneNumber;
    }
}
