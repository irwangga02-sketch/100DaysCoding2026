import java.util.Scanner;
public class mainkan {// bubble
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int a = s.nextInt();
        if (a >= 90) {
            System.out.println("Nilai : A");
        } else if (a >= 80) {
            System.out.println("Nilai : B");
        } else if (a >= 70) {
            System.out.println("Nilai : C");
        } else if (a >= 60) {
            System.out.println("Nilai : D");
        } else {
            System.out.println("Nilai : E (Perlu Remedial)");
        }
            
         }
        }
