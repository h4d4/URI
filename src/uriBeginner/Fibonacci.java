package uriBeginner;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
	
	static ArrayList<Integer> serie = new ArrayList<Integer>();
	static int N = 0;
	public static void read( ){
		Scanner scan = new Scanner(System.in);
		N = Integer.valueOf(scan.next());
		scan.close();	
	}
	
	public static void fib(int n){
		serie.add(0);
		serie.add(1);
		if(n>1){
			for(int i = 2; i < n; i++) {
				int value = serie.get(i-1) + serie.get(i-2);
				serie.add(value);
			}	
		}
		System.out.print("0");
		for(int i = 1; i < n; i++) {
			System.out.print(" " + serie.get(i) );
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		fib(N);
	}

}
