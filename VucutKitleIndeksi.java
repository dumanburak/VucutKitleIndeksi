import java.util.Scanner;
public class VucutKitleIndeksi {

	public static void main(String[] args) {
		double boy,vki;
		int kilo;
		Scanner input = new Scanner(System.in);
		
		System.out.print("L�tfen boyunuzu (metre cinsinde) giriniz: ");
		boy = input.nextDouble();
		System.out.print("L�tfen kilonuzu giriniz: ");
		kilo = input.nextInt();
		
		vki = kilo / (boy*boy);
		System.out.println("V�cut Kitle �ndeksiniz: "+vki);
		input.close();
	}

}
