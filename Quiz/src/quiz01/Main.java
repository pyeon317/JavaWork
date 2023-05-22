package quiz01; //현제 클래스는 백준 사이트의 문제를 풀기 위한 스크립트로 노션에 푼 문제들을 저장함

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		List<Integer>max = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) { //배열 입력
			arr[i] = Integer.parseInt(br.readLine());	
		}
		
		int str = 0;
		
		while(str < N-k+1) {
			int end = str+k;
			List<Integer> list = new ArrayList<>(); 
			for(int i = str; i < end; i++) {
				if(arr[i] == c)end++;
				if(end > arr.length) end = arr.length;
				if(!list.contains(arr[i])){
					list.add(arr[i]);
				}
			}
			max.add(list.size());
			str++;
		}
		System.out.println(Collections.max(max));
		
	}
}