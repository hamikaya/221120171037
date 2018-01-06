package denemeler;
import java.util.*;
public class ders_soru_6 {

	public static void main(String[] args) {
		int sayac = 0;
		int toplam = 0;
		for (int i = 1; i<=100; i++) {
			if (i%5==0 && i%7!=0) {
				sayac++;
				toplam+=i;
			}
		}
		System.out.println("Toplam: "+toplam);
	}

}
