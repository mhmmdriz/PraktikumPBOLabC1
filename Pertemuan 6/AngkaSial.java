/** 
 * File         : AngkaSial.java       01/04/2023
 * Penulis      : Muhammad Rizki
 * Deskripsi    : Program penggunaan exception buatan sendiri
                  Pengenalan klausa 'throw' dan 'throws'
*/
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
        System.out.println("tesssssssssssssssssssssss");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
// PERTANYAAN:
// *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// *Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 

// JAWABAN :
// Ketika eksepsi, maka baris 12 tidak dieksekusi dikarenakan aliran program akan keluar dari method
// cobaAngka() setelah melakukan throw suatu exception

// Ketika eksepsi terjadi, maka baris 21 tersebut akan dieksekusi, dikarenakan catch tersebut akan
// menangkap exception yang terjadi pada blok try