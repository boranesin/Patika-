import java.util.Scanner;

public class UsluHesaplama {
    public static void main(String[] args) {
        //değşkenleri tanımladık

        int n,k;
        Scanner input = new Scanner(System.in);

        System.out.print("Ussu alınacak sayı: ");
        n = input.nextInt();

        System.out.println("Us olacak sayı: ");
        k = input.nextInt();

        int total = 1;
        //us hesaplama algoritması çalıştı
        int i = 1;
        while (i <= k) {
            total *= n;
            i++;
        }
        //sonuç ekrana yazıldı
        System.out.println("Cevap :" + total);

        input.close();
    }
}