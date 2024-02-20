package BaiThucHanh_01;

public class Student {

	int id;
	String name;
	public void insert(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void modify(int id, String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.print(id + " " + name);
	}


}
