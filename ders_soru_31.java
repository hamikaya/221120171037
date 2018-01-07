package denemeler;
import java.util.*;
public class ders_soru_31 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Sayý Girin: ");
		int sayi1 = giris.nextInt();
		System.out.print("Sayý Girin: ");
		int sayi2 = giris.nextInt();
		System.out.print("Sayý Girin: ");
		int sayi3 = giris.nextInt();
		System.out.print("Sayý Girin: ");
		int sayi4 = giris.nextInt();
		System.out.print("Sayý Girin: ");
		int sayi5 = giris.nextInt();
		System.out.print("Sayý Girin: ");
		int sayi6 = giris.nextInt();
		System.out.print("Sayý Girin: ");
		int sayi7 = giris.nextInt();
		System.out.print("Sayý Girin: ");
		int sayi8 = giris.nextInt();
		System.out.print("Sayý Girin: ");
		int sayi9 = giris.nextInt();
		System.out.print("Sayý Girin: ");
		int sayi10 = giris.nextInt();
		int sonuc1 = Math.max(sayi1, sayi2);
		int sonuc2 = Math.max(sayi3, sayi4);
		int sonuc3 = Math.max(sayi5, sayi6);
		int sonuc4 = Math.max(sayi7, sayi8);
		int sonuc5 = Math.max(sonuc1, sonuc2);
		int sonuc6 = Math.max(sonuc3, sonuc4);
		int sonuc7 = Math.max(sonuc5, sonuc6);
		int sonuc8 = Math.max(sayi9, sonuc7);
		int sonucc1 = Math.min(sayi1, sayi2);
		int sonucc2 = Math.min(sayi3, sayi4);
		int sonucc3 = Math.min(sayi5, sayi6);
		int sonucc4 = Math.min(sayi7, sayi8);
		int sonucc5 = Math.min(sonucc1, sonucc2);
		int sonucc6 = Math.min(sonucc3, sonucc4);
		int sonucc7 = Math.min(sonucc5, sonucc6);
		int sonucc8 = Math.min(sayi9, sonucc7);
		System.out.print("Girilen sayýnýn en büyüðü "+sonuc8+", en küçüðü ise "+sonucc8+".");
	}

}
