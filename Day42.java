import java.util.Scanner;
public class mainkan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = s.nextInt();

        int gajiBersih;

        if (gajiPokok > 3000000) {
            gajiBersih = gajiPokok - 500000;
        } else {
            gajiBersih = gajiPokok;
        }

        System.out.println("Gaji bersih: " + gajiBersih);
         }
        }
