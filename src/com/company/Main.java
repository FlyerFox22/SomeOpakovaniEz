package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String veta = sc.nextLine();
        int a = 0;
        int b = 0;
        String[] pole = veta.split("");
        int soucet = 0;
        for (String i : pole) {
            if (i.equals ("ahoj")) soucet++;
        }
        System.out.println(soucet);
        if (a + b < 5) {
            System.out.println("Je to víc jak 5!");
        }
        else {
            System.out.println("Není to víc jak 5!");
        }

















    }
}
