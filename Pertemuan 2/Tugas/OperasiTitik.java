/**
  * File        : OperasiTitik.java       04/03/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   :
  * Kelas yang berisi program class OperasiTitik
*/
public class OperasiTitik {
    Titik titikRefleksiSBX, titikRefleksiSBY;

    private void refleksiSumbuX(Titik titik){
        // cara 1
        titik.setOrdinat(-titik.getOrdinat());
    }

    private void refleksiSumbuY(Titik titik){
        // cara 2
        double x;
        x = -titik.getAbsis();
        titik.setAbsis(x);
    }

    public Titik refleksiX(Titik titik){
        titikRefleksiSBX = new Titik(titik.getAbsis(), titik.getOrdinat());
        refleksiSumbuX(titikRefleksiSBX);
        return titikRefleksiSBX;
    }
    
    public Titik refleksiY(Titik titik){
        titikRefleksiSBY = new Titik(titik.getAbsis(), titik.getOrdinat());
        refleksiSumbuY(titikRefleksiSBY);
        return titikRefleksiSBY;
    }
}
