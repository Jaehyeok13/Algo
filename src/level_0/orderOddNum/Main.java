package level_0.orderOddNum;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(10));
  }

  public static class Solution{
    // TODO 짝수는 싫어요, 홀수 배열 만들기
    public int[] solution(int n) {
      int[] answer = new int[(n + 1)/2];
      int num = 1;
      for (int i = 0; i < answer.length; i++){
        answer[i] = num;
        num += 2;
      }
      return answer;
    }
  }
}
