package uriBeginner;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	static double sh = 0, h = 0; 
	static int en = 0;
	
	public static void read( ){
		Scanner scan = new Scanner(System.in);
		en = Integer.valueOf(scan.next());
		sh = Double.valueOf(scan.next());
		h = Double.valueOf(scan.next());
		scan.close();	
	}
	
	public static void calc(){
		double ts = 0;
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		ts = sh * h;
		System.out.println("NUMBER = " + en);
		System.out.println("SALARY = U$ " + numberFormat.format(ts).toString().replaceAll(",", "."));
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		read();
		calc();
	}

}
