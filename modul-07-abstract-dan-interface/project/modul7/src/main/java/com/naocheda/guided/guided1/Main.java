package com.naocheda.guided.guided1;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salaried = new SalariedEmployee("budi", 1000.0);
        System.out.println("Name: " + salaried.getName());
        System.out.println("Earnings: " + salaried.earnings());
    }
}
