import java.util.Scanner;

class Recursive {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("N Sayısı: ");
                int n = input.nextInt();
                input.close();

                printNumbers(n);
            }

            public static void printNumbers(int n) {
                // Temel durum: n 0 veya negatifse, işlemi sonlandır ve geri dön
                if (n <= 0) {
                    System.out.print(n + " ");
                    return;
                }

                // İleriye doğru işlem: n'den 5 çıkar ve sonucu ekrana yazdır
                System.out.print(n + " ");
                printNumbers(n - 5);
                System.out.print(n + " ");
            }
        }