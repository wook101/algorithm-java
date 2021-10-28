import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		solution(st);
	}
	static void solution(String st){
		StringBuilder sb = new StringBuilder();
		int left=0;
		int right=st.length()-1;
		while(left<right){
			sb.append(st.charAt(left));
			sb.append(st.charAt(right));
			left++;
			right--;
		}
		if (st.length()%2==1)
			sb.append(st.charAt(st.length()/2));
		System.out.print(sb.toString());
	}
}
