package denemeler;
import java.util.*;
public class ders_soru_36 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int sayi[] = new int [10];
		int enbuyuk = 0;
		int enkucuk = 999;
		for (int i = 0; i<10; i++) {
			System.out.print((i+1)+". sayıyı girin:");
			sayi[i] = giris.nextInt();
			enbuyuk = Math.max(sayi[i], enbuyuk);
			enkucuk = Math.min(sayi[i], enkucuk);
		}
		System.out.println("En büyük değer: "+enbuyuk);
		System.out.println("En küçük değer: "+enkucuk);
		System.out.print("En büyük ve en küçük değerlerin toplamı ise "+(enbuyuk+enkucuk));
	}

}
