public class Main {
    public static void main(String[] args) {
        
        int toplam = 0 ;
        // 1 den 20 ye dolaştırmak için 
        for (int i = 1; i <= 20; i++) {
            //cift sayilari bulmak icin
            if (i % 2 == 0) {
                //ciftlerin küpü için uc kere carp bulunanları
                toplam += (i * i * i);
        }
        }
        System.out.println("Cift sayilarin küpler toplamı " + toplam);
    }
}