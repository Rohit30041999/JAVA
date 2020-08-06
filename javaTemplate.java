// template:

import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	private static void solve() throws Exception {
		// your code goes here.
	}
	
	public static void main(String[] args) throws Exception {
		int t=1; // we always have atleast one test case...
		String T = read();
		if(T != null) t = Integer.parseInt(T);

		while(t-- > 0) {
			solve();
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

	private static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}

	private static long gcd(long a, long b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}

	private static String read() throws Exception {
		String value = br.readLine();
		if(value == null) throw new Exception();
		return value; 
	}

	private static void print(String value, String... escapeCharacter) throws Exception { // String... used for taking default args(any number of args).
		if(value == null) throw new Exception();
		int numberOfArguments = 0;
		for(String arg: escapeCharacter) numberOfArguments++;
		if(numberOfArguments == 0) escapeCharacter = new String[]{""};
		bw.write(value + escapeCharacter[0]);
	}
	
	private static void println(String value, String... escapeCharacter) throws Exception {
		if(value == null) throw new Exception();
		int numberOfArguments = 0;
		for(String arg: escapeCharacter) numberOfArguments++;
		if(numberOfArguments == 0) escapeCharacter = new String[]{"\n"};
		bw.write(value + escapeCharacter[0]);
	}

	private static <T extends Comparable<T>> String str(T value) throws Exception {
		if(value == null) throw new Exception();
		return String.valueOf(value);
	}
}
