package com.rk.sk;

public class Switch {
    public static void mainSwitch(String[] args) {
        int Grade = 92;

        switch (Grade){
            case 100:
                System.out.println("Sempurna!");
                break;
            case 90:
                System.out.println("Sangat Baik!");
                break;
            case 80:
                System.out.println("Pembelajar!");
                break;
            default:
                System.out.println("Maaf, Kamu Gagal!");
                break;
        }

        System.out.println("\n");
    }
}