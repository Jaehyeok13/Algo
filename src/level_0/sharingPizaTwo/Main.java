package level_0.sharingPizaTwo;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(10));
    // System.out.println("결과 값" + solution.solutionTwo(4));
  }

  public static class Solution{
    // TODO 피자 나눠 먹기
    // INFO : 피자는 6 조각이며, 나눠먹는 사람의 수 n 일때 피자를 남김 없이 다 먹어야한다. 이때 총 피자의 판 개수 return
    public int solution(int n) {
      int servings = 6;
      boolean val = 0 < n && n <= 100;
      if (servings % n == 0){
        return 1;
      } else if(!val){
        return 0;
      }
  
      int gcd = gcd(n, servings);
      int lcm = n * servings / gcd;
    
      int answer = lcm / servings;
      return answer;
    }
  
    public int gcd(int a, int b) {
      while (b != 0) {
          int temp = a % b;
          a = b;
          b = temp;
      }
      return a;
    }

    public int GCD(int num1, int num2) {
      if (num1 % num2 == 0)
          return num2;
      return GCD(num2, num1 % num2);
    }

    public int LCM(int num1, int num2) {
        return num1 * num2 / GCD(num1, num2);
    }
    public int solutionTwo(int n){
      return LCM(n, 6) / 6;
    }
  }
}
