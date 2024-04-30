import java.nio.file.LinkPermission;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main6(String[] args) {
            int matematik;
            int fizik;
            int kimya;
            int turkce;
            int tarih;
            int muzik;
            double ortalama;

            Scanner kullaniciGirisi = new Scanner(System.in);

        System.out.println("Lütfen matematik notunu giriniz");
        matematik = kullaniciGirisi.nextInt();
        System.out.println("Lütfen türkçe notunu giriniz");
        turkce = kullaniciGirisi.nextInt();
        System.out.println("Lütfen fizik notunu giriniz");
        fizik = kullaniciGirisi.nextInt();
        System.out.println("Lütfen kimya notunu giriniz");
        kimya = kullaniciGirisi.nextInt();
        System.out.println("Lütfen tarih notunu giriniz");
        tarih = kullaniciGirisi.nextInt();
        System.out.println("Lütfen müzik notunu giriniz");
        muzik = kullaniciGirisi.nextInt();

        ortalama = (muzik + fizik + kimya + matematik + turkce + tarih) / 6;

        System.out.println("Not ortalamanız: " + ortalama);

        String GecmeDurumu = ortalama >= 60 ? "Geçti" : "Kaldı";
        System.out.println(GecmeDurumu);
        kullaniciGirisi.close();
    }
}
