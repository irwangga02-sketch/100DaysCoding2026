public class Day18 {
    
    public static void main(String[] args) {
        // 1. byte ke int
        byte b = 100;
        int i = b; 
        System.out.println(i); // 100

        // 2. int ke long
        int angka = 1000;
        long angkaLong = angka;
        System.out.println(angkaLong); // 1000

        // 3. int ke double (ini yang paling sering)
        int nilai = 75;
        double nilaiDouble = nilai;
        System.out.println(nilaiDouble); // 75.0

        // 4. char ke int (jadi kode ASCII)
        char huruf = 'A';
        int kodeHuruf = huruf;
        System.out.println(kodeHuruf); // 65
    }
}
