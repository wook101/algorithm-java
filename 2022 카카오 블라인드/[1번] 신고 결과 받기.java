import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String,HashSet<String>> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        ArrayList<String> stopUsers = new ArrayList<>();
        int[] result = new int[id_list.length];
        
        //초기화
        for(String user_id : id_list){
            map.put(user_id, new HashSet<String>());
        }
        
        //중복제거
        for(String st : report){
            String[] arrStr = st.split(" ");
            map.get(arrStr[0]).add(arrStr[1]);
        }
        
        //유저별 신고당한 횟수체크
        for(String user_id : id_list){
            for(String user : map.get(user_id)){
                if (map2.get(user)==null){
                    map2.put(user, 1);
                    continue;
                }
                map2.put(user, map2.get(user)+1);
            }
        }    
        
        //k회이상 신고당한 유저체크
        for(String user_id : map2.keySet()){
            if (map2.get(user_id)>=k){
                stopUsers.add(user_id);
            }
        }
        
        //교집합, 결과
        for(int i=0;i<id_list.length;i++){
            String user_id = id_list[i];
            map.get(user_id).retainAll(stopUsers);
            result[i] = map.get(user_id).size();
        }
        return result;
        
    }
}
