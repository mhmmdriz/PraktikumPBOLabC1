/**
  * File        : OperasiTitik.java       01/03/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   :
  * Kelas yang berisi program class OperasiTitik
*/
public class OperasiTitik {
    public void refleksiSumbuX(Titik titik){
        // cara 1
        titik.setOrdinat(-titik.getOrdinat());
    }

    public void refleksiSumbuY(Titik titik){
        // cara 2
        double x;
        x = -titik.getAbsis();
        titik.setAbsis(x);
    }
}
