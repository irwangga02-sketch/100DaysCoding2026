import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.print("Masukkan angka (negatif = berhenti): ");
            int angka = input.nextInt();

            if (angka < 0) {
                break; // berhenti kalau negatif
            }

            total += angka;
        }

        System.out.println("Total penjumlahan: " + total);
    }
}
