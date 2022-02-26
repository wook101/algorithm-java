import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        solution(st);
    }
    public static void solution(String st){
        int count = 0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='P'){
                count++;
                continue;
            }

            if(count>=2 && i+1<st.length() && st.charAt(i+1)=='P'){
                count--;
                i++;
            }else{
                System.out.print("NP");
                return;
            }
        }
        if(count==1){
            System.out.print("PPAP");
        }else{
            System.out.print("NP");
        }
    }

}
