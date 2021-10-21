import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		String[] range = br.readLine().split(" ");
		System.out.println(solution(n,arr,range));
	}
	
	static int solution(int n, String[] arr, String[] range){
		int[] dp = new int[n];
		int start = Integer.parseInt(range[0])-1;
		int end = Integer.parseInt(range[1])-1;
		dp[0]=Integer.parseInt(arr[0]);

		for(int i=1;i<n;i++){
			dp[i]=dp[i-1]+Integer.parseInt(arr[i]);
		}
		int ret = start==0 ? dp[end] : dp[end]-dp[start-1];
		return ret;
		
	}
}
