package com.perscholas;

public class Main {
    public static void main(String[] args) {

        Monster m1 = new FireMonster("r2u2");
        Monster m2 = new WaterMonster("r2u2");
        Monster m3 = new EarthMonster("r2u2");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new EarthMonster("a2b2");
        System.out.println(m1.attack());

        Monster m4 = new Monster("u2u2");
        System.out.println(m4.attack());
    }
}