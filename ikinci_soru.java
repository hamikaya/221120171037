package algoritma;
import java.util.*;
public class ikinci_soru {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Cümle Girin:");
		String cumle = giris.nextLine();
		int harf_sayi = cumle.length();
		System.out.print("Girdiðiniz cümlenin tersten yazýlýþý: ");
		for (int i = harf_sayi-1; i>=0; i--) {
			System.out.print(cumle.charAt(i));
		}
		int kelime_sayisi=0;
		for (int i=0; i<cumle.length(); i++) {
			if (cumle.charAt(i)==' ')
				kelime_sayisi++;
		}
		String cumle1= cumle.replace(" ","");
		int h_s = cumle1.length();
		System.out.println("\nGirdiðiniz cümle "+h_s+" karakter içeriyor.");
		String cumle2[] = cumle.split(" ");
		for (int cu = 0; cu<=kelime_sayisi ; cu++) {
			System.out.println(cu+1+". kelime: "+cumle2[cu]);
		}
		String alfabe_karakter = "0123456789ABCDEFGHIÝJKLMNOÖPQRSÞTUÜVWXYZabcdefghýijklmnoöpqrsþtuüvwxyz.?";
		int[] alfabe_karakter_dizi = new int[alfabe_karakter.length()]; 
		for (int i = 0; i < cumle.length(); i++) {
			int index = alfabe_karakter.indexOf(cumle.charAt(i));
			if (index < 0) {
				continue;
			}
			alfabe_karakter_dizi[index]++;
			}
			for (int i = 0; i < alfabe_karakter_dizi.length; i++) {
				if (alfabe_karakter_dizi[i] < 1) {
					continue;
				}
				System.out.println(alfabe_karakter.charAt(i)+" harfi "+alfabe_karakter_dizi[i]+" kez tekrar etti.");
				}
		}
	}

