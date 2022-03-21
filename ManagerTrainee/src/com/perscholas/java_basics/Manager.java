package com.perscholas.java_basics;

public class Manager extends Employee {
     Manager(long id, String name, String address, Long phone, double salary) {
        super(id, name, address, phone);
        basicSalary = salary;
    }

    public double calculateTransportAllowance() {
        return 0.15 * basicSalary;
    }
}
