package Lv1;

import java.util.*;

public class Solution {
	
	public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> hm= new HashMap<>();
        
        for(int i = 0; i < players.length; i++) { //리스트에 저장
        	hm.put(players[i],i);
        }
		
        for(int i = 0; i < callings.length; i++) {
        	if(hm.containsKey(callings[i])) {
        		int a = hm.get(callings[i]); //자리를 바꾸기 위한 위치값
        		//순서바꾸기
        		for(Map.Entry<String, Integer> ent : hm.entrySet()) {
        			
        		}
        	}
        	
        }
        return players;
    }	
}