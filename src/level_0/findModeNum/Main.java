package level_0.findModeNum;


public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(new int[]{1, 2, 3, 3, 3, 4, 4, 5, 5, 5}));
  }

  public static class Solution{
    // TODO 최빈값 구하기
    public int solution(int[] array) {
      // 1. 배열을 만들어서 중복된 수와 값을 센다.
      java.util.Map<Integer, Integer> countMap = new java.util.HashMap<>();
      countMap = java.util.Arrays.stream(array).boxed()
                  .collect(java.util.stream.Collectors.groupingBy(n -> n, java.util.stream.Collectors.summingInt(e -> 1)));

      // for (int number : array) {
      //     countMap.put(number, countMap.getOrDefault(number, 0) + 1);
      // }
      System.out.println("중복 값과 개수: " + countMap);
      
      int maxCount = 0;
      int answer = -1;
      for (java.util.Map.Entry<Integer, Integer> entry : countMap.entrySet()){
        System.out.println(entry.getKey() + ": " + entry.getValue());
        int count = entry.getValue();
        System.out.println("count: " + count);
        answer = count > maxCount ? entry.getKey() : (count == maxCount ? -1 : answer);
        maxCount = Math.max(count, maxCount);
      }
      return answer;
    }
  }
}
