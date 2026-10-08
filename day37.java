import java.util.Scanner;
public class Day28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a > 0) {
            System.out.println(a+" Bilangan Positif");
        } else if (a < 0) {
            System.out.println(a+" Bilangan Negatif");
        } else {
            System.out.println("Nol");
        }
    }
}
