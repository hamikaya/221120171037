package denemeler;
import java.util.*;
public class ders_soru_22 {

	public static void main(String[] args) {
		Random rs = new Random();
		int sayi = rs.nextInt(100);
		Scanner giris = new Scanner(System.in);
		System.out.println("===========================================================================\nSistem, 1 ile 100 aras�nda bir say� tahmin etti ve 10 tahmin hakk�n�z var.\n===========================================================================");
		int sayac = 10;
		while (sayac>=1) {
			System.out.print("Say� Girin: ");
			int sayi1 = giris.nextInt();
			if (sayi1>100 || sayi1==0) {
					System.out.println("Sadece 1 ile 100 aras�nda bir say� tahmini yapabilirsiniz.");
			}
			else {
				if (sayi1==sayi) {
					System.out.print("Tebrikler! Tahmin edilen say�y� buldunuz.");
					break;
				}
				else {
					if (sayi1<sayi) {
						System.out.println("Girdi�iniz say�, tahmin edilen say�dan k���k.");
					}
					else {
						System.out.println("Girdi�iniz say�, tahmin edilen say�dan b�y�k.");
					}
					sayac--;
					if (sayac!=0) {
					System.out.println(sayac+" hakk�n�z kald�.");
					}
					else {
						System.out.println("Maalesef hakk�n�z bitti. Tahmin edilen say� �uydu => "+sayi);
						break;
					}
				}
			}
		}
	}

}
