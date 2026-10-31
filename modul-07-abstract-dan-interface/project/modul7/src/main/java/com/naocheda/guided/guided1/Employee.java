package com.naocheda.guided.guided1;

public abstract class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //setiap pegawai fix ada gaji tapi beda rumus
    public abstract double earnings();
}
