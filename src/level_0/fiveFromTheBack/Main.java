package level_0.fiveFromTheBack;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws Exception {
    Solution solution = new Solution();
    int[] result = solution.solution(new int[]{12, 4, 15, 46, 38, 1, 14});
    System.out.println("결과 값 : " + Arrays.toString(result));
  }

  public static class Solution {
    public int[] solution(int[] num_list) {
      Arrays.sort(num_list);
      // 깊은 복사
      int[] answer = Arrays.copyOfRange(num_list, 0, 5);
      return answer;
    }
  }
}