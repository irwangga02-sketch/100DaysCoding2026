import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int N = sc.nextInt();

        // 1-N (Ascending)
        System.out.print("1-N: ");
        for(int i=1; i<=N; i++){
            System.out.print(i+" ");
        }

        // N-1 (Descending)
        System.out.print("\nN-1: ");
        for(int i=N; i>=1; i--){
            System.out.print(i+" ");
        }
    }
}
