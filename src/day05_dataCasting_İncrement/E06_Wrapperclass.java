package day05_dataCasting_İncrement;

public class E06_Wrapperclass {//sarmalayıcı sınıfı
    public static void main(String[] args) {
        String str1 ="12345";
        String str2="23456";
        System.out.println( str1 + str2 );
        System.out.println(Integer.valueOf(str1)+ Integer.valueOf(str2));//string ile toplama yapılmaz
        //toplamak için integere çevirmemiz gerekir



    }
}
