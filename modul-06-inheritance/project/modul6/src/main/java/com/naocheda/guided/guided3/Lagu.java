package com.naocheda.guided.guided3;

public class Lagu {
    String pencipta;
    String judul;

    void isiParam(String param1){
        judul = param1;
        pencipta = "tidak dikenal";
    }

    void isiParam(String param1, String param2){
        judul = param1;
        pencipta = param2;
    }

    void tampilkanLagu(){
        System.out.println("Judul lagu: " + judul + ", pencipta: " + pencipta);
    }
}
