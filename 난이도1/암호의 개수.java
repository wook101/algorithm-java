import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr1 = br.readLine().split(" ");
		int a = Integer.parseInt(arr1[0]);
		int b = Integer.parseInt(arr1[1]);
		int n = Integer.parseInt(arr1[2]);
		int ret=0;
		for(int i=a;i<=b;i++){
			ret+=Math.pow(n,i);
		}
		System.out.print(ret);
		
	}
	
}
