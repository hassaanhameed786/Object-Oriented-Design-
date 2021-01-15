package dpkg;
//----------------------Mubariz Khan P180010--------------------
public class AddressBook
{
	private Employee emp;
	
	AddressBook(Employee Emp)
	{
		this.emp = Emp;
	}

	public String DisplaySalaryReport()
	{
		double salary = emp.computesalary(1000, 91);
		return "name"+emp.Getname() + "Salary:"+ salary+"$";
	}

}
