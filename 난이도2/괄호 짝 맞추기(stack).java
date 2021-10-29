import java.io.*;
import java.util.Stack;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		System.out.println(solution(st));
	}
  
	static String solution(String st){
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<st.length();i++){
			char c = st.charAt(i);
		  if(c==')'){
				if(!stack.isEmpty() && stack.peek()=='(')
					stack.pop();
				else
					return "False";
			}
			else if(c=='}'){
				if(!stack.isEmpty() && stack.peek()=='{')
					stack.pop();
				else
					return "False";
			}
			else if(c==']'){
				if(!stack.isEmpty() && stack.peek()=='[')
					stack.pop();
				else
					return "False";
			}
			else{
				stack.add(c);
			}
		}
    
		if (!stack.isEmpty())
			return "False";
		
		return "True";
	}
	
}
