//----------------------Mubariz Khan P180010--------------------


//Address
public class AddressBook 
{
	private Employee emp;
	
	AddressBook(Employee Emp){
		this.emp = Emp;
	}
	
	
	public String DisplaySalaryReport() 
	{
		double salary = emp.computesalary(1000, 91);
		return "Name:"+emp.Getname() + "Salary:"+ salary+"$";
		
	}

}
//Employee
public abstract class Employee 
{
	private String name;

	private int Age, salary, days;

	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public int Getsalary() 
	{
		return salary;
	}

	public int GetDays() 
	{
		return days;
	}
	public String Getname() 
	{
		return name;
	}
	
	public abstract double computesalary(int salary,int days);

	
	
	
}

//------------------------------subclass1-----------------
class BoardManager extends Employee
{	
	private int Age;

	public BoardManager(String nm,int salary,int Age) 
	{
		super(nm,salary);
		this.Age=Age;
	}

	public double computesalary(int salary, int days) 
	{
		
		return salary + days*35 + Age*100;
	}
	
}


//subclass2
class Worker extends Employee
{
	
	private int Age;

	Worker(String name, int salary,int Age) 
	{
		super(name, salary);
		this.Age=Age;
		
	}

	@Override
	public double computesalary(int salary, int days) 
	{
		return salary + days*45 + Age*50;
	}
	
}