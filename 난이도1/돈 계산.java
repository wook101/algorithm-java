import java.io.*;
import java.util.Stack;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		int sum=0;
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<K;i++){
			int num = Integer.parseInt(br.readLine());
		  if (num==0){
				sum-=stack.pop();	
			}
			else{
				sum+=num;
				stack.add(num);
			}
		}
		System.out.println(sum);
	}
}
