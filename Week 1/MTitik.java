/**
  * File        : MTitik.java       22/02/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   :
  * Kelas yang berisi program utama untuk mengaplikasikan kelas Titik
*/
public class MTitik {
    public static void main(String[] args) throws Exception {
        Titik t1;
		Titik t2;
		Titik t3;
		
		t1 = new Titik();
		t1.setAbsis(1);
		t1.setOrdinat(2);
		System.out.println("Absis dan ordinat t1 : " + t1.getAbsis() + ", " + t1.getOrdinat());
		
		t2 = new Titik(5, 7);
		System.out.println("Absis dan ordinat t2 : " + t2.getAbsis() + ", " + t2.getOrdinat());
		
		t3 = new Titik();
		System.out.println("Absis dan ordinat t3 : " + t3.getAbsis() + ", " + t3.getOrdinat());

        System.out.println("Jumlah objek titik yang telah dibuat : " + Titik.getCounterTitik());
    }
}
