package com.naocheda.guided.guided3;

public interface Payable {
    double getPaymentAmount();

    default void printReceipt() {
        System.out.println("Struk resmi - total: Rp" + getPaymentAmount());
    }

    static void logTransaction(String message){
        System.out.println("[AUUDIT LOG] " + message);
    }
}
