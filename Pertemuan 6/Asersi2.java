/** 
 * File         : Asersi2.java       01/04/2023
 * Penulis      : Muhammad Rizki
 * Deskripsi    : Program untuk demo asersi, yang akan menilak input jari-jari lingkaran yang bernilai nol
*/
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0) : "jari jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
// PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
// JAWABAN : 
// Terdapat kesalahan konsep pada kondisi assertion. Kondisi yang diberikan adalah
// jari jari harus lebih dari 0, yang artinya jari-jari tidak boleh nol dan juga negatif.
// Namun pada message assert yang diberikan, hanya bertuliskan "jari jari tidak boleh nol",
// seharusnya "jari jari tidak boleh nol dan negatif"
