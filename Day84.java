public class Main {
    public static void main(String[] args) {
        int[] angka = {15, 42, 8, 99, 23};
        
        // 1. Anggap angka pertama adalah yang paling besar dulu
        int max = angka[0]; 

        // 2. Bandingkan satu-satu dengan sisanya
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i]; // Kalau ada yang lebih besar, ganti juaranya
            }
        }

        System.out.println("Angka maksimal: " + max);
    }
}
