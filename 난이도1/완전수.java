import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		solution(input);
	}
	public static void solution(String input){
		String[] stArr = input.split(" ");
		int A = Integer.parseInt(stArr[0]);
		int B = Integer.parseInt(stArr[1]);
		
		for(int num=A;num<=B;num++){
			int tmp = 0;
			for(int i=1;i<=Math.sqrt(num);i++){
				if (num%i==0 && num!=i){
					tmp+=i;
					if (i!=1)
						tmp+=num/i;
				}
			}
			if (tmp==num){
				System.out.print(num);
				System.out.print(" ");
			}
		}
		
	}
}
