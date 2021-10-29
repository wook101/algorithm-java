import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int M = Integer.parseInt(input[0]);
		int N = Integer.parseInt(input[1]);
		solution(M,N);
	}
  
	static void solution(int M, int N){
		int sum = 0;
		int min = 0;
		for(int i=M;i<=N;i++){
			if (Math.sqrt(i)-(int)Math.sqrt(i)==0){
				sum+=i;
				if (min==0)
					min=i;
			}
		}
		System.out.println(min+" "+sum);
	}
  
}
