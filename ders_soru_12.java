package denemeler;
import java.util.*;
public class ders_soru_12 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Say� Girin: ");
		int sayi1 = giris.nextInt();
		System.out.print("Say� Girin: ");
		int sayi2 = giris.nextInt();
		System.out.print("Say� Girin: ");
		int sayi3 = giris.nextInt();
		int sonuc1 = Math.max(sayi1, sayi2);
		int sonuc2 = Math.max(sonuc1, sayi3);
		System.out.print("Girdi�iniz say�lar�n en b�y���: "+sonuc2);
	}

}
