public class MinMaxSaja {
    public static void main(String[] args) {
        
        // === TIPE DATA INTEGER ===
        // byte: 8 bit, -128 sampai 127. Paling kecil, buat hemat memori
        System.out.println("byte    MIN: " + Byte.MIN_VALUE   + " | MAX: " + Byte.MAX_VALUE);
        
        // short: 16 bit, -32,768 sampai 32,767. Jarang dipakai
        System.out.println("short   MIN: " + Short.MIN_VALUE  + " | MAX: " + Short.MAX_VALUE);
        
        // int: 32 bit, -2M sampai 2M. Ini default untuk angka bulat
        System.out.println("int     MIN: " + Integer.MIN_VALUE + " | MAX: " + Integer.MAX_VALUE);
        
        // long: 64 bit, -9E18 sampai 9E18. Dipakai kalau angka int tidak cukup
        System.out.println("long    MIN: " + Long.MIN_VALUE   + " | MAX: " + Long.MAX_VALUE);
        
        System.out.println();
        
        // === TIPE DATA DESIMAL ===
        // float: 32 bit, presisi tunggal. MIN = angka positif terkecil
        System.out.println("float   MIN: " + Float.MIN_VALUE  + " | MAX: " + Float.MAX_VALUE);
        
        // double: 64 bit, presisi ganda. Default untuk angka desimal
        System.out.println("double  MIN: " + Double.MIN_VALUE + " | MAX: " + Double.MAX_VALUE);
        
        System.out.println();
        
        // === TIPE DATA LAIN ===
        // char: 16 bit, 0 sampai 65535. Untuk 1 karakter Unicode
        System.out.println("char    MIN: " + (int)Character.MIN_VALUE + " | MAX: " + (int)Character.MAX_VALUE);
        
        // boolean: 1 bit, cuma punya 2 nilai true dan false
        System.out.println("boolean : " + Boolean.FALSE + " | " + Boolean.TRUE);
    }
}
