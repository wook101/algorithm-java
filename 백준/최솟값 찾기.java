import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Arrays;
public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr1 = br.readLine().split(" ");
        int N = Integer.parseInt(strArr1[0]);
        int L = Integer.parseInt(strArr1[1]);
        String[] strArr2 = br.readLine().split(" ");
        int[] arr = Arrays.stream(strArr2).mapToInt(Integer::parseInt).toArray();
        solution(N,L,arr);
    }
    
    static void solution(int N, int L, int[] arr){
        PriorityQueue<Integer> cur_pq = new PriorityQueue<>();
        PriorityQueue<Integer> remove_pq = new PriorityQueue<>();
        int ret[] = new int[N];
        for(int i=0;i<N;i++){
            cur_pq.add(arr[i]);
            //삭제 큐
            if (i>=L){
              remove_pq.add(arr[i-L]);  
            }
            
            while(!remove_pq.isEmpty() && remove_pq.peek().equals(cur_pq.peek())){
                remove_pq.poll();
                cur_pq.poll();
            }
            ret[i] = cur_pq.peek();                 
        }
        
        retultPrint(ret,N);
    }
    
    static void retultPrint(int[] ret, int N){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
       	  sb.append(String.valueOf(ret[i]));
       	  if(i!=N-1)
       		sb.append(" ");
        }
        System.out.print(sb);
    }
    
}

//우선순위큐로 구현 시간초과 실패
