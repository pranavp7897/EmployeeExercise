package com.company;

public class Employee {

    //fields
    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private long employeePhone;
    private double basicSalary;
    final double specialAllowance = 250.80;
    final double hra = 1000.50;


    public Employee() {
    }

    public Employee(long id, String name, String address, long phone, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
        this.basicSalary = salary;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public long getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(long employeePhone) {
        this.employeePhone = employeePhone;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getSpecialAllowance() {
        return specialAllowance;
    }

    public double getHra() {
        return hra;
    }

    public double calculateSalary() {

        double calculatedSalary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary *
                hra / 100);
        return calculatedSalary;
    }
    public double calculateTransportAllowance(){
        double transportAllowance = 10*basicSalary/100;
        return  transportAllowance;

    }

}
