public class Day32 {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // false
        System.out.println(a < b);  // true
        System.out.println(a >= 10); // true
        System.out.println(a <= b);  // true

        System.out.println((a < b) && (b == 20)); // true
        System.out.println((a == b) || (b == 20)); // true
        System.out.println(!(a == b)); // true
    }
}
