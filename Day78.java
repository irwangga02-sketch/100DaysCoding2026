import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== BUAT AKUN BARU ===");
        System.out.print("Buat username: ");
        String userDaftar = sc.nextLine();

        System.out.print("Buat password: ");
        String passDaftar = sc.nextLine();

        System.out.println("Akun berhasil dibuat! Silahkan login.\n");
        boolean sudahMasuk = false;

        while (!sudahMasuk) {
            System.out.println("=== LOGIN ===");
            System.out.print("Username: ");
            String userLogin = sc.nextLine();

            System.out.print("Password: ");
            String passLogin = sc.nextLine();

            // Ceknya harus pake .equals, jangan pake ==
            if (userLogin.equals(userDaftar) && passLogin.equals(passDaftar)) {
                System.out.println("Login berhasil! Selamat datang, " + userLogin);
                sudahMasuk = true; // ini yang bikin loop berhenti
            } else {
                System.out.println("Username atau password salah! Coba lagi.\n");
            }
        }
    }
}
