/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		double Armut,Elma,Domates,Muz,Patlıcan;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Armut Kaç Kilo  : ");
		Armut = inp.nextInt();
		
		System.out.print("Elma Kaç Kilo : ");
		Elma= inp.nextInt();
		
		System.out.print("Domates Kaç Kilo : ");
		Domates= inp.nextInt();
		
		System.out.print("Muz Kaç Kilo : ");
		Muz= inp.nextInt();
		
		System.out.print("Patlıcan Kaç Kilo : ");
		Patlıcan= inp.nextInt();
	
		double toplam =(Armut+Elma+Domates+Muz+Patlıcan);
		System.out.println("toplam tutar: " + toplam);
	
	}
}



