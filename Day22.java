public class Day22 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Sebelum: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sesudah: a = " + a + ", b = " + b);
    }
}
