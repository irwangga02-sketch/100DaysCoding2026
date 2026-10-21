import java.util.Scanner;

public class GanjilGenapTernari {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = s.nextInt();

        // INI OPERATOR TERNARINYA
        String hasil = (angka % 2 == 0) ? "GENAP" : "GANJIL";

        System.out.println(angka + " adalah bilangan " + hasil);
    }
}
