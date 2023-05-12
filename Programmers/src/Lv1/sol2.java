package Lv1;

import java.util.Arrays;

public class sol2 {

	public int[] solution(int[] num_list) {
        
		int[]arr = new int[num_list.length];
		int k = 0;
		
		Arrays.sort(num_list);
        
		for(int i = num_list.length-6; i < num_list.length; i++);{
          arr[k] = num_list[num_list.length-6+k];
          k++;
        }
        
		int[] answer = {};  
        return answer;
    }
}
