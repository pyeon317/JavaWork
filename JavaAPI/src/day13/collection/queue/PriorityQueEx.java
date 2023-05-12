package day13.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueEx {

	public static void main(String[] args) {
		 /*
		  * Priority(우선순위큐)
		  * =>정렬기능을 포함
		  * =>PriorituQueue클래스가 구현함
		  */
		Queue<Integer> que = new PriorityQueue<>();
		
		que.offer(4);
		que.offer(3);
		que.offer(1);
		que.offer(5);
		que.offer(6);
		
		System.out.println(que.toString());
		
		System.out.println(que.poll()); //작은 수 부터 순서대로 반환되서 나옴
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.poll());
		
		System.out.println(que.toString());
		
		System.out.println("--------------------------------");
		
		//User객체를 담을 수 있는 큐
		//큐가 순서를 확인할 때 compareTo 메서드를 확인합니다.
		//compareTo에 정의된 순서에 의해서 우선순위를 정합니다.
		//객체가 우선순위를 가지게 하려면
		//comparable인터페이스를 상속받아서 compareTo메서드를 오버라이딩 해서 가지면 됩니다.
		
		//우선순위 지정
		System.out.println("홍길동".compareTo("홍길자")); //홍길동이 사전적으로 앞에 위치 > 음수
		System.out.println("홍길자".compareTo("홍길동")); //홍길자가 사전적으로 뒤에 위치 > 양수
		Queue<User> queue = new PriorityQueue<>();
				
		queue.offer(new User("홍길동", 10)); //그냥 넣으면 에러 발생
		queue.offer(new User("홍길자", 20));
		queue.offer(new User("홍길순", 30));
		queue.offer(new User("신사임당", 40));
		
		System.out.println(queue.toString());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
	}
	
}
