package denemeler;
import java.util.*;
public class ders_soru_8 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Say� Girin: ");
		int sayi = giris.nextInt();
		if (sayi%2==0) {
			System.out.print("Girdi�iniz say� ("+sayi+") �ift.");
		}
		else {
			System.out.print("Girdi�iniz say� ("+sayi+") tek.");
		}
	}

}
