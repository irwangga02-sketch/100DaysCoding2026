import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String menu = null;
        int harga = 0;
        System.out.println("==== MENU MAKANAN ====\n1. Ayam Bakar : Rp.25.000/porsi\n2. Ayam Geprek : Rp.15.000/porsi\n3. Ayam Kecap : Rp.20.000/porsi\n4. Ayam Rica-rica : Rp.15.000/porsi");
        System.out.print("Masukkan Menu Pilihan : ");
        int pil = s.nextInt();
        System.out.print("Masukkan Porsi : ");
        int por = s.nextInt();
        if (pil == 1) {
            menu = "Ayam bakar";
            harga = 25000;
        } else if (pil == 2) {
            menu = "Ayam Geprek";
            harga = 15000;
        } else if (pil == 3) {
            menu = "Ayam Kecap";
            harga = 20000;
        } else if (pil == 4) {
            menu = "Ayam Rica-rica";
            harga = 15000;
        } else {
            System.out.println("Menu Tidak Ada");
        }
        if (pil >= 1 && pil <= 4) {
        System.out.println("==== STRUK PEMBAYARAN ===");
        System.out.println("Menu Pilihan : "+menu);
        System.out.println("Banyak porsi : "+ por);
        System.out.println("Harga perporsi : Rp."+harga);
        int total = por * harga;       
        if (total >= 100000) {
        System.out.println("Selamat Anda dapat Diskon 10%");
        int diskon = total * 10/100;
        int akhir = total - diskon;
        System.out.println("Harga Sebelum Diskon : Rp."+total);
        System.out.println("Total Bayar Setelah Diskon : Rp."+akhir);          
        } else {
        System.out.println("Total Bayar : Rp."+total);            
        }             
        }
    }
}
