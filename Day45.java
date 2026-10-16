import java.util.Scanner;
public class mainkan {// bubble
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Pilihan : ");
        int pil = s.nextInt();
        switch (pil) {
            case 1:
                System.out.println("Bakso");
                break;
            case 2:
                System.out.println("Ayam Geprek");
                break;
            default:
                System.out.println("Kosong");
        }
          
         }
        }
