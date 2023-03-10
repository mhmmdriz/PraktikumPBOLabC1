/**
  * File        : MPoligon.java       10/03/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   : driver class untuk poligon, persegi panjang, dan segitiga
*/
package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang " + persegi.hitungLuas());
        
        System.out.println();

        Segitiga segitiga = new Segitiga(5, 4, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga " + segitiga.hitungLuas());
    }
}
