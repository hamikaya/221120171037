package denemeler;
import java.util.*;
public class ders_soru_5 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Bir ifade girin: ");
		String ifade = giris.nextLine();
		System.out.print("Ýfadenin yazdýrýlma adedini girin: ");
		int ifade_y_a = giris.nextInt();
		for (int i = 1; i<=ifade_y_a; i++) {
			System.out.println(i+" -> "+ifade);
		}
	}

}
