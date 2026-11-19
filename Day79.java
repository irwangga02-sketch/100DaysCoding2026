public class Day84 {
    public static void main(String[] args) {

        // 1. Bikin array, isinya 3 nama
        String[] nama = {"ahmad", "budi", "cici"};

        // 2. Nampilin satu-satu
        System.out.println(nama[0]); // ahmad
        System.out.println(nama[1]); // budi
        System.out.println(nama[2]); // cici

        // 3. Nampilin semua pake loop
        System.out.println("--- Semua Nama ---");
        for (int i = 0; i < 3; i++) {
            System.out.println(nama[i]);
        }
    }
}
