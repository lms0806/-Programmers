class Solution {
  public String solution(String s) {
      String answer = "";
      String[] str = s.split("");
      int count = 0;
      for(int i = 0; i < str.length; i++){
          if(str[i].equals(" ")){
              answer+=" ";
              count = 0;
              continue;
          }
          else if(count%2 == 0){
              answer += str[i].toUpperCase();
          }
          else if(count%2 == 1){
              answer += str[i].toLowerCase();
          }
          count++;
      }
      return answer;
  }
}
