public class Main {
    public static void main(String[] args) {
        String data = "  230101-Ahmad  ";

        String bersih = data.trim(); // "230101-Ahmad"
        String nim = bersih.substring(0, 6); // "230101"
        String nama = bersih.substring(7); // "Ahmad"
        String namaBaru = nama.replace("Ahmad", "Fadli"); // "Fadli"

        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + namaBaru);
    }
}
