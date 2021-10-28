import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.print(fiboSum(n));
	}
	static int fiboSum(int n){
		if (n<=2)
			return n-1;
		int sum=0;
		int[] dp = new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++){
			dp[i] = dp[i-2]+dp[i-1];
		}
		for(int i=0;i<=n;i++){
			sum+=dp[i];
		}
		return sum;
		
	}
}
