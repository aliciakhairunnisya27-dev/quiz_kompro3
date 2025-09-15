public class soal3_1 {
  public static void main(String[] args) {
    int jam = 10;

    if (jam < 12){
    System.out.println("Pagi, tarif Rp 5000");
    }
    else if (jam >= 12 && jam < 18) {
    System.out.println("Siang, tarif Rp 7000");
    }
    else{
    System.out.println("Malam, tarif Rp 10000");    
    }
  }  
}
