package level_0.arrayComparison;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값 : " + solution.solution(new int[]{49}, new int[]{70}));
  }

  public static class Solution {
    // TODO 배열 비교하기
    public int solution(int[] arr1, int[] arr2) {
      int answer = Integer.compare(arr1.length, arr2.length);
      if (answer == 0) {
        answer = Integer.compare(Arrays.stream(arr1).sum(), Arrays.stream(arr2).sum());
      }
      return answer;
    }
  }
}
