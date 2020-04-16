package com.rk.sk;

public class Break {

    public static void mainBreak(String[] args) {
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

        String cariNama = "Nurhanifah";
        boolean namaDitemukan = false;

        for (i = 0; i < NamaNama.length; i++) {
            if (NamaNama[i].equals(cariNama)) {
                namaDitemukan = true;
                break;
            }
        }

        if (namaDitemukan) {
            System.out.println(cariNama + " ditemukan!");
        } else {
            System.out.println(cariNama + " tidak ditemukan!");
        }

        System.out.println("\n");
    }
}
