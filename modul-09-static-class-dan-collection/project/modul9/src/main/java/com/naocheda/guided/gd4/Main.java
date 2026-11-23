package com.naocheda.guided.gd4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee("bobby", 3000));
        listEmp.add(new Employee("erick", 1600));
        listEmp.add(new Employee("rey", 2500));
        listEmp.add(new Employee("anna", 3500));

        Collections.sort(listEmp);
        System.out.println("Sorted by name");
        listEmp.forEach(System.out::println);

        Collections.sort(listEmp, new SalaryComparator());
        System.out.println("Sorted by salary");
        listEmp.forEach(System.out::println);
    }
}
