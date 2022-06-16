import java.util.Random;
import java.util.Scanner;

public class Zar {
    public static void main(String args[]) {
     
      int zar1,zar2;
      String secim;
      zar1=ZarSayiBelirle();
      zar2=ZarSayiBelirle();
     
        System.out.println("===============");
        System.out.println("Zarlar Atıldı.");
        ZarlariYazdir(zar1,zar2);
        System.out.println("===============");
        System.out.println("Sayıların farsça karşılığını görmek istiyor musun? (E/H)");
     Scanner scanner = new Scanner(System.in);
     secim = scanner.next();
     if(secim.equals("e") || secim.equals("E")){
         Farsca();
     }
     else if (secim.equals("h") || secim.equals("H")){
         System.out.println("Hayır Seçildi.");
     }else {
         System.out.println("Hatalı Seçim.");
     }
  
     
    }

    public static int ZarSayiBelirle(){
        Random rand = new Random();
        return rand.nextInt(1,6);
    }
    public static void ZarlariYazdir(int zar1,int zar2){
        
        switch(zar1) {
          case 1:
             System.out.println("Birinci Zar:"+"Yek");
            break;
          case 2:
           System.out.println("Birinci Zar:"+"Du");
            break;
            case 3:
                 System.out.println("Birinci Zar:"+"Se");
            break;
            case 4:
                System.out.println("Birinci Zar:"+"Cihar");
            break;
            case 5:
                System.out.println("Birinci Zar:"+"Penç");
            break;
            case 6:
                System.out.println("Birinci Zar:"+"Şeş");
            break;
        }
         switch(zar2) {
          case 1:
             System.out.println("Birinci Zar:"+"Yek");
            break;
          case 2:
           System.out.println("Birinci Zar:"+"Du");
            break;
            case 3:
                 System.out.println("Birinci Zar:"+"Se");
            break;
            case 4:
                System.out.println("Birinci Zar:"+"Cihar");
            break;
            case 5:
                System.out.println("Birinci Zar:"+"Penç");
            break;
            case 6:
                System.out.println("Birinci Zar:"+"Şeş");
            break;
        }
    }
    public static void Farsca(){
      System.out.println("===============");
        System.out.println("Yek ==> 1");  
        System.out.println("Du ==> 2");
        System.out.println("se ==> 3");
        System.out.println("cihar ==> 4");
        System.out.println("penç ==> 5");
        System.out.println("şeş ==> 6");
        System.out.println("===============");
    }
  
    
}