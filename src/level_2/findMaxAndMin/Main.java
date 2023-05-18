package level_2.findMaxAndMin;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println(solution.solution("1 2 3 4 5 6"));
  }

  public static class Solution{
    // 최대갑 최소값 구하는 식
    public String solution(String s) {
      String answer = "";
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      int num;
      for(String sNum : s.split(" ")){
          num = Integer.parseInt(sNum);
          max = Integer.max(num, max);
          min = Integer.min(num, min);
      }
      answer = min + " " + max;
      return answer;
    }
  }
}
