public class Main {
    public static void main(String[] args) {
        String[] buah = {"Mangga", "Apel", "Pisang", "Durian", "Jeruk"};
        String cari = "Durian";
        boolean ketemu = false;

        for (int i = 0; i < buah.length; i++) {
            // Kalau String, pakainya .equals, BUKAN ==
            if (buah[i].equals(cari)) {
                System.out.println(cari + " ketemu di indeks ke-" + i);
                ketemu = true;
                break;
            }
        }

        if (!ketemu) {
            System.out.println(cari + " tidak ada");
        }
    }
}
