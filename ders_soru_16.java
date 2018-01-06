package denemeler;
import java.util.*;
public class ders_soru_16 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Cümle Girin: ");
		String cumle = giris.nextLine();
		int kelime_sayisi=0;
		for (int i=0; i<cumle.length(); i++) {
			if (cumle.charAt(i)==' ')
				kelime_sayisi++;
		}
		String cumle1= cumle.replace(" ","");
		int h_s = cumle1.length();
		String cumle2[] = cumle.split(" ");
		String alfabe_karakter = "0123456789ABCDEFGHIÝJKLMNOÖPQRSÞTUÜVWXYZabcdefghýijklmnoöpqrsþtuüvwxyz.?";
		for (int cu = 0; cu<=kelime_sayisi ; cu++) {
			System.out.println(cu+1+". kelime: "+cumle2[cu]);
			int[] alfabe_karakter_dizi = new int[alfabe_karakter.length()]; 
			for (int i = 0; i < cumle.length(); i++) {
				int harf_kontrol = alfabe_karakter.indexOf(cumle.charAt(i));
				if (harf_kontrol < 0) {
					continue;
				}
				alfabe_karakter_dizi[harf_kontrol]++;
				}
			}
	}

}
