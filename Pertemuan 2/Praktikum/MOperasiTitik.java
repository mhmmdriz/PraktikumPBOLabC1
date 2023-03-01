/**
  * File        : MOperasiTitik.java       01/03/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   :
  * Kelas yang berisi program utama untuk mengaplikasikan kelas Titik dan kelas OperasiTitik
*/

public class MOperasiTitik {
    public static void main(String[] args) {
        Titik titik1 = new Titik(4, 4);
        OperasiTitik o = new OperasiTitik();

		System.out.println("Titik : " + titik1.getAbsis() + ", " + titik1.getOrdinat());
        
        o.refleksiSumbuX(titik1);
		System.out.println("Titik setelah refleksiX: " + titik1.getAbsis() + ", " + titik1.getOrdinat());
        
        o.refleksiSumbuY(titik1);
		System.out.println("Titik setelah refleksiY : " + titik1.getAbsis() + ", " + titik1.getOrdinat()); 
    }
}
