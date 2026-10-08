package guided.guided1.main;

import guided.guided1.manusia.Manusia;

public class Main {
    public static void main(String[] args) {
        Manusia arrMns[] = new Manusia[3];

        // cons pertama
        Manusia objMns1 = new Manusia();

        // cons kedua (HAPUS 'nama:')
        Manusia objMns2 = new Manusia("john");

        // cons ketiga (TAMBAH '/' dan HAPUS 'nama:' serta 'umur:')
        Manusia objMns3 = new Manusia("jawir", 44);

        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;

        for (int i = 0; i < 3; i++) {
            System.out.println("Nama: " + arrMns[i].getNama());
            System.out.println("Umur: " + arrMns[i].getUmur());
            System.out.println();
        }
    }
}