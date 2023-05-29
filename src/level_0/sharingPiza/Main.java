package level_0.sharingPiza;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(8));
  }

  public static class Solution{
    // TODO 피자 나눠 먹기
    // INFO : 피자는 일곱 조각으로 잘라준다. 나눠먹는 사람의 수 n 일때 모든 사람이 피자를 한조각 이상 먹기 위해 필요한 피자의 수 return
    public int solution(int n) {
      boolean val = (0 < n && n <= 100);
      int answer = 0;
      System.out.printf("몫 : %d\t나머지 : %d\n",n/7, n % 7);
      //answer = val ? n/7 + (n % 7 > 0 ? 1 : 0) : 0;
      // answer = val ? n % 7 == 0 ? n / 7 : n / 7 + 1 : 0;
      answer = val ? (n + 6)/7 : 0;
      return answer;
    }
  }
}
