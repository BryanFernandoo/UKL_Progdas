import java.util.HashMap;
import java.util.Map;

public class Soalsulitno3
 {

    public static void main(String[] args) {
        // Array yang diberikan
        int[] array = {1, 2, 2, 3, 3, 3, 4, 1, 1, 5,6};
        
        // Map untuk menyimpan frekuensi elemen
        Map<Integer, Integer> frekuensi = new HashMap<>();

        // Menghitung frekuensi elemen dalam array
        for (int i = 0; i < array.length; i++) {
            // Ambil elemen array
            int elemen = array[i];
            // Periksa apakah elemen sudah ada dalam map
            if (frekuensi.containsKey(elemen)) {
                // Jika ada, tambahkan frekuensinya
                frekuensi.put(elemen, frekuensi.get(elemen) + 1);
            } else {
                // Jika belum ada, set frekuensinya 1
                frekuensi.put(elemen, 1);
            }
        }

        // Menampilkan hasil frekuensi
        for (Map.Entry<Integer, Integer> entry : frekuensi.entrySet()) {
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali");
        }
    }
}
