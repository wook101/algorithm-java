import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int R = Integer.parseInt(arr[0]);
		int C = Integer.parseInt(arr[1]);
		char[][] board = new char[R][C];
		
		for(int i=0;i<R;i++){
				String st = br.readLine();
				for(int j=0;j<C;j++){
					board[i][j] = st.charAt(j);	
				}
		}
		
		System.out.println(bfs(R,C,board));
	}
	
	public static int bfs(int R,int C,char[][] board){
		//큐하나 만들고 "@" 좌표 모두 넣은 후 bfs탐색
		Queue<int[]> q = new LinkedList<>();
		int[][] visited = new int[R][C];
		
		for(int i=0;i<R;i++){
				for(int j=0;j<C;j++){
					if (board[i][j]=='@'){
						q.add(new int[]{i,j,0});
						visited[i][j]=1;
					}	
				}
		}
		
		int[] dx = {0,0,-1,1};
		int[] dy = {1,-1,0,0};
		int ret = -1;
		while(q.peek()!=null){
			int[] a = q.poll();
			int x = a[0];
			int y = a[1];
			int dist = a[2];
			
			for(int i=0;i<4;i++){
				int rx = x+dx[i];
				int ry = y+dy[i];
				if(rx<0 || ry<0 || rx>=R || ry>=C || board[rx][ry]=='#' || visited[rx][ry]==1)
					continue;
				if(board[rx][ry]=='&')
					return dist;
				q.add(new int[]{rx,ry,dist+1});
				visited[rx][ry]=1;
			}
		}
		
		return ret;
	}
	
}
