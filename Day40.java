import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        if (a % 1 == 0) {
            if (a % 5 == 0) {
                System.out.println("Bilangan bulat - Kelipatan 5");
        } else if (a % 2 == 0) {
                System.out.println("Bilangan Bulat - Bukan Kelipatan 5");
        }
        } else {
                System.out.println("Bilangan Desimal");
        }
    }
}
