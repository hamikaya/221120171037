package denemeler;
import java.util.*;
public class ders_soru_32 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Sayı Girin: ");
		int sayi = giris.nextInt();
		if (50<=sayi) {
			System.out.print("Girilen sayı 50'den büyük. Sayının yüzde 10'u: "+sayi*0.10);
		}
		else {
			System.out.print("Girilen sayı 50'den küçük. Sayının yüzde 25'i: "+sayi*0.25);
		}
	}

}
