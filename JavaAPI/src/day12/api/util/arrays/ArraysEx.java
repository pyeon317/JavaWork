package day12.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		
		int[] arr = {3,1,2,5,6,7};
		
		//정렬 sort
		Arrays.sort(arr); //퀵솔트?나중에 궁금하면 따로 찾아보기
		
		//배열을 문자열로 tostring
		System.out.println(Arrays.toString(arr));
		
		//탐색 - 선행조건 : 정렬
		int result = Arrays.binarySearch(arr, 4);//배열명, 찾고 싶은 글자
		System.out.println(result); //음수가 나오면 값은 없음
		
		int result2 = Arrays.binarySearch(arr, 5);
		System.out.println(result2); //값에 대한 위치 반환
		
		//배열복사
		int[] newArr = Arrays.copyOf(arr, arr.length); //복사하고 싶은 배열,새로운 배열의 크기 를 입력하면 입력한 크기만큼 복사해서 옮겨줌
		System.out.println(Arrays.toString(newArr));
		System.out.println(arr == newArr); //깊은 복사(완전히 새로운) - false나옴. 아예 새로운 주소값이라는 말인듯
		
		int[] newArr2 = Arrays.copyOf(arr, arr.length *2);
		System.out.println(Arrays.toString(newArr2));
		
		//배열크기지정복사
		int[] newArr3 = Arrays.copyOfRange(newArr, 1, 3);//기존 배열의 x이상 y미만 자리의 값을 가진 배열 생성
		System.out.println(Arrays.toString(newArr3));
		
		//배열의 원소비교(주소값이 아닌 요쇼들의 비교)
		if(Arrays.equals(newArr, arr));{
			System.out.println("배열의 원소가 정확히 일치함");
		}
		
		
		
		
		
		
	}
}
