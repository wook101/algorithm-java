import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.print(solution(input));
	}
	
  
	public static int solution(String input){
		int n = Integer.parseInt(input);
		int count = 0;
		for(int num=1;num<n;num++){
			String st_num = String.valueOf(num);
			for(int i=0;i<st_num.length();i++){
				if (st_num.charAt(i)=='0') 
					continue;
				if (Character.getNumericValue(st_num.charAt(i))%3==0)
					count++;
				}
		}
		return count;
	}
		
}
