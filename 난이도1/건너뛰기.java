import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		solution(input);
	}
	
	
	public static void solution(String input){
		int n = Integer.parseInt(input);
		int[] dp = new int[n];
		for(int i=0;i<n;i++){
			dp[i] = i<4 ? i+1 : dp[i-2]+dp[i-4];
			System.out.println(dp[i]);
		}
	}
	
}
