/**
  * File        : MKubus.java       15/03/23
  * Penulis     : Muhammad Rizki
  * Deskripsi   : driver class untuk BujurSangkar dan Kubus
*/
package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus {
    public static void main(String[] args) {
        double luas, panjangSisi, volume, luasAlas;

        BujurSangkar bujurSangkar1 = new BujurSangkar(5);
        luas = bujurSangkar1.hitungLuas();
        panjangSisi = bujurSangkar1.getPanjangSisi();
        System.out.println("luas bujur sangkar1 : " + luas);
        System.out.println("panjang sisi bujur sangkar1 : " + panjangSisi);
        
        System.out.println();

        Kubus kubus1 = new Kubus(bujurSangkar1);
        volume = kubus1.hitungVolume();
        luasAlas = kubus1.hitungLuasAlas();
        System.out.println("volume kubus1 : " + volume);
        System.out.println("luas alas kubus1 : " + luasAlas);


    }


}
