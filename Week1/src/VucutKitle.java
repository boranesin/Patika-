import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {

        //Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre
        // kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        //
        //Formül Kilo (kg) / Boy(m) * Boy(m)
        double boy;
        double kilo;
        double VIK;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre olarak giriniz");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu kilogram olarak giriniz");
        kilo = input.nextInt();
        VIK = kilo / (boy * boy);

        System.out.println("Vücut Kitle indeksiniz: " + VIK);




    }
}
