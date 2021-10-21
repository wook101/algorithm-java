import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		solution(input);
		
	}
	public static void solution(String input){
		double r = Double.parseDouble(input);
		System.out.printf("%.2f",2*r*3.14);
	}
}
