import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        int kacSayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç sayi içersin: ");
        kacSayi = input.nextInt();

        System.out.println("Fibonacci Serisi:");
        int fib1 = 0, fib2 = 1;

        for (int i = 0; i < kacSayi; i++) {
            System.out.print(fib1 + " ");
            //burada üç işlem ile fibonnaci örgüsünü tanımladık
            int toplam = fib1 + fib2;
            fib1 = fib2;
            fib2 = toplam;
        }

        input.close();
    }

}
