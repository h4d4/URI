package uriBeginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class SimpleSort {
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
	public static void sort() throws NumberFormatException, IOException{
		Scanner sc = new Scanner();
		ArrayList<Integer>values = new ArrayList<Integer>();
		int a = 0, b = 0,c = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		values.add(a);
		values.add(b);
		values.add(c);
		if(values.get(0) > values.get(1)){
			Collections.swap(values, 0, 1);
		}
		if(values.get(1) > values.get(2)){
			Collections.swap(values, 1, 2);
		}
		if(values.get(0) > values.get(1)){
			Collections.swap(values, 0, 1);
		}
		System.out.println(values.get(0) + "\n" + values.get(1) + "\n" + values.get(2) + "\n");
		System.out.println(a + "\n" + b + "\n" + c);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		sort();
	}
}
