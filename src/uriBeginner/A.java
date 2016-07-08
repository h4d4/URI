package uriBeginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class A {
	
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
	
	public static void main(String args[]) throws IOException { 
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean[] a = new boolean[M];
		for(int i = 0; i < N; i++) {
			int X = sc.nextInt();
			for(int j = 0; j < X; j++)
				a[sc.nextInt() - 1] = true;
		}
		boolean ans = true;
		for(int i = 0; i < M; i++) {
			if (a[i])
				continue;
			else
				ans = false;
		}
		if (ans)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}