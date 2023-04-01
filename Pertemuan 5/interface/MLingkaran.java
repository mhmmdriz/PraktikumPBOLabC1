/**
 * File        : MLingkaran.java       29/03/23
 * Penulis     : Muhammad Rizki
 * Deskripsi   : Implementasi cara menghitung luas lingkaran
 */

import java.util.Scanner;
public class MLingkaran {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

		System.out.print("Masukkan jari-jari lingkaran : ");
        double jari2 = scan.nextDouble();

    	Lingkaran l = new Lingkaran(jari2);
		System.out.println("Luas lingkaran dengan jari-jari " + jari2 + " satuan adalah " + l.hitungLuas());

        scan.close();
	}
}
