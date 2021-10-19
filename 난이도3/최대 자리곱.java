import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println(solution(input));
	}
	
	public static int solution(String input){
		if (input.length()==1)
			return Integer.parseInt(input);
		
		int ret = 1;
		int n = input.length();
		for(int i=0;i<n;i++){
			ret *= Character.getNumericValue(input.charAt(i));
		}

		for(int i=0;i<n-1;i++){
			int first = Character.getNumericValue(input.charAt(i));
			int tmp = first==1 ? 1 : first-1;
			tmp *= (int) Math.pow(9,n-i-1);
			for(int j=0;j<i;j++){
				tmp *= Character.getNumericValue(input.charAt(j));
			}
			ret = Math.max(ret,tmp);
		}
		
		return ret;
	}
}
