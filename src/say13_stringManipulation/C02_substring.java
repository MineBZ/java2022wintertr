package say13_stringManipulation;

import java.sql.SQLOutput;

public class C02_substring {
    public static void main(String[] args) {

       String str="1-48 of 7000 results for \"java\"";

        int ilkSpace= str.indexOf(" "); // 4
        int ikinciSpace= str.indexOf(" ", ilkSpace+1);
        int ucuncuSpace= str.indexOf(" ",ikinciSpace+1);

        String aramaSonucSayisiStr = str.substring(ikinciSpace+1  , ucuncuSpace);
        System.out.println(aramaSonucSayisiStr);

        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr);
        if (aramaSonucSayisiInt>100){
            System.out.println("Super");
        } else {
            System.out.println("az sonuc bulundu");
        }
    }
}