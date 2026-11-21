import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = new String[5]; // buat array isi 5

        // 1. MENGISI ELEMEN ARRAY
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama ke-" + (i + 1) + ": ");
            nama[i] = input.nextLine();
        }

        System.out.println("\n--- Hasilnya ---");

        // 2. MENAMPILKAN SEMUA ELEMEN ARRAY
        for (int i = 0; i < 5; i++) {
            System.out.println("Nama ke-" + (i + 1) + ": " + nama[i]);
        }
    }
}
