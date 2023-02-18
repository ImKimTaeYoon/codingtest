import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int idx = 0;
        answer[0] = array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                idx = i;
            }
        }
        answer[0] = max;
        answer[1] = idx;

        return answer;
    }
}