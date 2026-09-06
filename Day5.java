public class Day4 {
    
    public static void main(String[] args) {
        
        // DOUBLE juga digunakan untuk bilangan desimal,
        // tetapi memiliki ketelitian lebih tinggi daripada float,
        // yaitu sekitar 15-16 digit.
        double gaji = 2.4;
        // FLOAT digunakan untuk menyimpan bilangan desimal,
        // dengan ketelitian sekitar 6-7 digit.
        float harganasikuning = 10f;
        
        System.out.printf("gaji : Rp.%.2f juta%n",gaji);
        System.out.printf("harga nasi kuning : Rp.%.2f K/porsi%n",harganasikuning);
        
    }
    
}
