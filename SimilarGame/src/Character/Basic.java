package Character;

public abstract class  Basic {

	private int x;
	private int y;
	private int lv;
	private int hp;
	//시야는 어떻게 설정하는걸까?
	
	public Basic(int x, int y, int lv, int hp) {
		this.x = x;
		this.y = y;
		this.lv = lv;
		this.hp = hp;
	}
	
	public abstract void location();
	public abstract void move(int x, int y);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
	
}
