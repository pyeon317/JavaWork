package Lv1;

import java.util.*;

public class Solution {
	
	public String[] solution(String[] players, String[] callings) {
        HashMap<Integer, String>hm = new HashMap<Integer, String>();
        String str = null;
		
        for(int i = 0; i < players.length; i++) { //해시맵에 저장
        	hm.put(i, players[i]);
        }
		
        for(int i = 0; i < callings.length; i++) {
        	if(hm.containsValue(callings[i])) {
        		hm.get(callings[i]);
        	}
        	
        }
        	
        
		
        return players;
    }	
}
