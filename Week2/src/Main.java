import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double armut =2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican =5.00;
        double armutmiktari = 0;
        double elmamiktari = 0;
        double domatesmiktari = 0;
        double muzmiktari = 0;
        double patlicanmiktari = 0;
        double toplamtutar = 0;

        Scanner inp = new Scanner(System.in);


        System.out.println("armut Kaç Kilo Aldınız ? ");
        armut = inp.nextDouble();


        System.out.println("elma Kaç Kilo Aldınız ? ");
        elma = inp.nextDouble();

        System.out.println(" Kaç Kilo Aldınız ? ");
        domates= inp.nextDouble();

        System.out.println("muz Kaç Kilo ? Aldınız ");
        muz = inp.nextDouble();

        System.out.println("patlıcan Kaç Kilo Aldınız ? ");
        patlican=inp.nextDouble();

        toplamtutar = ((armutmiktari*armut)+(elmamiktari*elma)+(domatesmiktari*domates)+(muzmiktari*muz)+(patlicanmiktari*patlican));


        System.out.println("toplam Tutar : "+toplamtutar);



    }
}