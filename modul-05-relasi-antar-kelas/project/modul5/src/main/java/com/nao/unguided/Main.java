package com.nao.unguided;

public class Main {
    public static void main(String[] args){
       //siapin kasir
       Kasir kasirBudi = new Kasir("Budi");

       //siapin item yang diorder
       ItemPesanan kopi = new ItemPesanan("Iced Americano", 18000.0);
       ItemPesanan roti = new ItemPesanan("Beef Croissant", 25000.0);
       ItemPesanan teh = new ItemPesanan("Matcha Latte", 22000.0);

       //siapin nampan untuk meja no 4 (kapasitass di set 5)
       Pesanan pesananMeja4 = new Pesanan(4,5);

       //masukin barang ke nampan (agregaasi)
       pesananMeja4.tambahItem(kopi);
       pesananMeja4.tambahItem(roti);
       pesananMeja4.tambahItem(teh);

       //show list orderan sementara
       pesananMeja4.tampilkanPesanan();

       //kasihh nampan ke kasir buat diitung totalnya
       kasirBudi.prosesPembayaran(pesananMeja4);
    }
}
