package uriBeginner;

import java.util.Scanner;

public class Interval {

	public static void inInterval(){
		Scanner scan = new Scanner(System.in);
		float v = Float.parseFloat(scan.next());
		scan.close();	
		
		if(v < 0 | v > 100)
			System.out.println("Fora de intervalo" );
		
		if(v >= 0 & v <= 25)
			System.out.println("Intervalo [0,25]" );
		
		if(v > 25 & v <= 50)
			System.out.println("Intervalo (25,50]" );
		
		if(v > 50 & v <= 75)
			System.out.println("Intervalo (50,75]" );
		
		if(v > 75 & v <= 100)
			System.out.println("Intervalo (75,100]" );
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inInterval();
	}

}
