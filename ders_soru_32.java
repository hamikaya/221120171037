package denemeler;
import java.util.*;
public class ders_soru_32 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Say� Girin: ");
		int sayi = giris.nextInt();
		if (50<=sayi) {
			System.out.print("Girilen say� 50'den b�y�k. Say�n�n y�zde 10'u: "+sayi*0.10);
		}
		else {
			System.out.print("Girilen say� 50'den k���k. Say�n�n y�zde 25'i: "+sayi*0.25);
		}
	}

}
