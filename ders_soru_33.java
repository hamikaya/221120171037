package denemeler;
import java.util.*;
public class ders_soru_33 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Üssü hesaplanacak sayıyı girin: ");
		int sayi = giris.nextInt();
		System.out.print("Üssü girin: ");
		int us = giris.nextInt();
		for (int i = 1; i<us; i++) {
			sayi*=sayi;
			System.out.print("Sonuç: "+sayi);
		}
	}

}
