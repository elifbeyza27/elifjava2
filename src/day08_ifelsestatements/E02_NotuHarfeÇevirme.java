package day08_ifelsestatements;

import java.util.Scanner;

public class E02_NotuHarfeÇevirme {
    public static void main(String[] args) {
        //kullanıcıdan 100 uzerinde n notu isteyin notu harf sistemine cevirip yazdırın
        //50 den kucukse "d"
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double notsayi=scan.nextInt();
        if (notsayi<50){
            System.out.println("notunuz D");

        }else if (notsayi>=50&& notsayi<60){
            System.out.println("notunuz C");

        }else if (notsayi>=60&&notsayi<80){
            System.out.println("notunuz B");
        }else{
            System.out.println("notunuz A");
        }
    }
}
