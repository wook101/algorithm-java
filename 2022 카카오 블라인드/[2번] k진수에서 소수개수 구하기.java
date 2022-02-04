import java.util.Arrays;

class Solution {
    public int solution(int n, int k) {
        int result = 0;
        String cvtValue = convert(n,k);
        for(String p : cvtValue.split("0")){
            if(p.equals("")) continue;
            if(isPrimeNumber(Long.parseLong(p))) result++;
        }
        return result;
    }
    
    
    public static String convert(int n, int k){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(Integer.valueOf(n%k));
            n = n/k;
        }
        return sb.reverse().toString();
    }
    
    
    public static boolean isPrimeNumber(long p){
        if(p==1) return false;
        for(int i=2;i<=Math.sqrt(p);i++){ 
            if(p%i==0) return false;
        }
        return true;
    }

}
