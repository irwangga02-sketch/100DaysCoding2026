public class Day4 {
    public static void main(String[] args) {
        /*1.tipe data byte
            -ukuran : 1 byte
            -range : -128 sampai 127
            -contoh pakai : umur hewan,nilai kecil
        */ 
        byte umur = 20;

        /*2.tipe data short 
            -ukuran : 2 byte
            -range : -32.768 sampai 32.767
            -contoh pakai : data sensor,hemat memori    
        */
        short nilaiUjian = 100;

        /*3.tipe data integer
            -ukuran : 4 byte
            -range :-2.1 miliar sampai 2.1 miliar
            -contoh pakai : semester,usia,ID,sangat sering digunakan
        */
        int semester = 3;

        /*4.tipe data long
            -ukuran : 8 byte
            -range : -9.2 triliun sampai 9.2 triliun
            -contoh pakai : Nik,,timestamp 
            -note : L digunakan untuk menandai bahwa angka tersebut tipe data long 
        */
       long NIK = 7003535242424241L;

       System.out.println("umur anda : "+ umur);
       System.out.println("nilai ujian anda : "+ nilaiUjian);
       System.out.println("semester : "+ semester);
       System.out.println("nik anda : "+ NIK);

    }
}
