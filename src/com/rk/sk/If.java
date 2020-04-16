package com.rk.sk;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class If {
    public static void mainIf(String[] args) {
        double Grade = 92.0;

        if (Grade >= 90) {
            System.out.println("Sempurna!");
        } else if (Grade < 90) {
            System.out.println("Sangat Baik!");
        } else if (Grade < 80) {
            System.out.println("Pembelajar!");
        } else {
            System.out.println("Maaf, Kamu Gagal!");
        }
        System.out.println("\n");
    }
}
