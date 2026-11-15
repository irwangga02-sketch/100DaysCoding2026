public class Main {
    public static void main(String[] args) {
        String password = "Budi123";
        String kalimat = "Saya suka Mangga";

        System.out.println(password.equals("Budi123")); // true
        System.out.println(password.equalsIgnoreCase("budi123")); // true
        System.out.println(kalimat.contains("Mangga")); // true
        System.out.println(password.isEmpty()); // false
    }
}
