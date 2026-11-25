public class Main {
    public static void main(String[] args) {
        int[] angka = {15, 42, 8, 99, 23};
        
        // 1. Anggap angka pertama adalah yang paling kecil dulu
        int min = angka[0]; 

        // 2. Bandingkan satu-satu dengan sisanya
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i]; // Kalau ada yang lebih kecil, ganti juaranya
            }
        }

        System.out.println("Angka minimal: " + min);
    }
}
