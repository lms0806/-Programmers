class Solution {
    public int[] solution(int[] arr) {
        int size = 1;
        while(size < arr.length){
            size *= 2;
        }
        
        int[] answer = new int[size];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}
