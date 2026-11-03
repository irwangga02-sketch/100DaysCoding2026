import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
          int M, N, hasil = 1;

        System.out.print("Masukkan nilai M: ");
        M = s.nextInt();

        System.out.print("Masukkan nilai N: ");
        N = s.nextInt();

        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
        }

        System.out.println("Hasil " + M + " pangkat " + N + " = " + hasil);
    }
}

