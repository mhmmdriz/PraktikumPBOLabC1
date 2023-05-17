/**
  * File        : Lingkaran.java       17/05/23
  * Penulis     : Muhammad Rizki/24060121130086
  * Deskripsi   : implementasi Lingkaran sebagai BangunDatar
*/

package generic;

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
}
