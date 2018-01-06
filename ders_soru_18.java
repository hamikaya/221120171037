package denemeler;
import java.util.*;
public class ders_soru_18 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Celcius değerini girin: ");
		double sayi = giris.nextDouble();
		double fahrenheit = sayi*1.8+32;
		System.out.print(sayi+" Celcius, "+fahrenheit+" Fahrenheit'e eşittir.");
	}

}
