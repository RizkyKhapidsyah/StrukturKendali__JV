package com.rk.sk;

public class LabeledContinue {
    public static void mainLcontinue(String[] args) {

        outerLoop:

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Inside for(j) loop"); //message1
                if (j == 2) continue outerLoop;
            }

            System.out.println("Inside for(i) loop"); //message2
        }

        System.out.println("\n");
    }
}
