package day06_concatenation;

public class E02_MantıksalOparötörler {
    public static void main(String[] args) {
        // ve=&& her koşulda true olmalı
        //veya=|| bir tanesi true olması yeterli
        //değil=!(koşul1&&koşul2)

        int a=10;
        int b=20;
        int c=30;
        int d=45;

        boolean koşul1=a<d;//true
        boolean koşul2=c>b;//true
        boolean cevap=(koşul1&&koşul2);
        System.out.println(cevap);
        boolean sonuç=(koşul1||koşul2);
        System.out.println(sonuç);
        boolean koşul3=d<b;//false
        boolean koşul4=b==c;//false
        boolean çıktı=(koşul3||koşul4);
        System.out.println(çıktı);
        boolean cevap1=!(koşul3&&koşul2);
        System.out.println(cevap1);

    }
}
