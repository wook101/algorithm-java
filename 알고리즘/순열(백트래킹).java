import java.io.*;
import java.util.ArrayList;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> tmp = new ArrayList<>();
		ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
		
		//순열 백트래킹
		permuation(n,tmp,ret);
		
		//순열 리스트 출력
		for(ArrayList<Integer> list : ret){
			System.out.println(list);
		}
	}
	static void permuation(int n, ArrayList<Integer> tmp, ArrayList<ArrayList<Integer>> ret){
		//종료조건
		if (tmp.size()==n){
			ret.add((ArrayList<Integer>)tmp.clone());
			return;
		}
		
		//과정
		for(int i=1;i<=n;i++){
			if (tmp.contains(i))
				continue;
			tmp.add(i);
			permuation(n,tmp,ret);    //재귀
			tmp.remove(tmp.size()-1);
		}
		
	}
}
