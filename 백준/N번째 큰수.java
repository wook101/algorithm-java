import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list.add(arr);
        }
        solution(list);
    }

    public static void solution(ArrayList<int[]> list){
        for(int[] arr: list){
            Arrays.sort(arr);
            System.out.println(arr[7]);
        }
    }
    
}
