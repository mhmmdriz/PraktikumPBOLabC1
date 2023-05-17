/**
  * File        : BangunDatarGeneric.java       17/05/23
  * Penulis     : Muhammad Rizki/24060121130086
  * Deskripsi   : kelas konstruksi generic untuk BangunDatar
*/

package generic;

public class BangunDatarGeneric<T1 extends BangunDatar>{
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

    // Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti
    // dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan ! 

    // Yang dilakukan adalah hanya mengubah nama parameter jenis generik dari kelas ini.
    // parameter jenis generik ini bebas dinamai apapun, asalkan penggunaan nama tersebut konsisten,
    // tidak berubah-ubah. Parameter generik ini nantinya akan digantikan oleh berbagai jenis objek, sehingga
    // memberikan fleksibilitas pada kelas BangunDatarGeneric untuk menggunakan tipe objek apapun. Namun dalam
    // kasus ini, parameternya haruslah kelas turunan dari BangunDatar, karena terdapat klausa "extends BangunDatar"
}