package level_0.divisionNumbers;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(5555, 3333));
  }

  public static class Solution{
    // TODO 
    public int solution(int num1, int num2) {
      boolean val = (0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100);
      int answer =  val ? (int)Math.floor((double)num1 / num2 * 1000) : 0;
      return answer;
    }
  }
}
