/**
  * File        : MBujurSangkar.java       29/03/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   : Kelas yang mengimplementasikan cara emnghitung luas bujur sangkar
*/
import java.util.Scanner;

public class MBujurSangkar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BujurSangkar bs = new BujurSangkar();
    System.out.print("Masukkan sisi bujur sangkar : ");
    double sisi = scan.nextDouble();
    scan.close();
    System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
  }
}
