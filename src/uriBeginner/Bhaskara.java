package uriBeginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class Bhaskara {

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
		public float nextFloat() throws NumberFormatException, IOException{
			return Float.valueOf(next());
		}
	}
	
	public static void root() throws NumberFormatException, IOException {
		double A, B, C, r1, r2, rest;
		Scanner sc = new Scanner();
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		rest = (B * B) - (4 * A * C); 
		
		if(A == 0 || rest < 0){
			System.out.println("Impossivel calcular");
		}else{
			r1 = (- B + Math.sqrt(rest)) / ( 2 * A); 
			r2 = (- B - Math.sqrt(rest)) / ( 2 * A); 
			
			System.out.printf(Locale.US, "R1 = %.5f\n" , r1);
			System.out.printf(Locale.US, "R2 = %.5f\n" , r2 );
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		root();
	}
	
}
