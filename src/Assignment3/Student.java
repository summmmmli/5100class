package Assignment3;

public class Student {
	String name;
	String id;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Student() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
