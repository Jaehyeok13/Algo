package level_1.unfinishMara;

import java.util.HashMap;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"marina", "josipa", "nikola", "filipa"}));
  }

  public static class Solution{
    // TODO 완주하지 못한 선수
    public String solution(String[] participant, String[] completion) {
      String answer = "";
      HashMap<String, Integer> list = new HashMap<String,Integer>();
      // 찾는 키가 존재하면 해당 키의 값을 반환하고, 없으면 기본값을 반환한다.
      for(String p : participant){
        list.put(p , list.getOrDefault(p,0) + 1);  
      } 
      for(String c : completion) list.put(c , list.get(c) - 1);
      for(String result : list.keySet()){
          if(list.get(result) != 0){
              answer = result;
          }
      }
      return answer;
    }
  }
}
