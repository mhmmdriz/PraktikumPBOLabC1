/**
  * File        : Programmer.java       03/05/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   : Kelas yang merepresentasikan seorang Programmer yang merupakan turunan dari kelas Pegawai
*/

package perusahaan;

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
