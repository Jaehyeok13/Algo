package level_0.dupleNum;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값 " + solution.solution(new int[] {1,1,2,3,4,5}, 1));
  }

  public static class Solution{
    // TODO  중복된 숫자 개수
    public int solution(int[] array, int n) {
      int answer = 0;
      for (int i : array) {
        answer += i == n ? 1 : 0;
      }
      return answer;
    }
  }
}
