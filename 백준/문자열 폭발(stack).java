import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String target = br.readLine();
        solution(st,target);
	}
    
    static void solution(String st, String target){
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<st.length();i++){
            sb1.append(st.charAt(i));
            if(sb1.length()>=target.length()){
                StringBuilder sb2 = new StringBuilder();
                for(int j=0;j<target.length();j++){
                    sb2.append(sb1.charAt(sb1.length()-1));
                    sb1.deleteCharAt(sb1.length()-1);
                }
                if (!sb2.reverse().toString().equals(target)){
                  for(int j=0;j<target.length();j++){
                     sb1.append(sb2.charAt(j));    
                  }   
                }
            }
        }
        
        if (sb1.toString().equals("")){
        	System.out.print("FRULA");
        }
        else{
        	System.out.print(sb1.toString());
        }
        
        
    }
}
