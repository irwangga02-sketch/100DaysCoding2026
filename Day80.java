import java.util.Scanner;
public class Day80 {
    public static void main(String[] tu) {
       String[] buah = {"Durian", "Jeruk", "Kelapa", "Pisang", "Nanas"};
        System.out.println("Elemen pertama (indeks 0): " + buah[0]);
        System.out.println("Elemen ketiga (indeks 2): " + buah[2]);
        buah[1] = "Semangka";
        System.out.println("Setelah diubah, indeks 1 menjadi: " + buah[1]);
        System.out.println("Jumlah elemen: " + buah.length);
    }
}
