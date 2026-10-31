package com.naocheda.guided.guided3;

public abstract class Employee implements Payable {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //setiap pegawai fix ada gaji tapi beda rumus
    public abstract double earnings();

    //saat ada billing langsung alihkan ke metode ngitung gaji (eearnings)
    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
