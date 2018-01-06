package denemeler;
import java.util.Scanner;
public class ders_soru_19 {

	public static void main(String[] args) {
		int[] dizi = {25,10,59,40,190,21};
		for (int i = 0; i<=0; i++) {
			int sonuc = Math.max(dizi[i], dizi[i+1]);
			int sonuc1 = Math.max(sonuc, dizi[i+2]);
			int sonuc2 = Math.max(sonuc1, dizi[i+3]);
			int sonuc3 = Math.max(sonuc2, dizi[i+4]);
			System.out.print("Dizinin en büyük elemaný "+sonuc3);
		}
	}

}
