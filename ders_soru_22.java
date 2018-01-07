package denemeler;
import java.util.*;
public class ders_soru_22 {

	public static void main(String[] args) {
		Random rs = new Random();
		int sayi = rs.nextInt(100);
		Scanner giris = new Scanner(System.in);
		System.out.println("===========================================================================\nSistem, 1 ile 100 arasında bir sayı tahmin etti ve 10 tahmin hakkınız var.\n===========================================================================");
		int sayac = 10;
		while (sayac>=1) {
			System.out.print("Sayı Girin: ");
			int sayi1 = giris.nextInt();
			if (sayi1>100 || sayi1==0) {
					System.out.println("Sadece 1 ile 100 arasında bir sayı tahmini yapabilirsiniz.");
			}
			else {
				if (sayi1==sayi) {
					System.out.print("Tebrikler! Tahmin edilen sayıyı buldunuz.");
					break;
				}
				else {
					if (sayi1<sayi) {
						System.out.println("Girdiğiniz sayı, tahmin edilen sayıdan küçük.");
					}
					else {
						System.out.println("Girdiğiniz sayı, tahmin edilen sayıdan büyük.");
					}
					sayac--;
					if (sayac!=0) {
					System.out.println(sayac+" hakkınız kaldı.");
					}
					else {
						System.out.println("Maalesef hakkınız bitti. Tahmin edilen sayı şuydu => "+sayi);
						break;
					}
				}
			}
		}
	}

}
