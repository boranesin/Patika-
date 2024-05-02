import java.awt.desktop.AboutEvent;
import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        /*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana
        “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
Mükemmel Sayı Nedir ? - Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya
 mükemmel sayı denir.

Bir sayı giriniz: 28
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır*/

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        int sayi = input.nextInt();

        boolean sonuc = mukemmelSayiKontrol(sayi);

        if (sonuc){
            System.out.println( sayi + " sayisi mükemmel bir sayıdır");
        } else {
            System.out.println(sayi + " sayisi mükemmel bir sayı değildir");
        }
    input.close();
    }
    static boolean mukemmelSayiKontrol(int sayi){
        int toplam = 0;

        for (int i = 1; i < sayi; i++ ){
            if (sayi % i == 0){
                toplam += i;
            }
        }

        return (toplam == sayi);
    }

}
