import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = s.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = s.nextDouble();

        System.out.println("\nPilih operator:");
        System.out.println("1. + (Tambah)");
        System.out.println("2. - (Kurang)");
        System.out.println("3. * (Kali)");
        System.out.println("4. / (Bagi)");
        System.out.print("Pilihan [1-4]: ");
        int pilih = s.nextInt();

        double hasil = 0;

        switch (pilih) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + hasil);
                break;
            case 4:
                // syarat pembagi tidak boleh 0
                if (angka2 == 0) {
                    System.out.println("Error: Tidak bisa dibagi dengan 0");
                } else {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil);
                }
                break;
            default:
                System.out.println("Pilihan operator tidak valid!");
        }
    }
}
