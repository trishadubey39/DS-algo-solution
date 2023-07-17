package Main;

import java.util.*;

class Main {
    private String mString;

    public int getStringLength() {
        return mString.length();
    }

    public static void main(String args[]) {
        Main m = new Main();
        System.out.println("String length: " + m.getStringLength());
    }
}