import java.util.Scanner; // import dulu scanner agar proses input bisa digunakan
public class Day12 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // proses menginput lewat keyboard
        System.out.print("masukkan nama : ");
        String nama = in.nextLine();
        System.out.print("masukkan tinggi badan : ");
        double tinggi = in.nextDouble();
        System.out.print("masukkan umur : ");
        int umur = in.nextInt(); 
      
        // kemudian dtampilkan outputnya
        System.out.println("==== BIODATA MAHASISWA INFORMATIKA ====");
        System.out.println("nama mahasiswa : "+ nama);
        System.out.printf("tinggi badan mahasiswa : %.2f cm",tinggi);
        System.out.println("\numur mahasiswa : "+umur +" tahun");
    }
    
}
