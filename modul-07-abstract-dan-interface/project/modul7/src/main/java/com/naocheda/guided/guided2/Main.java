package com.naocheda.guided.guided2;

public class Main {
    public static void main(String[] args) {
        Payable[] items = new Payable[2];

        items[0] = new Invoice("monitor LED", 2, 1500000);
        items[1] = new SalariedEmployee("budi", 5000000);

        for (Payable item : items) {
            System.out.println("jumlah yang perlu dibayar: Rp" + item.getPaymentAmount());
        }
    }
}
