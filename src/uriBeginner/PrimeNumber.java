package uriBeginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumber {
	static class Scanner{
		BufferedReader br=null;
		StringTokenizer tk=null;
		public Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() throws IOException{
			while(tk==null || !tk.hasMoreTokens())
				tk=new StringTokenizer(br.readLine());
			return tk.nextToken();
		}
		public int nextInt() throws NumberFormatException, IOException{
			return Integer.valueOf(next());
		}
		public long nextLong() throws NumberFormatException, IOException{
			return Long.valueOf(next());
		}
		public double nextDouble() throws NumberFormatException, IOException{
			return Double.valueOf(next());
		}
	}
	
	public static void isPrime ( int x ) {
		boolean prime = true;
		for (int j = 2; j * j <= x; j++) {
			prime = true;
			if( x % j == 0){
				prime = false;
				System.out.println(x + " nao eh primo");
				break;
			}
		}
		
		if (prime) {
			System.out.println(x + " eh primo");
		}
	}

	public static void main(String args[]) throws IOException { 
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			isPrime(x);
		}
	}
/*
4
8
7
51
137
*/
}
