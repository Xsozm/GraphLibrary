import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Vector;


public class Solve {
	static PrintWriter out = new PrintWriter(System.out);
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) throws Exception {
		int n =sc.nextInt();
		long ans = 0L;
		for(int i=2;i<n;i++) {
			long x = n/i ; 
			
			long cnt = ((x)*(x+1))/2;
			cnt--;
			//System.out.println(cnt);
			ans+=(cnt)*4;
		}
		System.out.println(ans);
		
		
	}
	

	


}




















class Point{
	int x ; 
	int y ;
	 
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	void print() {
		System.out.println(x+" "+y);
	}
	
	double slope() {
		return (double)y/x*1.0;
	}
	
	
	
}

class point implements Comparable{
	int x ,y,z;
	point(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	@Override
	public int compareTo(Object arg0) {
		
		point u =((point)arg0);
		
		return -this.z+u.z;
	}
}
 	


	    
	    
	    



class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream s) {
		br = new BufferedReader(new InputStreamReader(s));
	}

	public Scanner(String f) throws FileNotFoundException {
		br = new BufferedReader(new FileReader(f));
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public boolean ready() throws IOException {
		return br.ready();
	}

	public int[] nextIntArray(int n) throws IOException {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public int[] nextIntArray1(int n) throws IOException {
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++)
			a[i] = nextInt();
		return a;
	}

	public int[] shuffle(int[] a, int n) {
		int[] b = new int[n];
		for (int i = 0; i < n; i++)
			b[i] = a[i];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			int j = i + r.nextInt(n - i);
			int t = b[i];
			b[i] = b[j];
			b[j] = t;
		}
		return b;
	}

	public int[] nextIntArraySorted(int n) throws IOException {
		int[] a = nextIntArray(n);
		a = shuffle(a, n);
		Arrays.sort(a);
		return a;
	}

	public long[] nextLongArray(int n) throws IOException {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}

	public long[] nextLongArray1(int n) throws IOException {
		long[] a = new long[n + 1];
		for (int i = 1; i <= n; i++)
			a[i] = nextLong();
		return a;
	}

	public long[] nextLongArraySorted(int n) throws IOException {
		long[] a = nextLongArray(n);
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			int j = i + r.nextInt(n - i);
			long t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		Arrays.sort(a);
		return a;
	}
}