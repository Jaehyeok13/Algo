package level_0.taller;

import java.util.Arrays;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(new int[]{149, 180, 192}, 167));
  }

  public static class Solution{
    // TODO 키 큰 사람
    public int solution(int[] array, int height) {
      return (int)Arrays.stream(array).filter(e -> e > height).count();
    }
  }
}
