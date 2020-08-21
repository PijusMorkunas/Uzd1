package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
// Metodas ivesti ir indeksas 2 atrodo nereikalingi
        System.out.println("Iveskite kelis zodizus");
        String sakinys = sc.next();
        ivesti(sakinys);
        int indeksas1 = 0;
//        int indeksas2 = sakinys.length(); // pakeisti
        String z1 = sakinys.substring(indeksas1);
        System.out.println("Pirmas sakinio žodis: " + z1 + ".");
    }

    private static String ivesti(String sakinys) {
        return sakinys;
    }

}