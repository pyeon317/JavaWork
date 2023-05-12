package day11.inter.basic2;

public class GoldFish extends Fish implements IPet {

	@Override
	public void swim() {
		System.out.println("금붕어는 어항에서 헤엄쳐요");	
	}

	@Override
	public void play() {
		System.out.println("금붕어는 혼자 놓아요");
	}

}
