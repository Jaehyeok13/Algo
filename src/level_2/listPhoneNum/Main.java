package level_2.listPhoneNum;

public class Main {
  public static void  main(String[]  args)throws Exception {
    Solution solution = new Solution();
    System.out.println("결과 값" + solution.solution(new String[]{"123", "456", "789"}));
  }

  public static class Solution{
    // TODO 전화번호 목록
    public boolean solution(String[] phone_book) {
      for(int i=0; i< phone_book.length-1; i++) {
        for(int j=i+1; j<phone_book.length; j++) {
            if(phone_book[i].startsWith(phone_book[j])) {return false;}
            if(phone_book[j].startsWith(phone_book[i])) {return false;}
          }
      }
      return true;
    }
  }
}
