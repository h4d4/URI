package uriBeginner;

import java.util.Scanner;

public class TimeConvertion {
	static int time = 0; 
	
	public static void read( ){
		Scanner scan = new Scanner(System.in);
		time = Integer.valueOf(scan.next());
		scan.close();	
	}
	
	public static void convert( ){
		int m = 0, h = 0;
		if(time >= 3600)
			h = time / 3600;
		
		time = time - (h * 3600);
		
		if(time >= 60)
			m = time / 60;
		
		time = time - (m * 60);
		
		System.out.println(h + ":" + m + ":" + time);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		convert();
	}
}
