import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Suhu : ");
        double suhu = s.nextDouble();
        if (suhu < 16) {
            System.out.println("Suhu Ruangan dingin : "+suhu+" Celcius");
        } else if (suhu < 25) {
            System.out.println("Suhu Ruangan Normal : "+suhu+" Celcius");
        } else {
           System.out.println("Suhu Ruangan Panas : "+suhu+" Celcius"); 
            }
        }
    }
