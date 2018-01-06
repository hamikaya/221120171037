package denemeler;
import java.util.*;
public class ders_soru_14 {

	public static void main(String[] args) {
		for (int i = 1; i<=100; i++) {
			System.out.print(i+" sayýsýnýn bölenleri:");
			for (int a = 1; a<=100; a++) {
			if (i%a==0) {
				System.out.print("["+a+"]");
			}
		}
			System.out.print("\n");
	}
	}
}
