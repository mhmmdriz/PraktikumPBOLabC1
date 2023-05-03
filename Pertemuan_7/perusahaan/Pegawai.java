/**
  * File        : Pegawai.java       03/05/23
  * Penulis     : Muhammad Rizki/24060121130086
  * Deskripsi   : Kelas yang merepresentasikan seorang pegawai
*/

package perusahaan;

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok);
    }
}
