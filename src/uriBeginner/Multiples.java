package uriBeginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Multiples {
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
	
	public static void multiple() throws NumberFormatException, IOException{
		Scanner sc = new Scanner();
		int a,b,m,l = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b){
			m = a;
			l = b;
		}else{
			m = b;
			l = a;
		}
		
		if(m % l == 0)
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		multiple();
	}
}
