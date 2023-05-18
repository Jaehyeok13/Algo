package level_2.jadenCase;

import java.util.StringTokenizer;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution("3people unFollowed me"));
  }

  public static class Solution{
    // TODO JadenCase 문자열 만들기
      public String solution(String s) {
          s = s.toLowerCase();
          StringTokenizer st = new StringTokenizer(s, " ", true);
          StringBuilder answer = new StringBuilder();
          String token = "";
          while(st.hasMoreTokens()) {
            token = st.nextToken();
            answer.append(token.length() == 0 ? " " : token.substring(0, 1).toUpperCase() + token.substring(1));
          }
          return answer.toString();
      }
  }
}
