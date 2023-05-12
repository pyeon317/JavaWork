package day08.encap.obj;

public class Chef {

	private String name = "홍연복";
	
	public void cooking() {
		System.out.println("요리사");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
