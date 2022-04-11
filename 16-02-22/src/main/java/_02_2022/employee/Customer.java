package _02_2022.employee;

public class Customer 
{
	int id;
	String name;
	String phonenumber;
	String address;
	public Customer() 
	{
		id = 23;
		name = "pavithra";
		phonenumber = "9743961271";
		address = "bangalore";
	}
	
	//behavior(methods)
	public void getCustomerDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(phonenumber);
		System.out.println(address);
	}

	public static void main(String[] args) 
	{
		Customer customer1 = new Customer();		
		
		customer1.getCustomerDetails();

	}

}
