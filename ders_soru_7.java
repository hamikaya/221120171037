package denemeler;
import java.util.*;
public class ders_soru_7 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Sayı Girin: ");
		int sayi = giris.nextInt();
		if (String.valueOf(sayi).length()<=4) {
			for (int i = 1; i!=sayi;) {
				if (sayi%i==0) {
					int sonuc = sayi/i;
					System.out.println(sayi+" sayısının "+i+" sayısına bölümü: "+sonuc);
				}
				i++;
			}
		}
		else {
			System.out.print("En fazla 4 basamaklı bir sayı girebilirsiniz.");
		}
	}

}
