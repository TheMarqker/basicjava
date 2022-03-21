package com.perscholas.java_basics;

public class InheritanceActivity {
    private static void testCaseOne() {
        Manager peter = new Manager(126534, "Peter", "Chennai India", 237844L, 65000D);
        System.out.println("Peter Salary " + peter.calculateSalary());
        System.out.println("Peter's Allowance " + peter.calculateTransportAllowance() + "\n");
    }

    private static void testCaseTwo() {
        Trainee jack = new Trainee(29846, "Jack", "Mumbai India", 442085L, 45000D);
        System.out.println("Jack Salary " + jack.calculateSalary());
        System.out.println("Jack's Allowance " + jack.calculateTransportAllowance());
    }

    public static void main(String[] args) {
        testCaseOne();
        testCaseTwo();
    }
}