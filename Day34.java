import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan a: ");
        int a = input.nextInt();
        System.out.print("Masukkan b: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("a lebih besar");
        } else if (b > a) {
            System.out.println("b lebih besar");
        } else {
            System.out.println("Kedua bilangan sama");
        }
    }
}
