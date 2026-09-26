import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double pi = 3.14; 
        System.out.print("masukkan r2 : ");
        String r = s.nextLine();
        double a = Double.parseDouble(r); 
        // rumus PI * r * r
        double kel = pi * a * a;
        double akhir = kel - (kel * 2);
        String fix = String.valueOf(akhir);
        System.out.printf("hasil : %.10s ",fix);
        
        
    }
}
