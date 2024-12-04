import java.util.Scanner;
public class Soalmudahno3 {
    public static void main(String[] args) {
             
        
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Masukkan Bilangan Awal");
            int start = scanner.nextInt();
    
            System.out.println("Masukkan Bilangan Akhir");
            int end = scanner.nextInt();
            
            for (int a = start; a > end; a--) {
                if (a % 3 == 0) {
                    System.out.println(a + ". saya anak angkatan 33");
                } else if (a % 2 == 0) {
                    System.out.println(a + ". saya anak moklet");
                } else {
                    System.out.println(a + ". saya anak wikusama");
                }
            }
            System.out.println(end + " .saya senang");
        }
    }