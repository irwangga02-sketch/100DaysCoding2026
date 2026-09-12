import java.util.Scanner; // import scanner buat input dari keyboard

public class Day11 { 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // 1 scanner untuk semua

        System.out.println("=== DAY 11 - INPUT 9 TIPE DATA ===");

        // 1. byte
        System.out.print("Masukkan byte: ");
        byte a = sc.nextByte();

        // 2. short
        System.out.print("Masukkan short: ");
        short b = sc.nextShort();

        // 3. int
        System.out.print("Masukkan int: ");
        int c = sc.nextInt();

        // 4. long
        System.out.print("Masukkan long: ");
        long d = sc.nextLong();

        // 5. float
        System.out.print("Masukkan float: ");
        float e = sc.nextFloat();

        // 6. double
        System.out.print("Masukkan double: ");
        double f = sc.nextDouble();

        // 7. char
        System.out.print("Masukkan char: ");
        char g = sc.next().charAt(0);

        // 8. boolean
        System.out.print("Masukkan boolean true/false: ");
        boolean h = sc.nextBoolean();

        sc.nextLine(); // buang enter

        // 9. String
        System.out.print("Masukkan String: ");
        String i = sc.nextLine();

        // Output
        System.out.println("\n=== HASIL DAY 11 ===");
        System.out.println("byte    : " + a);
        System.out.println("short   : " + b);
        System.out.println("int     : " + c);
        System.out.println("long    : " + d);
        System.out.println("float   : " + e);
        System.out.println("double  : " + f);
        System.out.println("char    : " + g);
        System.out.println("boolean : " + h);
        System.out.println("String  : " + i);

        sc.close(); // tutup scanner
    }
}
