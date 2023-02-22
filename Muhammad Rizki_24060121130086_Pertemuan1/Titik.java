/**
  * File        : Titik.java       22/02/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   :
  * Kelas yang berisi program class Titik
*/
class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	
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
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	static int getCounterTitik(){
		return counterTitik;
	}
}