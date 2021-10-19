import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.print((solution(input)));	
	}
	
	
	public static String solution(String input){
		int n = Integer.parseInt(input);
		String res = (n%2==0) ? "even" : "odd";
		return res;
	}
	
}
