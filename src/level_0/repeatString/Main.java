package level_0.repeatString;

public class Main {
  public static void main(String[] args) throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값 : " + solution.solution("hello", 3));
  }

  public static class Solution {
    // TODO 문자 반복 출력하기
    public String solution(String my_string, int n) {
      String answer = "";
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < my_string.length(); i++){
          sb.append(String.valueOf(my_string.charAt(i)).repeat(n));
      }
      
      return answer = sb.toString();
    }
  }
}
