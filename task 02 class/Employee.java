package dpkg;
//----------------------Mubariz Khan P180010--------------------
public abstract class Employee
{
	private String name;
	private int Age, salary, days;

	Employee(String name,int salary)
		{
			this.name=name;
			this.salary=salary;
		}
	public abstract double computesalary(int salary,int days);
	public int Getsalary() {
		return salary;
	}
	public int GetDays() {
		return days;
	}
	public String Getname() {
		return name;
	}
}

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
		return salary + (days * 45) + (Age*50);
		}
	
	}
