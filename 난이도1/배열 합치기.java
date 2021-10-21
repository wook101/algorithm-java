import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr1 = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");
		String[] arr3 = br.readLine().split(" ");
		
		solution(arr2,arr3);
	}
  
	static void solution(String[] arr2, String[] arr3){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr2.length;i++){
			list.add(Integer.parseInt(arr2[i]));
		}
		for(int i=0;i<arr3.length;i++){
			list.add(Integer.parseInt(arr3[i]));
		}
		Collections.sort(list);
		for(int num: list){
			System.out.print(num);
			System.out.print(" ");
		}
		
	}
}
