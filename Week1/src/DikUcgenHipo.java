import java.util.Scanner;
public class DikUcgenHipo {
    public static void main(String[] args) {
        /*Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/
        double kenar1, kenar2, hippo;

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen önce ilk kenar uzunluğunu giriniz: ");
        kenar1 = input.nextInt();
        System.out.println("lütfen ikinci kenar uzunluğunu giriniz: ");
        kenar2 = input.nextInt();
        hippo = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenüs :" );
        System.out.println(hippo);
        input.close();
    }
}
