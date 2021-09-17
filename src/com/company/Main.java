package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String veta = sc.nextLine();
        String[] pole = veta.split("");
        int soucet = 0;
        for (String i : pole) {
            if (i.equals ("ahoj")) soucet++;
        }
        System.out.println(soucet);

















    }
}
