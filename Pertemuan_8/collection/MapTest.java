/**
  * File        : MapTest.java       17/05/23
  * Penulis     : Muhammad Rizki/24060121130086
  * Deskripsi   : program yang menggunakan Generic untuk pasangan Kunci-Nilai
*/

package collection;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci -> integer, nilai ->string
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "satu");
        map.put(2, "dua");

        // mengambil elemen pertama
        System.out.println(map.get(1));

        // mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();

        // bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci ?
        for(Integer x : key){
            System.out.println(x + " = " + map.get(x));
        }

        Collection<String> values = map.values();
        for(String value : values){
            System.out.println("nilai = " + value);
        }
    }
}
