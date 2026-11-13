import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Sapa");
            System.out.println("2. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.println("Halo! Selamat datang!");
            }

        } while (pilihan != 2);

        System.out.println("Sampai jumpa!");
        input.close();
    }
}
