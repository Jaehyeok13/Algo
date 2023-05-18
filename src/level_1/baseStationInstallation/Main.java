package level_1.baseStationInstallation;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(11, new int[]{4,11}, 1));
  }

  public static class Solution{
    // TODO 기지국설치
    public int solution(int n, int[] stations, int w) {
      int answer = 0;	
      int idxS = 1; // 제일 처음 시작할 처음 위치 담을 변수
      int leftEnd = 0; // 기지국의 왼쪽 전파 범위 위치 담을 변수
      // 1.시작점 1에서 가장 가까운 기지국 왼쪽 범위 (마지막지점)을 구한다.
      for(int s : stations){
          if(idxS < s - w){
              leftEnd = s - w;
              answer += resResult(w, leftEnd, idxS);
          }
          idxS = s + w + 1;
      }
      if(stations[stations.length-1] + w + 1 <= n){
          idxS = stations[stations.length-1] + w + 1;
          leftEnd = n + 1;
          answer += resResult(w, leftEnd, idxS);
      }
      return answer;
  }
  public int resResult(int w, int leftEnd, int idxS){
      int result = 0;
      int share = 0; // 몫담을 변수
      int range = leftEnd - idxS; // ex) 기지국 맨왼쪽 범위 - 시작점 3 -1 range = 2
      System.out.printf("시작점 %d \t커버 거리 %d \t 설치가능 거리 %d\n",idxS,leftEnd,range);
      // 몫
      share = range / (w * 2 + 1);
      // 나머지 가 0이 아니면 +1
      if(range % (w * 2 + 1) != 0) share++;
      result += share;
      return result;
    }
  }
}
