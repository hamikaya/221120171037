package denemeler;
import java.util.*;
public class ders_soru_27 {

	public static void main(String[] args) {
		Random rs = new Random();
		int sayac = 0;
		while (sayac!=10) {
			int sayi = rs.nextInt(350);
			if (sayi<350 && sayi>150) {
				sayac++;
				if (sayi%2==0) {
					System.out.println(sayac+". SONU�: "+sayi+" say�s� �ift bir say�.");
				}
				else {
					System.out.println(sayac+". SONU�: "+sayi+" say�s� tek bir say�.");
				}
			}
		}
	}

}
