import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input);
		String [] arr = new String[n];
		for(int i=0;i<n;i++){
			arr[i] = br.readLine();
		}
		solution(arr);
	}
	
	
	public static void solution(String[] arr){
		String[] charArr = {"a","A","e","E","i","I","o","O","u","U"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(charArr));
		ArrayList<String> res = new ArrayList<>();
		int n = arr.length;

		for(int i=0;i<n;i++){
			String st = arr[i];
			StringBuffer sb = new StringBuffer();
			for(int j=0;j<st.length();j++){
				if (list.contains(String.valueOf(st.charAt(j)))){
					sb.append(st.charAt(j));
				}
			}
			
			if (sb.toString().equals("")){
				res.add("???");	
			}
			else{
				res.add(sb.toString());	
			}
			
		}
		
		for(String s : res){
			System.out.println(s);
		}
		
	}
	
}
