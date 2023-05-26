package level_0.babbling;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
  }

  public static class Solution{
    // TODO 옹알이
    public int solution(String[] babbling) {
      String[] word = {"aya", "ye", "woo", "ma"};

      return (int) java.util.Arrays.stream(babbling)
        .filter(b -> java.util.Arrays.stream(word)
          .mapToInt(w -> b.contains(w) ? w.length() : 0)
            .sum() == b.length()).count();
    }
  }
}
