package com.naocheda.guided.guided3;

public class Main {
    public static void main(String[] args) {
        Lagu d,e;
        d = new Lagu();
        e = new Lagu();

        d.isiParam("Lagu 1");
        e.isiParam("Lagu 2", "aku");
        
        d.tampilkanLagu();
        e.tampilkanLagu();
    }
}
