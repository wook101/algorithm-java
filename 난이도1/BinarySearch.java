import java.io.*;
import java.util.Arrays;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int[] arr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
		int target = Integer.parseInt(br.readLine());
		binarySearch(n,arr,target);
	}
  
  
	static void binarySearch(int n, int[] arr, int target){
		Arrays.sort(arr);
		int left=0;
		int right=n-1;
		while (left<=right){
			int mid = (left+right)/2;
			if (arr[mid]==target){
				System.out.println(mid+1);
				return;
			}
      			else if(arr[mid]<target){
				left=mid+1;
			}
      			else{
				right=mid-1;
			}
		}
		
		System.out.println("X");
	}
}	
