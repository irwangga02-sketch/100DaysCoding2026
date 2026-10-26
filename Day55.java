public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i==3) continue; // skip 3
            if(i==8) break;    // berhenti di 8
            if(i==10) return;  // matikan program
            System.out.print(i+" ");
        }
    }
}
// Output: 1 2 4 5 6 7
