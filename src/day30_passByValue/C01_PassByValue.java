package day30_passByValue;

public class C01_PassByValue {
    static {
        System.out.println("static block2 calisti");
    }
    static{
        /*
        static block class ilk calismaya basladiginda devreye girer
        ve class'in calismasi icin gerekli on hazirliklar icin kullanilir
        yazildigi satirin hic bir onemi yoktur, class icerisinde istenen yerde yazilabilir
        static block birden fazla olursa, bloklar yukaridan asagi dogru sirayla calisir
         */
        System.out.println("static block1 calisti");
}
}
