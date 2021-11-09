
 class Employee{
	int id;
	String name;
	int salary;
	public void Calculate() {
		System.out.println(name +"salary"+salary);
		
	}
	
}
class Manager extends Employee{
	int isalary=2500;
	public void Calculate() {
		System.out.println(name+" incentive salary with "+ (salary+isalary)  );
	}
		
}
class Labour extends Employee{
	int overtime=1000;
	public void Calculate() {
		System.out.println(name+" overtime salary with "+ (salary+overtime)  );
	}
	
}

public class Organisation {

	public static void main(String[] args) {
		Manager M=new Manager();
		M.id=5;
		M.salary=2500;
		M.name="manager";
		M.Calculate();
		
		Employee E= new Labour();
		E.id=34;
		E.name="employee";
		E.salary=1000;
		E.Calculate();
		

	}

}