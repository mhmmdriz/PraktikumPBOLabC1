/**
  * File        : PegawaiDanGaji.java       03/05/23
  * Penulis     : Muhammad Rizki/24060121130086
  * Deskripsi   : Driver class untuk mengimplementasikan kelas Pegawai, Manajer, Programmer, Payroll
*/

package perusahaan;

public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai1 = new Manajer("Joko");
        Pegawai pegawai2 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai1);
        payroll.cetakGaji(pegawai2);
    }
}
