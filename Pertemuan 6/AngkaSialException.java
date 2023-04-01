/** 
 * File         : AngkaSialException.java       01/04/2023
 * Penulis      : Muhammad Rizki
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13
*/
public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}
