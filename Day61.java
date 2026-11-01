import java.util.Scanner;

public class Kali1sampaiN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan N: ");
        int N = sc.nextInt();
        
        long total = 1; // pakai long, karena faktorial cepat besar
        for (int i = 1; i <= N; i++) {
            total *= i; // total = total * i
        }
        
        System.out.println(N + "! = " + total);
        sc.close();
    }
}
