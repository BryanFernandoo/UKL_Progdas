import java.util.Scanner;

public class Soalsedang1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Validasi bilangan positif
        if (bilangan < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            // Perhitungan faktorial
            long faktorial = 1;
            System.out.print(bilangan + "! = ");

            // Menampilkan faktorisasi
            for (int i = bilangan; i > 0; i--) {
                faktorial *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" x ");
                }
            }

            // Hasil akhir
            System.out.println(" = " + faktorial);
        }
    }
}
