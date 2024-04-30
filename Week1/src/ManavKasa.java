import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
        */
    double armut = 2.14;
    double elma = 3.67;
    double domates = 1.11;
    double muzPudraSekersiz = 0.95;
    double patlamican = 5.00;
    double armutKilo, elmaKilo, domatesKilo, muzPudraSekersizKilo, patlamicanKilo;

    Scanner input = new Scanner(System.in);

        System.out.println("Lütfen almak istediğiniz ürünlerin miktarını KG olarak giriniz.");
        System.out.println("Armut miktarı: ");
        armutKilo = input.nextDouble();
        System.out.println("Elma miktarı: ");
        elmaKilo = input.nextDouble();
        System.out.println("Domates miktarı: ");
        domatesKilo = input.nextDouble();
        System.out.println("Muz miktarı (Lütfen pudra şekersiz olanını giriniz): ");
        muzPudraSekersizKilo = input.nextDouble();
        System.out.println("Patlamıcan miktarı: ");
        patlamicanKilo = input.nextDouble();
        double toplamTutar = armutKilo*armut + elmaKilo*elma + domatesKilo*domates + muzPudraSekersizKilo*muzPudraSekersiz + patlamicanKilo*patlamican;
        System.out.println("Toplam tutar (kdvsiz): " + toplamTutar);


    }
}
