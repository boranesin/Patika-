import java.util.Scanner;

public class VucutKutleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, vik;
        System.out.println("Merhaba, vücut kütle endeksinizi");
        System.out.println("Hesaplayabilmemiz için boy(m) ve kilo(kg) değerlerinizi giriniz :  ");
        System.out.println("Boy : ");
        boy = input.nextDouble();
        System.out.println("Kilo : ");
        kilo= input.nextDouble();
        vik = kilo / (boy*boy);

        System.out.println("Vücut kütle indeksiniz : " + vik);


    }
/*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül
Kilo (kg) / Boy(m) * Boy(m)*/
}

