package level_0.compareNumbers;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(2,3));
  }

  public static class Solution{
    // TODO 숫자 비교하기
    public int solution(int num1, int num2) {
      boolean val = (0 <= num1 && num1 <= 10000 && 0 <= num2 && num2 <= 10000);
      int answer = val ? num1 == num2 ? 1 : -1 : 0;
      return answer;
    }
  }
}
