package Lv1; //문자열 나누기

import java.util.Arrays;

public class sol1 {
	
	public static void main(String[] args) {
		
	}
	public int solution(String[] babbling) {
	       int answer = 0;	//카운트용
	       for(int i = 0; i < babbling.length; i++) {
	    	   babbling[i] = babbling[i].replace("aya", "");
	    	   babbling[i] = babbling[i].replace("ye", "");
	    	   babbling[i] = babbling[i].replace("woo", "");
	    	   babbling[i] = babbling[i].replace("ma", "");
	    	   
	        	
	    	   if(babbling[i].equals("")) {
	    		   answer++;
	    	   }
	       }
	        
	       return answer;
	   }
	}

// "aya", "ye", "woo", "ma"