import java.util.Scanner;
public class mainkan {// bubble
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("Kelipatan 3 Dan 5");
            } else if (a % 3 == 0) {
                System.out.println("Kelipatan 3");
            } else if (a % 5 == 0) {
                System.out.println("Kelipatan 5");
            } else {
                System.out.println("Bukan Kelipatan 5 Ataupun 3");
            }
         }
        }
