package denemeler;
import java.util.*;
public class ders_soru_3 {

	public static void main(String[] args) {
		int sayi = 46;
		int toplam = 0;
		while (sayi<225) {
			if (sayi%7==0) {
				toplam = toplam+sayi;
			}
			sayi+=2;
		}
		System.out.print("Sonuç: "+toplam);
	}

}
