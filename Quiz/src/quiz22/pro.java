package quiz22;

public class pro {
	private String days;
	private String stores;
	private String grades;
	private String details;
	private String prices;
	
	public pro() {}

	public String getDay() {
		return days;
	}

	public void setDay(String day) {
		this.days = day;
	}

	public String getStore() {
		return stores;
	}

	public void setStore(String store) {
		this.stores = store;
	}

	public String getGrade() {
		return grades;
	}

	public void setGrade(String grade) {
		this.grades = grade;
	}

	public String getDetail() {
		return details;
	}

	public void setDetail(String detail) {
		this.details = detail;
	}

	public String getPrice() {
		return prices;
	}

	public void setPrice(String price) {
		this.prices = price;
	}

	public pro(String day, String store, String grade, String detail, String price) {
		super();
		this.days = day;
		this.stores = store;
		this.grades = grade;
		this.details = detail;
		this.prices = price;
	}
}
