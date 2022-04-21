import java.util.Scanner;
public class VucutKitleIndeksi {

	public static void main(String[] args) {
		double boy,vki;
		int kilo;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
		boy = input.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz: ");
		kilo = input.nextInt();
		
		vki = kilo / (boy*boy);
		System.out.println("Vücut Kitle Ýndeksiniz: "+vki);
		input.close();
	}

}
