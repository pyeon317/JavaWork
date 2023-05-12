package day11.inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal dog = new Dog(); //동물로 저장(기능사용) dog를animal타입으로 변경
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] animals = {dog, cat, tiger};
		
		for(Animal ani : animals ) { //ani = 변수 설정(int i 같은)
			ani.eat(); // Animel의 기능
		}
		
		//dog, cat은 인터페이스 타입으로 형변환이 됩니다.
		//dog, cat, goldfish 를 저장하고, IPet의 기능을 사용
		IPet[] pets = new IPet[3];
		
//		IPet dog1 = new Dog();   여기도 가능함.
//		IPet cat1 = new Cat();
//		IPet goldfish = new GoldFish();
//		
//		IPet[] petss = {dog1, cat1, goldfish};
//		
//		for(int i = 0; i < pets.length; i++) {
//			pets[i] = petss[i];
//		}
		//pets[1] = (IPet)tiger; tiger는 IPet의 기능이 없기 때문에 에러 발생
		pets[0] = (IPet)dog; //이게 더 짧음
		pets[1] = (IPet)cat;
		pets[2] = new GoldFish();
		
		for(IPet p : pets) {
			p.play();
		}
		
		System.out.println("----------------------");
		 
		
		
		
		
		
		
	}
}
