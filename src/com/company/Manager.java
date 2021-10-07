package com.company;

public class Manager extends Employee {

    double salary;

    public Manager(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone, salary);
    }

    @Override
    public double calculateTransportAllowance() {
        double transportAllowance;
        transportAllowance = 15 * getBasicSalary()/ 100;
        return transportAllowance;
    }
}

