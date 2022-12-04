package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public class TelephoneNumber {
    private String areaCode;
    private String number;

    public TelephoneNumber(String officeAreaCode, String number) {
        this.areaCode = officeAreaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.areaCode + " " + this.number;
    }
}