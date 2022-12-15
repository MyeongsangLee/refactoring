package me.whiteship.refactoring._16_temporary_field._36_introduce_special_case;

public class UnknownCustomer extends Customer{

    public UnknownCustomer() {
        super("occupant", new BasicBillingPlan(), new NullPaymentHistory());
    }

    @Override
    public boolean isUnknown() {
        return true;
    }
}
