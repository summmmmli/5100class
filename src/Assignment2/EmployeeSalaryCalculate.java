package Assignment2;

public class EmployeeSalaryCalculate {
	/**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
    	double socialSecurityTax = 0;
    	
    	if (employee.salary <= 8900) {
    		socialSecurityTax = employee.salary * 0.062;
    	} else if (employee.salary > 8900) {
    		socialSecurityTax = 106800 * 0.062;
    	}
    	
    	System.out.println(socialSecurityTax);
    	return socialSecurityTax;
    }
    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
    	double insuranceCoverage = 0;
    	
    	if (employee.age < 35) {
    		insuranceCoverage = employee.salary * 0.03;
    	} else if (employee.age >= 35 && employee.age <= 50 ) {
    		insuranceCoverage = employee.salary * 0.04;
    	} else if (employee.age > 50 && employee.age < 60) {
    		insuranceCoverage = employee.salary * 0.05;
    	} else if (employee.age >= 60) {
    		insuranceCoverage = employee.salary * 0.06;
    	}
    	System.out.println(insuranceCoverage);
    	return insuranceCoverage;
    }
    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
    	
    	Employee winner;
    	Employee loser;
    	Employee highest;
    	Employee middle;
    	Employee lowest;
    	
    	if (e1.salary > e2.salary) {
    		winner = e1;
    		loser = e2;
    	}else {
    		winner = e2;
    		loser = e1;
    	}
    	
    	if (e3.salary > winner.salary) {
    		highest = e3;
    		middle = winner;
    		lowest = loser;
    	}else{
    		highest = winner;
    		 if (e3.salary > loser.salary) {
    		middle = e3;
    		lowest = loser;
    		}else {
    		middle = loser;
    		lowest = e3;
    		}
    	}
    	System.out.println("highest: " + highest.name + "middle: " + middle.name + "lowest: " + lowest.name);
    }
    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public void tripleSalary(Employee employee) {
    	employee.raiseSalary(200.0);
    }
    //Extra credit
    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     Because Java is pass-by-value, which means the way Java passes arguments is
     creating a copy of references and passing the copy, not the original references
     or objects to the swap method, so they still refer to the same memory reference,
     which means that we just manipulate the copy of those references via this swap
     function, while the objects and their original references will not be affected.

     In the following cases, the a and b are the references pointing to two
     objects (Employee) separately at the beginning, when we call swap function, we
     pass the copy of the references a and b and manipulate them, which will not change
     the original a, b or the objects themselves.
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}