import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Lütfen dairenin yarı çapını giriniz: ");
        double yariCap = input.nextDouble();

        double alan = pi * yariCap * yariCap;

        System.out.println("dairenin alani: " + alan);

        double cevre = 2 * pi * yariCap;
        System.out.println("dairenin cevresi: " + cevre);

        System.out.println("Daire diliminin alanını hesaplamak istiyorsanız lütfen açı girişi yapınız");
        double aci = input.nextDouble();
        double diliminAlani = alan * aci / 360;
        System.out.println("Dilimin alani : " + diliminAlani);
        double diliminCevresi = ( 2 * yariCap ) + ( cevre * aci / 360);
        System.out.println("Dilimin çevresi : " + diliminCevresi);
    }
}
