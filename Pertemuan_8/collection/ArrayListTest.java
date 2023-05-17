/**
  * File        : ArrayListTest.java       17/05/23
  * Penulis     : Muhammad Rizki/24060121130086
  * Deskripsi   : program penggunaan objek ArrayList sebagai Collection class
*/

package collection;

import java.util.ArrayList;;

public class ArrayListTest {
    public static void main(String[] args) {
        // inisialisasi ArrayList yang hanya dapat
        // berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // menghapus elemen
        strings.remove("praktikum");
        // iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.println(s + " ");
        }
    }
}
