import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String str = br.readLine();
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        solution(str,n,k);
    }
    
    static void solution(String str, int n, int k){
        Deque<Character> dq = new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            while(!dq.isEmpty() && k>0 && dq.getLast() < str.charAt(i) ){
                dq.removeLast();
                k--;
            }
            dq.add(str.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        while(dq.size()>k){
            sb.append(dq.pollFirst());
        }
        
        System.out.print(sb.toString());
    }
}
