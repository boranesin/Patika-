import java.util.Scanner;
public class TaksiMetre {
    /*Taksimetre Programı
    Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.*/

    public static void main8(String[] args) {
        double mesafeKm, toplamUcret;
        double KmUcreti = 2.20;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gidilen mesafeyi KM olarak giriniz: ");
        mesafeKm = input.nextDouble();
        toplamUcret = mesafeKm*KmUcreti;

        if ( toplamUcret < 20 ){
            toplamUcret = 20;
        } else {
            toplamUcret = mesafeKm*KmUcreti;
        }
        System.out.println("Toplam ücret: " +toplamUcret);
        input.close();
    }
}
