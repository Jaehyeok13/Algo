package level_0.doublingArrays;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(new int[]{1,2,3,4,5}));
  }

  public static class Solution{
    // TODO 배열 두배 만들기
    public int[] solution(int[] numbers) {
      // int[] answer = java.util.Arrays.stream(numbers).map(n -> n * 2).toArray();
      // or
      int[] answer = java.util.Arrays.copyOf(numbers, numbers.length); // 얕은 복사
      // int[] deepArr = numbers.clone(); // 깊은 복사 
      for (int i = 0; i < numbers.length; i++){
        answer[i] = i * 2;
      }
      return answer;
    }
  }
}
