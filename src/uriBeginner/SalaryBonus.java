package uriBeginner;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryBonus {
	static double fs = 0, tsold = 0; 
	
	public static void read( ){
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		fs = Double.valueOf(scan.next());
		tsold = Double.valueOf(scan.next());
		scan.close();	
	}
	
	public static void calc(){
		double ts = 0, bon = 0;
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		bon = tsold * 0.15;
		ts = fs + bon;
		System.out.println("TOTAL = R$ " + numberFormat.format(ts).toString().replaceAll(",", "."));
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		read();
		calc();
	}

}
