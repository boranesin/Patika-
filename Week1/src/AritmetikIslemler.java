import java.util.Scanner;

public class AritmetikIslemler {

   // https://github.com/boranesin/PatikaPlus/blob/main/README.md
    public static void main1(String[] args) {

        // değişkenleri tanımlıyoruz
        int a, b, c, sonuc;

        Scanner input = new Scanner(System.in);

        //  değişkenlere değer alıyoruz
        System.out.println("a verisini giriniz");
        a = input.nextInt();
        System.out.println("b verisini giriniz");
        b = input.nextInt();
        System.out.println("c verisini giriniz");
        c = input.nextInt();

        sonuc = a + b * c - b;

        System.out.println("sonuç : " + sonuc);
        input.close();
    }
}
