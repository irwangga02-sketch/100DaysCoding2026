/*
    Day2 100Daysofcoding
    materi : membuat biodata mahasiswa dengan menggunkan
    println,print dan printf
*/
public class Day2 {
    public static void main(String[] args){
        /* membuat variabel NamaMahasiswa bertipe String dan 
           menyimpan nama mahasiswa, yaitu "irwangga".
           */  
            String NamaMahasiswa = "irwangga";
         
        /* membuat variabel prodi bertipe String dan 
           menyimpan program studi mahasiswa, yaitu "Informatika". 
           */
            String prodi = "Informatika";

        /* membuat variabel bernama umur, menggunakan tipe data integer 
           yang berisi nilai/parameter umur mahasiswa, yaitu 20. 
          */
           int umur = 20;
        //println() -Digunakan untuk mencetak teks kemudian pindah ke baris baru.
        System.out.println("Nama Mahasiswa : " + NamaMahasiswa);

        // print() -Digunakan untuk mencetak teks tanpa pindah ke baris baru.
        System.out.print("Program Studi   : " + prodi);
        
        /*printf() -Digunakan untuk mencetak dengan format tertentu.
            %d digunakan untuk menampilkan data bertipe int.*/
        System.out.printf("\nUmur : %d tahun", umur);
