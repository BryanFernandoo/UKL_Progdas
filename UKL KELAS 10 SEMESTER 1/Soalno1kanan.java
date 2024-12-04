import java.util.Scanner;

public class Soalno1kanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int angkahargapertama = 4250;
        int angkahargakedua =   6000;
        int angkahargaketiga =  50000;

          // Input berat paket
          System.out.print("Masukkan berat paket (kg): ");
          double berat = scanner.nextDouble();
  
          // Input jarak tempuh
          System.out.print("Masukkan jarak tempuh (km): ");
          double jarak = scanner.nextDouble();
  
          // Input volume barang
          System.out.print("Masukkan volume barang (cm3): ");
          double volume = scanner.nextDouble();



        // Hitung biaya berdasarkan jarak
        double biayaPerKg = (jarak <= 100) ? 4250 : 6000; 
        double biayaBerat = berat * biayaPerKg;

        // Hitung biaya tambahan untuk volume
        double biayaVolume = (volume > 10) ? 50000 : 0;

        // Total biaya
        double totalBiaya = biayaBerat + biayaVolume;

        // Output hasil
        System.out.println("\nDetail Biaya Pengiriman:");
        System.out.println("Biaya berdasarkan berat: Rp " + biayaBerat);
        if (biayaVolume > 0) {
            System.out.println("Biaya tambahan volume: Rp " + biayaVolume);
        }
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);
        
        scanner.close();
    }
}

        
       