package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

public class Client1 extends ReadingClient{

    double baseCharge;

    public Client1(Reading reading) {
        this.baseCharge = enrichReading(reading).baseRate();
    }

    public double getBaseCharge() {
        return baseCharge;
    }
}
