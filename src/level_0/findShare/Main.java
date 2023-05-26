package level_0.findShare;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(7, 2));
  }

  public static class Solution{
    // TODO 몫 구하기 
    public int solution(int num1, int num2) {
      boolean val = (0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100);
      int answer = 0;
      if(val) answer = num1 / num2;
      return answer;
    }
  }
}
