package day08_ifelsestatements;

import java.util.Scanner;

public class E01_İfelseStatements {
    public static void main(String[] args) {
        //girilen bir karakterin,harf olup olmadıgını bulalım
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter gırınız");
        char karakter=scan.next().charAt(0);


        if ((karakter>'A'&& karakter<='Z') || (karakter>'a'&& karakter<='z')){
            System.out.println("girdiğiniz karakter bir harf");




        }else{
            System.out.println("girdiğiniz karakter harf değil");


        }
    }
}
