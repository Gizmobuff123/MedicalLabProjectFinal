package medicalLabDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import databaseConnection.DBConnectionMySQL;
import medicalLabEntities.Customer;

public class CustomerDao
{
	Connection theCon;
	Statement stmt;
	static ArrayList<Customer> sList= new ArrayList<Customer>();
	static int count = 0;
	public CustomerDao()
	{
		try {
			theCon = DBConnectionMySQL.getConnection();
			stmt = theCon.createStatement();
		} 
		
		catch (SQLException e) 
		{
			System.out.println("Not Connected with SQL");
		} 
		catch ( ClassNotFoundException e) 
		{
			System.out.println("Not Connected ClassNotFound.");
		} 
	}
	public void insert(Customer c)
	{
		try 
		{
			String strQuery = "INSERT INTO customer  VALUES ("+c.getCustomerId()+",'"
		+c.getName()+"','"+c.getAddress()+"','"+c.getContactNo()+"','"+c.getEmail()
		+"','"+c.getCnic()+"')";
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void update(Customer c)
	{
		try 
		{
			String strQuery = "UPDATE customer SET CustomerId="
				+c.getCustomerId()+",Name='"+c.getName()+"',Address='"+c.getAddress()
				+"',Contact='"+c.getContactNo()+"',Email='"+c.getEmail()+"',CNIC='"
				+c.getCnic()+"' WHERE CustomerId="+c.getCustomerId();
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void deleteCustomer(int cust)
	{
		try 
		{
			String strQuery = "DELETE FROM customer WHERE CustomerId="+cust;
			System.out.println(strQuery);
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

