package level_0.medianArray;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(new int[]{1, 2, 7, 10, 11}));
  }

  public static class Solution{
    // TODO 중앙값 구하기
    public int solution(int[] array) {
      // int answer = java.util.Arrays.stream(array)
      //                               .sorted()
      //                               .skip(array.length / 2)
      //                               .limit(1 + array.length % 2)
      //                               .findFirst()
      //                               .orElse(0);
      for(int i = 0; i < array.length; i++) {
        for(int j = i; j < array.length; j++) {
          if (array[j] < array[i]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
          }
        }
      }
      int answer = 0;
      int midIdx = array.length / 2;
      for (int num : array) {
        System.out.print(num + " ");
        answer = array[midIdx];
      }
      // int middleIndex = array.length / 2;
      // int middleValue;

      // if (array.length % 2 == 0) {
      //     middleValue = (array[middleIndex - 1] + array[middleIndex]) / 2;
      // } else {
      //     middleValue = array[middleIndex];
      // }

      // System.out.println("중간 값 (정수형): " + middleValue);

      return answer;
    }
  }
}
