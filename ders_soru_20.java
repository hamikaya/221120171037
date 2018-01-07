package denemeler;
import java.util.*;
public class ders_soru_20 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Kaç adet sayı gireceksiniz?: ");
		int uzunluk = giris.nextInt();
		int sayi[] = new int[uzunluk];
		for (int i = 0; i<uzunluk; i++) {
			System.out.print((i+1)+". sayıyı girin: ");
			sayi[i] = giris.nextInt();
			
		}
		System.out.print("sayi dizisi için "+uzunluk+" adet eleman girdiniz. Bunlar sırasıyla ");
		for (int b = 0; b<uzunluk; b++) {
			System.out.print("["+sayi[b]+"]");
		}
		System.out.println(" değerleridir.");
		for (int a = 0; a<uzunluk; a++) {
			if (sayi[a]%2==0) {
				System.out.println("sayi dizisinin "+(a+1)+". elemanı ("+sayi[a]+") çift sayıdır.");
			}
			else {
				System.out.println("sayi dizisinin "+(a+1)+". elemanı ("+sayi[a]+") tek sayıdır.");
			}
		}
	}
}
