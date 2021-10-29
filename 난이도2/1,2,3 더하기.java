import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}
  
	static int solution(int n){
		int[] dp = new int[12];
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
    
		for(int i=4;i<=n;i++){
			dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
		}
    
		return dp[n];
	}
}
