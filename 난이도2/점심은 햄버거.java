import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] a = br.readLine().split(" ");
		String[] b = br.readLine().split(" ");
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++){
			arr[i][0] = Integer.parseInt(a[i]);
			arr[i][1] = Integer.parseInt(b[i]);
		}
		
		solution(arr);
	}
	
	static void solution(int[][] arr){
		//배열의 0번째 인자기준 내림차순 정렬 o2[0],o1[0] 순서로 변경
		Arrays.sort(arr, (o1,o2)->{
				return Integer.compare(o2[0],o1[0]);	
		});
		
		//먹는데 걸리는 시간을 기준으로 내림차순 정렬 후 식사를 끝냈을때 시간을 저장.
		int end_time = arr[0][0]+arr[0][1];
		int cur_time = arr[0][1];
		for(int i=1;i<arr.length;i++){	
			cur_time += arr[i][1];
			end_time = cur_time+arr[i][0];
		}
		System.out.println(end_time);
	}
	
}
