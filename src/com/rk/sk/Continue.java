package com.rk.sk;

public class Continue {
    public static void mainContinue(String[] args) {
        int i;

        String NamaNama[] = {
                "Rizky Khapidsyah",
                "Ahmad Agusni",
                "Fadlan Naibaho",
                "Muhammad Fauzi",
                "Kenniko Irman",
                "Tita Febriani",
                "Nurhanifah",
                "Ibnul Hakim"
        };

        int Jumlah = 0;

        for (i = 0; i < NamaNama.length; i++) {
            if (!NamaNama[i].equals("Nurhanifah")) {
                continue; //Lompat ke statemen selanjutnya
            }
            Jumlah++;
        }

        System.out.println("There are " + Jumlah + " Nurhanifah in the list");
        System.out.println("\n");
    }
}
