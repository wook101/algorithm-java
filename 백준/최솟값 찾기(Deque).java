import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;

class Element{
     int index;
     int num;
     Element(int index, int num){
         this.index = index;
         this.num = num;
    }
}   

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
        Deque<Element> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        for(int index=0;index<N;index++){
            //삽입 원소와 맨뒤의 원소를 비교하면서 비교대상의 원소가 더 크면 게속 꺼낸다.
            while (!dq.isEmpty() && dq.peekLast().num > arr[index]){
                dq.removeLast();
            }
            
            //원소 추가
            dq.add(new Element(index, arr[index]));
            
            //예외) 맨앞에 있는 원소가 현재 범위 밖에 있을 경우 뺌 (덱의 첫번째 원소의 인덱스<index-L+1)
            if (dq.peekFirst().index < index-L+1){
                dq.removeFirst();
            }
            
            //최소값인 원소 저장
            sb.append(String.valueOf(dq.peekFirst().num));
            if(index!=N-1)
       			sb.append(" ");
        }
        
        System.out.print(sb);
    }
    
}
