package day11_stringManipulation;

import java.util.Scanner;

public class C03_equelsIgnoreCase {
    public static void main(String[] args) {

        // kullaniciya derse katili katilmak istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin

        System.out.println("Derse katılmak ister misiniz? \n Evet veya Hayır yazınız");
        Scanner scan=new Scanner (System.in);
        String cevap=scan.next();
        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabınız:"+ cevap + " derse katılımınız onaylanmıstır");
        }else if (cevap.equalsIgnoreCase("hayır")){
                     System.out.println("cevabınız:" +cevap+ " sonraki derslerimize bekleriz");
        }else {
            System.out.println("lütfen evet veya hayır yazdırınız");
        }

    }
}


