package com.company;

import javax.swing.text.NumberFormatter;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class InheritanceActivity {
    public static void main(String[] args) {
       Manager m =new Manager(126534, "Peter","Chennai India", 237844, 65000);
      double salary = m.calculateSalary();
       NumberFormat formatter = NumberFormat.getCurrencyInstance();
       System.out.println("Manager Salary = "+formatter.format(salary));
        double ta =m.calculateTransportAllowance();
        System.out.println("Manager transport allowance = " +formatter.format(ta));
        Trainee t = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        double traineeSalary =t.calculateSalary();
       double traineeTA= t.calculateTransportAllowance();
        System.out.println("Trainee salary = "+ formatter.format(traineeSalary));
        System.out.println("Trainee TA = "+ formatter.format(traineeTA));





    }
}
