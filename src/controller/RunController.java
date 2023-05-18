package controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RunController {
  public int networkConnect(int n, int[][] computers) {
    /**
     * 네트워크란 컴퓨터 상호 간에 정보를 교환할 수 있도록 연결된 형태를 의미합니다. 예를 들어, 컴퓨터 A와 컴퓨터 B가 직접적으로 연결되어있고, 
     * 컴퓨터 B와 컴퓨터 C가 직접적으로 연결되어 있을 때 컴퓨터 A와 컴퓨터 C도 간접적으로 연결되어 정보를 교환할 수 있습니다. 
     * 따라서 컴퓨터 A, B, C는 모두 같은 네트워크 상에 있다고 할 수 있습니다.
     * 컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때, 네트워크의 개수를 return 하도록 solution 함수를 작성하시오.
     * 
     * 제한 사항
     * 컴퓨터의 개수 n은 1 이상 200 이하인 자연수입니다.
      각 컴퓨터는 0부터 n-1인 정수로 표현합니다.
      i번 컴퓨터와 j번 컴퓨터가 연결되어 있으면 computers[i][j]를 1로 표현합니다.
      computer[i][i]는 항상 1입니다.
      입출력 예
      n	computers	                        return
      3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	 2
      3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]  1
     */
    int answer = 0; // 네트워크 개수
    boolean check[] = new boolean[n]; // 컴퓨터 방문 여부를 저장하는 배열

    for (int i = 0; i < n; i++) {
      System.out.println(check[i]);
      if (!check[i]) { // 방문하지 않은 컴퓨터가 있으면 dfs 함수 호출
        dfs(computers, i, check);
        answer++; // 네트워크 개수 증가
      }
    }

    return answer;
  }

  public void dfs(int[][] computers, int i, boolean[] check) {
    check[i] = true; // 현재 컴퓨터 방문 표시
    System.out.printf("======\ni : %d\ncoumputer : %d\n",i, computers.length);
    for (int j = 0; j < computers.length; j++) {
      System.out.printf("j : %d\n", j);
      if (i != j && computers[i][j] == 1 && !check[j]) { // 인접한 컴퓨터이고 방문하지 않았으면
        System.out.println("dfs 이프문 들어왔다.");
        dfs(computers, j, check);
      }
    }
  }

  public int[] japan(String[] keymap, String[] targets) {
		// 휴대폰의 자판은 컴퓨터 키보드 자판과는 다르게 하나의 키에 여러 개의 문자가 할당 될 수 있다.
		/* 예를 들어, 1번 키에 "A", "B", "C" 순서대로 문자가 할당되어 있다면 1번 키를 한 번 누르면 "A"
		 *  두 번 누르면 "B", 세 번 누르면 "C"가 되는 식입니다.
		 * 키의 개수가 1부터 최대 100
		 * 이 휴대폰 자판을 이용해 특정 문자열을 작성할 때, 키를 최소 몇 번 눌러야 그 문자열을 작성할 수 있는지
		 * keymap - 1번 키부터 차례대로 할당도니 문자들이 순서대로 담긴 문자열배열
		 * targets 입력하려는 문자열들이 담긴 문자열 배열
		 * 목표 문자를 작성할 수 없을 때는 -1을 저장한다.
		 * key map 만큼 변수를 만들 수는 없다. 비효율 적이면서 몇개가 들어올지 모름
		 */
		int[] answer = new int[targets.length];
		// 첨부터 맵컬렉션에 키맵의 변수와 길이를 비교한 최소값을 넣어주자
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < keymap.length; i++){
			for(int j = 0; j < keymap[i].length(); j++){
				char key = keymap[i].charAt(j);
        map.put(key, Math.min(map.getOrDefault(key, Integer.MAX_VALUE), j + 1));
			}
		}

    for (int i = 0; i < targets.length; i++) {
      int result = 0;
      for (char chTarget : targets[i].toCharArray()) {
          Integer count = map.get(chTarget);
          if (count == null) {
            result = -1;
            break;
          }
          result += count;
      }
      answer[i] = result;
		}
    System.out.println(Arrays.toString(answer));
		return answer;
	}

  public int skill_trees(String skill, String[] skTree) {
    int answer = 0;
    HashMap<Character,Integer> skM = new HashMap<Character,Integer>();
    int idx = 1;
    for(char sk : skill.toCharArray()){
      skM.put(sk, idx);
      idx++;
    }

    for(String st : skTree){
      int prevIdx = 1;
      boolean check = true;
      System.out.println("skTree: " + st);
      
      for(char c : st.toCharArray()){
        if(skM.containsKey(c)){
          int currIdx = skM.get(c);
          // System.out.println("currIdx = " + currIdx + "\nprevIdx = " + prevIdx);
          if(currIdx > prevIdx){
            check = false;
            break;
          }
          prevIdx = currIdx+1;
        }
      }
      if(check){
        answer++;
      }
    }
    return answer = answer > 0 ? answer : -1;
  }

  public static int naturalNumber(int n) {
    int countOne = Integer.bitCount(n); // n의 1의 개수를 구합니다.
    int nextNum = n + 1; // 다음 숫자를 찾기 위해 n에 1을 더해줍니다.
    while (Integer.bitCount(nextNum) != countOne) { // 1의 개수가 같은 다음 숫자를 찾을 때까지 반복합니다.
        nextNum++; // 다음 숫자를 하나씩 증가시킵니다.
    }
    System.out.println(countOne);
    
    return nextNum;
  }
  
  public static int nextBigNumber(int n) {
    // n을 2진수로 표현했을 때 1이 나타나는 가장 작은 자리의 값을 postPattern에 저장합니다.
    int postPattern = n & -n;
    System.out.println(postPattern);
    // postPattern 다음으로 작은 1이 나타나는 위치를 찾아서 smallPattern에 저장합니다.
    int smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
    // n과 postPattern을 더한 값에 smallPattern을 OR 연산합니다.
    return n + postPattern | smallPattern;
  }

}
