package denemeler;
import java.util.*;
public class ders_soru_20 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Ka� adet say� gireceksiniz?: ");
		int uzunluk = giris.nextInt();
		int sayi[] = new int[uzunluk];
		for (int i = 0; i<uzunluk; i++) {
			System.out.print((i+1)+". say�y� girin: ");
			sayi[i] = giris.nextInt();
			
		}
		System.out.print("sayi dizisi i�in "+uzunluk+" eleman girdiniz. Bunlar s�ras�yla");
		for (int b = 0; b<uzunluk; b++) {
			System.out.print("["+sayi[b]+"]");
		}
		System.out.println(" de�erleridir.");
		for (int a = 0; a<uzunluk; a++) {
			if (sayi[a]%2==0) {
				System.out.println("sayi dizisinin "+(a+1)+". eleman� ("+sayi[a]+") �ift say�d�r.");
			}
			else {
				System.out.println("sayi dizisinin "+(a+1)+". eleman� ("+sayi[a]+") tek say�d�r.");
			}
		}
	}
}
