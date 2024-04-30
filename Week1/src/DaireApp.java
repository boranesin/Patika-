import java.util.Scanner;
public class DaireApp {
    public static void main(String[] args) {
        /*Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;
Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360*/
        double yariCap, aci;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Daire alanını ve çevresini hesaplayan programa hoş geldiniz.");
        System.out.println("Lütfen alanını hesaplamak istediğiniz dairenin yarı çapını cm olarak giriniz: ");
        yariCap = input.nextDouble();

        System.out.println("Lütfen yapmak istediğiniz işlem numarasını giriniz: ");
        System.out.println("1 - Alan Hesabı, 2 - Çevre Hesabı, 3 - Dilim alanı (merkez açısı girişi gereklidir): ");

        int secim = input.nextInt();

        switch (secim){

            case 1;

            double alan = pi * yariCap * yariCap;
            System.out.println(alan);
            break;

            case 2;

            double cevre = 2 * pi * yariCap;
                System.out.println("Yarı çapı " + yariCap + " olan dairenin cevresi : " + cevre);

            case 3;


                double alanAcili = alan * aci / 360

        }
;
    }
}

