package day13.generic.good;

public class DEF<T, C> {
	
	private T key;
	private C value;
	
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public C getValue() {
		return value;
	}
	public void setValue(C value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "DEF [key=" + key + ", value=" + value + "]";
	}
	
	
}
