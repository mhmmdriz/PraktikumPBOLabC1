/**
  * File        : MOperasiTitik.java       04/03/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   :
  * Kelas yang berisi program utama untuk mengaplikasikan kelas Titik dan kelas OperasiTitik
*/

public class MOperasiTitik {
    public static void main(String[] args) {
        Titik titikBaru1, titikBaru2;

        Titik titik1 = new Titik(4, 4);
        OperasiTitik o = new OperasiTitik();

		System.out.println("Titik : (" + titik1.getAbsis() + ", " + titik1.getOrdinat() + ")");
        titikBaru1 = o.refleksiX(titik1);
		System.out.println("Titik setelah refleksiX: (" + titikBaru1.getAbsis() + ", " + titikBaru1.getOrdinat() + ")");
        
        System.out.println("");
        
		System.out.println("Titik : (" + titik1.getAbsis() + ", " + titik1.getOrdinat() + ")");
        titikBaru2 = o.refleksiY(titik1);
		System.out.println("Titik setelah refleksiY : (" + titikBaru2.getAbsis() + ", " + titikBaru2.getOrdinat() + ")"); 
        
        System.out.println("");

        // karena refleksiX dan refleksiY mereturn titik baru, maka disini titik1 tidak terpengaruh oleh kedua 
        // method tersebut
        System.out.println("Titik : (" + titik1.getAbsis() + ", " + titik1.getOrdinat() + ")");
    }
}
