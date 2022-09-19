package day07_ifelsestatements;

import java.util.Scanner;

public class E04_HaftanınGünleri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen gun ismini yazınız");
        String gunısmı=scan.next().toUpperCase();

        if (gunısmı.equals("PAZAR")||gunısmı.equals("CUMARTESİ") ){//küçük harfle yazarsak
                                                                  // çıktı da sonuç vermez

            System.out.println("gırdiğiniz gun haftasonu");

        }
    }
}
