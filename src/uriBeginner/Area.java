package uriBeginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Locale;

public class Area {
	
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
	
	public static void area() throws NumberFormatException, IOException{
		double pi = (float) 3.14159;
		double trian, cir, trap, squard, rect;
		double A, B, C;
		String res = "";
		Scanner sc = new Scanner();
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		trian = (A * C) / 2;
		cir = pi * C * C;
		trap = ((A + B) / 2) * C;
		squard = B * B;
		rect = A * B;
		
		System.out.printf(Locale.US,"TRIANGULO: %.3f\n" , trian);
		System.out.printf(Locale.US,"CIRCULO: %.3f\n" , cir);
		System.out.printf(Locale.US,"TRAPEZIO: %.3f\n" , trap);
		System.out.printf(Locale.US,"QUADRADO: %.3f\n"  , squard);
		System.out.printf(Locale.US,"RETANGULO: %.3f\n" , rect);
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		area();
	}
	
}
