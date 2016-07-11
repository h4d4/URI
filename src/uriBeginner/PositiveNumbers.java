package uriBeginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class PositiveNumbers {

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
	
	public static void positive() throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner();
		ArrayList<Double> numbers = new ArrayList<Double>(); 
		int pot = 0;
		for(int i = 0; i <=5; i++){
			numbers.add(i, sc.nextDouble());
		}
		for(int i = 0; i <=5; i++){
			if(numbers.get(i) > 0)
				pot += 1;
		}
		System.out.println(pot + " valores positivos");
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		positive();
	}

}
