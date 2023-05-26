package level_0.reverse;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution("jaron"));
  }

  public static class Solution{
    // TODO 문자 뒤집기
    public String solution(String my_string) {
      StringBuilder answer = new StringBuilder(my_string);
      answer.reverse();
      return answer.toString();
  }
  }
}
