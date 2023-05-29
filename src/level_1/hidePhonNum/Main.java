package level_1.hidePhonNum;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution("01033334444"));
  }

  public static class Solution{
    // TODO 핸드폰 번호 가리기
    public String solution(String phone_number) {
      String answer = "";
      for(int i = 0; i < phone_number.length(); i++){
          answer += i < phone_number.length() - 4 ? "*" : phone_number.charAt(i);
      }
      return answer;
    }
  }
}
