package denemeler;
import java.util.*;
public class ders_soru_35 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Sayý Girin: ");
		int sayi = giris.nextInt();
		String sonuc1 = String.valueOf(sayi);
		String sonuc2 = sonuc1.replace(" ", "");
		System.out.print("Girdiðiniz sayý "+sonuc2.length()+" basamaklý.");
	}

}