import java.util.Scanner;
public class mainkan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int harga = 0;
        String menu = null;
        System.out.println("=== MENU MAKANAN ====\n1. coto makassar\n2. Sop ubi\n3. coto kuda");
        System.out.print("Masukkan Pilihan : ");
        int pil = s.nextInt();
        switch (pil) {
            case 1:
                menu = "Coto Makassar";
                harga = 25000;
                break;
            case 2:
                menu = "Sop Ubi";
                harga = 20000;
                break;
            case 3:
                menu = "Coto kuda";
                harga = 30000;
                break;
            default:
                System.out.println("Menu Kosong");
        }
            if (pil > 0 && pil < 4) {
            System.out.println("===== STRUK PEMBAYARAN =====");
            System.out.println("Menu dipesan : "+menu);
            System.out.println("Harga Perporsi : Rp."+ harga);
            System.out.print("Masukkan porsi : ");
            int porsi = s.nextInt();
            System.out.println("Banyak porsi : "+porsi);
            int bayar = harga * porsi;
            System.out.println("Total Bayar : Rp."+bayar);
          
         }
        }
    }
