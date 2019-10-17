package cgInfo;

public class Contacts {
	private Long num;
	private String name;
	public Contacts(Long num, String name) {
		this.num = num;
		this.name = name;
	}
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return " [num=" + num + ", name=" + name + "]";
	}

	
}
