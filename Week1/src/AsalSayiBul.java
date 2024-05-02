public class AsalSayiBul {
    public static void main(String[] args) {
        int start = 1;
        int finish = 100;

        System.out.println( start + " ile " + finish + " arasındaki asal sayilar: ");
        //başlangıç bitiş arasındaki sayuları teker teker geziyoruz.
        for (int i = start; i <= finish; i++){
            int j;
            //her sayı için j değerini i ye kadar tarıyoruz
                for (j=2; j<i;j++) {
                    // eğer kalansız bölen i sayısına eşitse  bu bize i sayısının kendinden başka böleni olmadığını gösterirr
                    if (i%j == 0){
                        break;
                    }
                }
                if (j==i){
                System.out.print(i + " ");
            }
        }
    }
}
