package level_2.findLargestSquare;

public class Main {

  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값은 : " + solution.solution((new int[][]{{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}})));
  }

  public static class Solution{
    // TODO 가장큰 정사각형 크기
    public int solution(int[][] bordered) {
      int answer = 0;
      // 행 또는 열이 1이면 정사각형의 넓이를 1로 반환
      if (bordered.length < 2 || bordered[0].length < 2) return 1;
      for (int i = 1; i < bordered.length; i++){
        for (int j = 1; j < bordered[i].length; j++){
          if (bordered[i][j] == 0) continue;
          // System.out.printf("%d ",bordered[i][j]);
          int min = Math.min(Math.min(bordered[i-1][j-1],
                              bordered[i-1][j]),
                              bordered[i][j-1]);
          System.out.println("최소값은 : "+min);
          bordered[i][j] = min + 1;
          if(answer < bordered[i][j]) answer = bordered[i][j];
        }
         // 할당한 값의 최댓값을 answer에 할당해주고
        System.out.println();
      }
      return answer * answer;
    }
  }

}
