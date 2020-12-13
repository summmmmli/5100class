package class5;

public class Human {
	
	String name = null;
	
	Human(){
		System.out.println("Human is created");
	}
	
	Human(String name){
		System.out.println(name + " is created");
		this.name = name;
	}
	
	Human(String firstName, String lastName){
		System.out.println(firstName+ lastName + " is created");
		this.name = firstName + " "+lastName;
	}
	
	Human(String firstName, String MiddleName, String lastName){
		System.out.println(firstName+ MiddleName +lastName + " is born");
		this.name = firstName + MiddleName +lastName;
	}
	
	void speak() {
		System.out.println(name + " is speaking");
	}
	
	protected void finalize() {
		System.out.println(name + " is destroyed");
	}

	public static void main(String[] args) {
		Human siva = new Human();
		siva.name = "siva";
		siva.speak();
		
		Human summer = new Human("summer");
		summer.speak();
		
		Human lilyWang = new Human("lily","Wang");
		lilyWang.speak();
		
		Human ChenZiLong = new Human("Chen","Zi","Long");
		ChenZiLong.speak();
		
		new Human("Fangwen Ge").speak();;
		new Human("Yangting","Chang");//no pointer, can not speak
		
		summer = null;
		Runtime.getRuntime().gc();
//		summer.finalize();
		
	}
}

