package level_0.theIntegerPart;

public class Main {
  public static void main(String[] args) throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값 : " + solution.solution(1.23));
  }

  public static class Solution {
    // TODO 정수 부분
    public int solution(double flo) {
      return (int)flo;
    }
  }
}
