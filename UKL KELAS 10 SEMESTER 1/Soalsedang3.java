import java.util.Random;
import java.util.Scanner;

public class Soalsedang3 {
    
        public static void main(String[] args) {
            // Deklarasi variabel
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            String[] operator = { "*", "/", "%", "-", "+"}; // Operator yang akan digunakan
            boolean lanjutkan = true;
    
            while (lanjutkan) {
                // Pilih operator secara acak
                String op = operator[random.nextInt(operator.length)];
    
                // Pilih bilangan pertama dan kedua secara acak
                int bilangan1 = random.nextInt(100) + 1; // Angka 1 sampai 100
                int bilangan2 = random.nextInt(99) + 1;  // Angka 1 sampai 99, agar tidak pembagian dengan 0
    
                // Hitung hasilnya berdasarkan operator yang terpilih
                int hasil = 0;
                switch (op) {
                    case "*":
                        hasil = bilangan1 * bilangan2;
                        break;
                    case "/":
                        // Pembagian, harus memastikan bilangan1 bisa dibagi bilangan2 tanpa sisa
                        while (bilangan1 % bilangan2 != 0) {
                            bilangan2 = random.nextInt(99) + 1;  // Menentukan bilangan2 agar pembagian valid
                        }
                        hasil = bilangan1 / bilangan2;
                        break;
                    case "%":
                        hasil = bilangan1 % bilangan2;
                        break;
                     case "+":
                        hasil = bilangan1 + bilangan2;
                     case "-": 
                        hasil = bilangan1 + bilangan2;      
        
                }
    
                // Tampilkan soal kepada pengguna
                System.out.println("Soal: " + bilangan1 + " " + op + " " + bilangan2 + " = ?");
                
                // Minta pengguna untuk memberikan jawaban
                System.out.print("Jawaban Anda: ");
                int jawabanUser = scanner.nextInt();
    
                // Tampilkan hasil dan beri feedback
                if (jawabanUser == hasil) {
                    System.out.println("Benar!");
                } else {
                    System.out.println("Salah. Jawaban yang benar adalah: " + hasil);
                    
                }    

    
                // Tanyakan apakah ingin melanjutkan
                System.out.print("\nApakah Anda ingin melanjutkan? (y/n): ");
                char lanjut = scanner.next().charAt(0);
                if (lanjut == 'n' || lanjut == 'N') {
                    lanjutkan = false; // Menghentikan kuis
                }
            }
    
            System.out.println("\nTerima kasih telah bermain!");
            scanner.close();
        }
    }
    