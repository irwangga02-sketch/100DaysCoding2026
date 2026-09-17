public class Day16 { // Day16 modulus sisa bagi
  public static void main(String[] args) {
    int A = 6;
    int B = 2;

    int hasilbagi = A / B;
    int sisabagi = A % B;
    
    //beda (/) dan (%)
    //hasil dari pembagian variabel A dan B 
    System.out.println("hasil bagi"+ hasilbagi);//hasil 3
    //menampilkan sisa dari pembagian variabel A dan B
    System.out.println("sisa bagi : "+ sisabagi);//hasil 0
    
  }
}
