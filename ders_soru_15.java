package denemeler;
import java.util.*;

public class ders_soru_15 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("C�mle Girin:");
		String cumle = giris.nextLine();
		int harf_sayi = cumle.length();
		System.out.print("Girdi�iniz c�mlenin tersten yaz�l���: ");
		for (int i = harf_sayi-1; i>=0; i--) {
			System.out.print(cumle.charAt(i));
		}
	}

}
