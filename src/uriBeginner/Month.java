package uriBeginner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Month {
	
	public static void getMonth(){
		Scanner scan = new Scanner(System.in);
		int m = Integer.valueOf(scan.next());
		Map <Integer,String>months = new HashMap<Integer,String>();
		
		months.put(1,"January");
		months.put(2,"February");
		months.put(3,"March");
		months.put(4,"April");
		months.put(5,"May");
		months.put(6,"June");
		months.put(7,"July");
		months.put(8,"August");
		months.put(9,"September");
		months.put(10,"October");
		months.put(11,"November");
		months.put(12,"December");
		
		System.out.println(months.get(m));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMonth();
	}

}
