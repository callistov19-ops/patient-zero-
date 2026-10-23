package com.naocheda.guided.guided2;

public class Manager extends Employee {
    private String alamat;

    public Manager(String nama, String alamat){
        super(nama);
        this.alamat = alamat;
    }

    public void tampilkanInformasi(){
        super.tampilNama();
        System.out.println("alamat: "+  alamat);
        System.out.println("departemen: "+ super.departemen);
    }
}
