package day04_dataCasting_İncrement;//veri döküm artışı

import java.util.Scanner;//scanner tarayıcı demek

public class E01_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan isim alıp baş harfini yazdırınız
        Scanner scan=new Scanner(System.in);
        char ilkHarf=scan.next().charAt(0);
        System.out.println("girdiğiniz ismin ilk harfi:"+ilkHarf);
        //charAt içine sıfır yazmamızın sebebi saymaya sıfırdan başlarız

        //Java’da kod yazarken bir veri tipinden diğer bir veri tipine aktarım yapmamız gerekebilir.
    }
}
