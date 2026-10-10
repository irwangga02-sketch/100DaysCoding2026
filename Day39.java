import java.util.Scanner;
 public class App {  
    public static void main(String[] args)  {
       Scanner s = new Scanner(System.in);
         int op = 0;
         System.out.print("angka pertama : ");
         int a = s.nextInt();
         System.out.print("Angka kedua : ");
         int b = s.nextInt();
         System.out.println("operator pilihan :\n1. +\n2. -\n3. x\n4. : ");
         System.out.print("\noperasi pilihan : ");
         char c = s.next().charAt(0);
         if (c == '+') {
            op = a + b;
         } else if (c == '-') {
            op = a - b;
         } else if (c == 'x') {
            op = a * b;
         } else if (c == ':') {
            if (b == 0) {
               System.out.println("Tidak bisa dibagi 0");
         } else {
            op = a / b;              
         }
            
         }
         System.out.println(a+" "+c+" "+b +" : "+op);
       }
      }
