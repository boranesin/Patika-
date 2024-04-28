import java.util.Scanner;

public class AritmetikIslemler {
    public static void main(String[] args) {
        int a, b, c, sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("a verisini giriniz");
        a = input.nextInt();
        System.out.println("b verisini giriniz");
        b = input.nextInt();
        System.out.println("c verisini giriniz");
        c = input.nextInt();

        sonuc = a + b * c - b;

        System.out.println("sonuç : " + sonuc);
    }
}
