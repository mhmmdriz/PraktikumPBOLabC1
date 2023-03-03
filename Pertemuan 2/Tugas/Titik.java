/**
  * File        : Titik.java       04/03/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   :
  * Kelas yang berisi program class Titik
*/
class Titik{
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	public void setAbsis(double a){
		absis = a;
	}
	
	public void setOrdinat(double o){
		ordinat = o;
	}
	
	public double getAbsis(){
		return absis;
	}
	
	public double getOrdinat(){
		return ordinat;
	}
	
	public static int getCounterTitik(){
		return counterTitik;
	}

	public static void main(String[] args) {
		Titik titik1 = new Titik(3, 4);
		System.out.println(titik1.absis);
	}
}