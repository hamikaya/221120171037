package denemeler;
import java.util.*;
public class ders_soru_30 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Cümle Girin: ");
		String cumlee = giris.nextLine();
		String cumle = " "+cumlee+" ";
		String cumle1 = cumle.replace(" ", "");
		int cu = cumle1.length();
		String ok = "!'^+%&/()=?_*-,.1234567890>£#$½6{[]}|";
		int sayac = cu;
		for (int i = 0; i<=cu+1; i++) {
			for (int a = 0; a<=ok.length()-1; a++) {
				if (ok.charAt(a)==cumle.charAt(i)) {
					sayac--;
					System.out.println("Özel karakter tespit edildi: "+ok.charAt(a));
				}
			}
		}
		System.out.print("Girdiğiniz cümledeki harf sayısı: "+sayac);
	}

}
