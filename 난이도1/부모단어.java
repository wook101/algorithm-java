import java.io.*;
import java.util.ArrayList;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		String parent=input[0];
		String child=input[1];
		
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<parent.length();i++){
				list.add(parent.charAt(i));
		}
		for(int i=0;i<child.length();i++){
			if(!list.contains(child.charAt(i))){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		
	}
}
