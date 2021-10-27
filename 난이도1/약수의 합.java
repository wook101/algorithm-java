import java.io.*;
import java.util.ArrayList;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=1;i<=n;i++){
			if (n%i==0)
				sum+=i;
		}
		System.out.print(sum);
	}

}
