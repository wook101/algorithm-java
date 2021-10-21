import java.io.*;
import java.util.HashMap;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input);
		String[] arr = new String[n];
		for(int i=0; i<n;i++){
			arr[i] = br.readLine();
		}
		solution(arr);
	}
  
	public static void setDatabase(HashMap<String,String> map){
		map.put("smile 1234","0001");
		map.put("hello 2345","0002");
		map.put("sun 0908","0003");
		map.put("computer 0303","0004");
		map.put("car 5252","0005");
		map.put("cake 5782","0006");
		map.put("pen 6357","0007");
		
	}
  
	public static void solution(String[] arr){
		HashMap<String,String> map = new HashMap<>();
		setDatabase(map);
		for(int i=0;i<arr.length;i++){
			if (map.get(arr[i])!=null){
				System.out.println(map.get(arr[i]));
			}else{
				System.out.println("ERROR");
			}	
		}
	}
}
