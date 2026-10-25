import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            boolean kelipatan3 = (i % 3 == 0);
            boolean kelipatan4 = (i % 4 == 0);
            
            // 3 atau 4 tapi bukan keduanya
            if (kelipatan3 ^ kelipatan4) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
