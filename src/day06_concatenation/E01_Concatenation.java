package day06_concatenation;//birleştirme

public class E01_Concatenation {
    public static void main(String[] args) {
        String str1="java";
        String str2="guzel";
        int sayi1=5;
        int sayi2=3;
        System.out.println(str1+sayi1);//java5
        System.out.println(sayi1+sayi2+str1+str2);//8javagüzel
        System.out.println(str2+str1);//güzeljava
        System.out.println(sayi2+str2);//3güzel
        System.out.println(str2+sayi1);//güzel5
        System.out.println(sayi1*sayi2+str2);//15güzel

        //eger tamamen sayılardan oluşan bir string varsa ve biz bunu int a cevirmek istersek
        //ınteger.valueOf(str)
    }
}
