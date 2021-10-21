import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		solution(input);
	}
	static void solution(String st){
		int s=0;
		int e=st.length()-1;
		
		while(s<e){
			System.out.print(st.charAt(s));
			System.out.print(st.charAt(e));
			s++;
			e--;
		}
		if (st.length()%2==1)
			System.out.print(st.charAt(st.length()/2));
		
	}
}
