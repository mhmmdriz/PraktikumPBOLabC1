/**
  * File        : Manajer.java       03/05/23
  * Penulis     : Muhammad Rizki/24060121130086
  * Deskripsi   : Kelas yang merepresentasikan seorang Manajer yang merupakan turunan dari kelas Pegawai
*/

package perusahaan;

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
