import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int N = sc.nextInt();

        // Ganjil 1-N
        System.out.print("Ganjil: ");
        for(int i=1; i<=N; i++){
            if(i%2==1) System.out.print(i+" ");
        }

        // Genap 1-N
        System.out.print("\nGenap: ");
        for(int i=1; i<=N; i++){
            if(i%2==0) System.out.print(i+" ");
        }
    }
}
