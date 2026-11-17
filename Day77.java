import java.util.Scanner;
public class Day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Siapa nama lengkapmu? ");
        String namaLengkap = sc.nextLine();

        System.out.print("Kamu dari kota mana? ");
        String kotaAsal = sc.nextLine();

        String namaBersih = namaLengkap.trim();
        String kotaBersih = kotaAsal.trim();

        System.out.println("------------------------------");
        System.out.println("Halo, " + namaBersih);
        System.out.println("Total huruf namamu: " + namaBersih.length() + " karakter");
        System.out.println("Versi kapital: " + namaBersih.toUpperCase());
        System.out.println("Versi kecil: " + namaBersih.toLowerCase());
        System.out.println("Panggilanmu (4 huruf awal): " + namaBersih.substring(0, 4));
        System.out.println("Kota asalmu diubah: " + kotaBersih.replace("a", "4"));
        System.out.println("Kota tanpa spasi: [" + kotaBersih.trim() + "]");
        
    }
}
