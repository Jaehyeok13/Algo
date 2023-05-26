package level_0.discountClothing;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(150000));
  }

  public static class Solution{
    // TODO 옷가게 할인 받기
    public int solution(int price) {
      boolean val = (10 <= price && price <= 1000000);
      int answer = val ? (price >= 500000 ? (int)(Math.floor(price * 0.8)) :
        price >= 300000 ? (int)(Math.floor(price * 0.9)) :
        price >= 100000 ? (int)(Math.floor(price * 0.95)) : (int)(Math.floor(price))) : 0;
    return answer;
  }
  }
}
