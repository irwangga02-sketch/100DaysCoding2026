public class Day14 {
    
    public static void main(String[] args) {
        int gaji_kupas_bawang = 700000;
        int bonus = 5000;
        int pajak = 500000;
        
        int total_gaji = gaji_kupas_bawang + bonus;
        int sisa_gaji = total_gaji - pajak;
        
        System.out.println("gaji total : "+ total_gaji);
        System.out.println("sisa gaji : "+ sisa_gaji);
    }
    
}
