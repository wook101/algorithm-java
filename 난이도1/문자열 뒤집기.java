import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		solution(input);
	}
	
	public static void solution(String st){
		for(int i=st.length()-1;i>=0;i--){
			System.out.print(st.charAt(i));
		}
	}
}
