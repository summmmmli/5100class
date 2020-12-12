package Class3;

import java.lang.reflect.Array;

public class Loops {

	public static void main(String[] args) {
		Kid reesha = new Kid();
//		reesha.tellAllNumbers(10);
//		reesha.tellMultiplesOfThree(10);
//		reesha.tellMultiplesOfFiveUpToTwenty(15);
		
//		Parent siva = new Parent();
//		siva.giveAssignmentToTellNmbers(10);
		
		reesha.displayNumberPyramid(10);
		
		
	}
}

class Parent{
	Kid[] kids = new Kid[] { new Kid(), new Kid(), new Kid() };
	
	void giveAssignmentToTellNmbers(int n) {
		for (Kid k : kids) {
			k.tellAllNumbers(n);
			System.out.println("-------");
		}
	}
	
}

class Kid{
	void tellAllNumbers(int end) {
		for (int i=1; i<end; i++) {
			System.out.println(i);
		}
	}
	
	void tellMultiplesOfThree(int end) {
		int start = 0;
		while(start < end) {
			start = start + 1;
			if (start % 3 == 0) {
				System.out.println(start);
			}else {
				continue;
			}
			System.out.println("rest of the logic");
		}
	}
	
	void tellMultiplesOfFiveUpToTwenty (int end) {
		for (int i = 1; i <= end ; i++) {
			if( i == 20) {
				break;
			}
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
	
	void displayNumberPyramid(int end) {
		for (int i = 1; i < end; i++) {
			for (int j =1; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
	
}
