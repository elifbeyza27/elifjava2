package day07_ifelsestatements;

public class E01_İfstatemes {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        if (a==b){
            System.out.println("verilen sayılar eşit");//ifbady devreye girmediği için
            //konsolda çıktı alamayız


        }

        if (a<100){
            System.out.println("a yuzden küçük");

        }

        if (a*b>5){
            System.out.println("sayıların carpımı besten buyuk");
            //bağımsız if cümleleri kendileri dışındaki kodlarla ilgilenmezler
            //bir şart ve o şarta bağlı sonuca odaklıdır
        }
    }
}
