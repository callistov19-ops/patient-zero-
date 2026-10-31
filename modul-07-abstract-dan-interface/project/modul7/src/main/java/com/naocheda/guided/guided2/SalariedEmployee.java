package com.naocheda.guided.guided2;

public class SalariedEmployee extends Employee implements Payable {
    private double weeklySalary;

    public SalariedEmployee(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }
}
