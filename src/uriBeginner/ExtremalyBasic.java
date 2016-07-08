package uriBeginner;

import java.io.IOException;
import java.util.Scanner;


public class ExtremalyBasic {
	
	static int sum = 0, a = 0, b = 0;
	
	public static void read( ){
		Scanner scan = new Scanner(System.in);
		a = Integer.valueOf(scan.next());
		b = Integer.valueOf(scan.next());
		scan.close();	
	}
    	
	public static void sum( ){
		sum = a + b;
		System.out.println("X = " + sum);
	
    }
 
    public static void main(String[] args) throws IOException {
         read();
		 sum();
 
    }
	
}
