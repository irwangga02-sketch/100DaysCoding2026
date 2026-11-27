import java.util.Scanner;

public class tugas4 {
    // CUMA ADA 1 MAIN DI SINI, GAK ADA LAGI
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};

        angka[2] = 100;
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
            total += angka[i];
        }

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + (double) total / angka.length);
    }
}
