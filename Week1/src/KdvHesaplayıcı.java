import java.util.Scanner;

public class KdvHesaplayıcı {
    public static void main4(String[] args) {
        /* Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
       (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
KDV oranını %8 olarak KDV tutarı hesaplayan program.*/
        double tutar, kdvliTutar;
        double kdvSifirBin = 0.18;
        double kdvBinUzeri = 0.08;


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen KDV'si hesaplanacak tutarı giriniz: ");
        tutar = input.nextDouble();
        if (tutar < 1000){
        kdvliTutar = tutar * (1 + kdvSifirBin);
        } else { kdvliTutar =  tutar * (1 + kdvBinUzeri);
        }
        double kdvMiktari = kdvliTutar - tutar;
        System.out.println("KDV'li tutar: " + kdvliTutar);
        System.out.println("KDV : " + kdvMiktari);
        input.close();

    }
}
