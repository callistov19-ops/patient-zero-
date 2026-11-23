package com.naocheda.guided.gd1;

public class Share {
    private int privateInt;
    private static int staticInt;

    public Share(int pr, int si) {
        privateInt = pr;
        staticInt = si;
    }

    @Override
    public String toString() {
        return privateInt + " " + staticInt;
    }
}
