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
		String cumle2[] = cumle.split(" ");
		for (int cu = 0; cu<=kelime_sayisi ; cu++) {
			System.out.println(cu+1+". kelime: "+cumle2[cu]);
			}
	}

}
