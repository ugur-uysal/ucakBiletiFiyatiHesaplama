import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, yolculukTipi;
        double normalTutar, yasIndirimliTutar, indirimliTutar, yolculukTipiIndirim = 0, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculukTipi = input.nextInt();

        if (yolculukTipi != 1 && yolculukTipi != 2)
            System.out.println("Hatalı Veri Girdiniz !");
        else {
            normalTutar = km * 0.10;

            if (yas < 12) yasIndirimliTutar = normalTutar * 0.50;
            else if (yas <= 24) yasIndirimliTutar = normalTutar * 0.10;
            else if (yas > 65) yasIndirimliTutar = normalTutar * 0.30;
            else yasIndirimliTutar = 0;

            indirimliTutar = normalTutar - yasIndirimliTutar;

            if (yolculukTipi == 2) {
                yolculukTipiIndirim = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - yolculukTipiIndirim) * 2;
            } else toplamTutar = indirimliTutar;

            System.out.print("Toplam Tutar = " + toplamTutar + " TL");
        }

    }
}