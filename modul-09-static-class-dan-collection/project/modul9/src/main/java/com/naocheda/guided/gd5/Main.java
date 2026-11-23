package com.naocheda.guided.gd5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee("bobby", 3000));
        listEmp.add(new Employee("erick", 1600));
        listEmp.add(new Employee("rey", 2500));
        listEmp.add(new Employee("anna", 3500));

        System.out.println("Employee with salary minimal 3000");
        for (Employee e : listEmp) {
            if (e.getSalary() >= 3000) {
                System.out.println(e);
            }
        }

        System.out.println("Employee with salary minimal 3000");
        List<Employee> temp = listEmp.stream()
                .filter(e -> e.getSalary() >= 3000)
                .collect(Collectors.toList());
        temp.forEach(System.out::println);

        System.out.println("Employee erick");
        for (Employee e : listEmp) {
            if (e.getName().equals("erick")) {
                System.out.println(e);
            }
        }

        System.out.println("Employee erick");
        System.out.println(listEmp.stream()
                .filter(e -> e.getName().equals("erick"))
                .findFirst()
                .orElse(null));
    }
}
