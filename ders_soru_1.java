package denemeler;
import java.util.*;
public class ders_soru_1 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int toplam = 0;
		int sonuc = 0;
		while(toplam<15) {
			toplam++;
			System.out.print(toplam+". Sayý : ");
			int sayi = giris.nextInt();
			sonuc=sonuc+sayi;
		}
		System.out.println("Sonuç: "+sonuc);
	}

}
