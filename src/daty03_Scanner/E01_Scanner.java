package daty03_Scanner;

import java.util.Scanner;

public class E01_Scanner {
    public static void main(String[] args) {
        //Scanner scan = new Scanner( System.in )
        //scan oluşturduğumuz scannerin ismidir başka isimde verebiliriz
        //ancak anlaşılır olması için scan daha uygundur
        //sanner kullanmak için üç adım takip ediyoruz
        //1. adım kendimize scanner oluşturmak


        //variable    //değer
        Scanner scan=new Scanner(System.in);
        //2. bilgi ise kullanıcıdan istediğiniz değeri girmesi için açıklayıcı bir bilgi yazdırın
        System.out.println("lütfen isminizi giriniz:");
        //3.adım kullanıcının girdiği değere uygun variable alıp kaydedin

       String kullanıcıİsmi=scan.nextLine();// bütün kelimeleri yazdırır
        System.out.println("kullanıcının girdiği isim:"+kullanıcıİsmi);
        kullanıcıİsmi=scan.next();//sadece ilk kelimeyi alır
        System.out.println("kullanıcının girdiği isim:"+kullanıcıİsmi);


    }
}
