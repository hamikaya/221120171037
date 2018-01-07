package denemeler;
import java.util.*;
public class ders_soru_28 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Sayı Girin: ");
		int sayi1 = giris.nextInt();
		int sayac = 0;
		String sayi = Integer.toString(sayi1);
		for (int i = sayi.length()-1; i>=0; i--) {
			for (int a = 0; a<sayi.length(); a++) {
				if (sayi.charAt(a)==sayi.charAt(i)) {
					sayac++;
					System.out.println(sayac);
				}
			}
		}
		if (sayac/sayi.length()==sayi.length() || sayac!=sayi.length()) {
			System.out.print(sayi1+" sayısı palindromdur.");
		}
		else {
			System.out.print(sayi1+" sayısı palindrom değildir.");
		}
	}

}
