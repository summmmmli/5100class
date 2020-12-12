package Class3;

public class Strings {

	public static void main(String[] args) {
		String a = "Yating";
		String liyi = new String(new char[] {'l','i','y','i'}); 
		String b = new String("Yating");
		
		int i =10;//int is a primitive data type;
		Kid syra = new Kid();//kid is a class
		Kid reesha = new Kid();//kid is a class
		
		
		System.out.println(a);
		System.out.println(b);
		
		int j = 20;
		
		if(i == j) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		if (a == b) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		if (a.equals(b)) {
			System.out.println("same content");
		}else {
			System.out.println("not same content");
		}
		
		String Shen = "Shen";
		String x = "Sh" + "en";
		String z = new String ("Shen");
		System.out.println(Shen == x);
		System.out.println(Shen == z);
	}

}
