/**
  * File        : BangunDatarGenericTest.java       17/05/23
  * Penulis     : Muhammad Rizki/24060121130086
  * Deskripsi   : main class untuk generic bangun datar
*/

package generic;

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());
    }
}
