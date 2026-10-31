package com.naocheda.guided.guided3;

public class Main {
    public static void main(String[] args) {
       Payable.logTransaction("sistem pembayaran diinisialisasi.");

       Payable[] items = new Payable[2];
       items[0] = new Invoice("RAM DDR 5 16 GB", 2, 2000000);
       items[1] = new SalariedEmployee("budi", 5000000);

       for (Payable item : items) {
           item.printReceipt();
       }

       Payable.logTransaction("Transaksi selesai diproses");
    }
}
