import java.util.Scanner;

public class Hari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no_hari;

        System.out.println("Program Menentukan Hari");
        System.out.print("Masukkan angka (1-7): ");
        no_hari = input.nextInt();

        switch(no_hari) {
            case 1:
                System.out.println("Hari Senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jumat");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
                break;
            default:
                System.out.println("Angka salah! Masukkan 1-7 saja.");
        }
        
        input.close();
    }
}
