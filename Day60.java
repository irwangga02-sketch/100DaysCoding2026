import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan N: ");
        int N = s.nextInt();
        
        int total = 0;
        for (int i = 1; i <= N; i++) {
            total += i; // total = total + i
        }
        
        System.out.println("Jumlah 1 sampai " + N + " adalah: " + total);
    }
}
