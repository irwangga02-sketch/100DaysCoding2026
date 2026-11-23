public class Main {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
        int total = 0; // 1. Siapin wadah buat total

        // 2. Kelilingi semua isi array
        for (int i = 0; i < angka.length; i++) {
            total = total + angka[i];
            // atau total += angka[i];
        }

        // 3. Tampilkan
        System.out.println("Totalnya: " + total);
    }
}
