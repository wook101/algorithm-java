import java.io.*;
import java.util.*;
import java.util.stream.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		solution(input);
	}

	public static void solution(String input){
		String[] arr =  input.split(" ");
		int[] arr2 = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arr2[i] = Integer.parseInt(arr[i]);
		}
		int sum = IntStream.of(arr2).sum();
		float avg = sum/(float)arr.length;
		System.out.printf("%.2f %c", avg, getGrade(sum/arr.length));
	
	}
  
  public static char getGrade(int score){
		char grade = ' ';
		switch(score/10){
			case 10: 
			case 9: grade='A';
				break;
			case 8: grade='B';
				break;
			case 7: grade='C';
				break;
			case 6: grade='D';
				break;
			default: grade='F';
		}
		return grade;
	}
	
}
