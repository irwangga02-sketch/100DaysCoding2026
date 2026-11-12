import java.util.Scanner;
public abstract class EvalMentor3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//Soal 1
//         System.out.print("Masukkan N:");
//         int n = s.nextInt();
        
//         for(int i = 1; i <= n; i++){
//             if(i % 2 == 0  && i % 5 != 0){
//                 System.out.print(i+" ");
//             }
//         }
//     }
// }

//Soal 2
        // System.out.print("Masukkan baris: ");
        // int B = s.nextInt();

        // System.out.print("Masukkan kolom: ");
        // int K = s.nextInt();

        // for(int i = 1; i <= B; i++){
        //     for(int j = 1; j <= K; j++){
        //         if(i % 2 == 1){
        //             System.out.print("#");
        //         }else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }}}

//Soal 3
    //    System.out.print("Masukkan M : ");
     //   int M = s.nextInt();
    //    System.out.print("Masukkan N : ");
    //    int N = s.nextInt();
//
    //    int hasil = 1;
    //    for(int i = 1; i <= N; i++){
    //        hasil *= M;
     //   }
      //  System.out.println(hasil);
// }}

//Soal 4

//     int hasil;
//     int N = s.nextInt();
   
//     if(N % 2 == 1){
//         hasil = 0;

//     for(int i = 1; i <= N; i++){
//         hasil = hasil + i;
//     }
//     }else{
//         hasil = 1;
//     for(int i = 1; i <= N; i++){
//          hasil = hasil * i;
//     }
//     }
//     System.out.print(hasil);
// }}

//Soal 5
        String pilihanTerakhir = "";
         while (true) {
             System.out.println("=== MENU ===");
             System.out.println("1. Nasi Goreng");
             System.out.println("2. Mie Ayam");
             System.out.println("3. Es Teh");
             System.out.println("4. Jus Jeruk");
             System.out.println("0. Keluar");
             System.out.print("Pilih menu: ");
             int pilih = s.nextInt();

             if (pilih == 0) {
                 break;
             } else if (pilih == 1) {
                 pilihanTerakhir = "Nasi Goreng";
             } else if (pilih == 2) {
                 pilihanTerakhir = "Mie Ayam";
             } else if (pilih == 3) {
                 pilihanTerakhir = "Es Teh";
             } else if (pilih == 4) {
                 pilihanTerakhir = "Jus Jeruk";
             } else {
                 System.out.println("Pilihan tidak valid");
             }
         }

         if (pilihanTerakhir.equals("")) {
             System.out.println("Belum ada pilihan");
         } else {
             System.out.println("Pilihan terakhir: " + pilihanTerakhir);
         }
     }}
