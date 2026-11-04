import java.util.Scanner;
public class tugas4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.print("Masukkan angka: ");
        int n = s.nextInt();
        
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }
        
        System.out.println(n + "! = " + hasil);
        
    }
}

