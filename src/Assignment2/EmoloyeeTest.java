package Assignment2;

public class EmoloyeeTest {

	public static void main(String[] args) {
		Employee a = new Employee ("Alice", 20, Gender.FEMALE, 1000);
		Employee b = new Employee ("John", 30, Gender.MALE, 500);
		Employee c = new Employee ("Jenny", 30, Gender.FEMALE, 1200);
		
		EmployeeSalaryCalculate e = new EmployeeSalaryCalculate();
		e.sortSalary(a, b, c);
		System.out.println();
		
		e.socialSecurityTax(a);
		e.socialSecurityTax(b);
		e.socialSecurityTax(c);
		
		e.insuranceCoverage(a);
		e.insuranceCoverage(b);
		e.insuranceCoverage(c);
		
	}

}
