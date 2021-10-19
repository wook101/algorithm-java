import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		solution(input);
	}
	
	public static void solution(String input){
		int n = Integer.parseInt(input);
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<String> list3 = new ArrayList<>();
		for(int i=1;i<=Math.sqrt(n);i++){
			if (n%i==0) 
				list1.add(String.valueOf(i));
		}
		
		for(String num : list1){
			int i_num = Integer.parseInt(num);
			if(i_num*i_num==n)
				continue;
			list2.add(String.valueOf(n/i_num));
		}
		
		Collections.reverse(list2);
		list3.addAll(list1);
		list3.addAll(list2);
		
		for(String val : list3)
			System.out.print(val+" ");
	}
}
