package medicalLabDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import databaseConnection.DBConnectionMySQL;
import medicalLabEntities.TestMethod;

public class TestMethodDao
{
	Connection theCon;
	Statement stmt;
	static ArrayList<TestMethod> sList= new ArrayList<TestMethod>();
	static int count = 0;
	public TestMethodDao()
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
	public void insert(TestMethod tm)
	{
		try 
		{
			String strQuery = "INSERT INTO testmethod VALUES ("+tm.getTestMethodId()
		+",'"+tm.getTestMethodName()+"')";
			System.out.println(strQuery);
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void update(TestMethod tm)
	{
		try 
		{
			String strQuery = "UPDATE testmethod SET TestMethodId="
				+tm.getTestMethodId()+",TestMethodName='"+tm.getTestMethodName()+
				"' WHERE TestMethodid="+tm.getTestMethodId();
			System.out.println(strQuery);
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void deleteTestMethod(int cust)
	{
		try 
		{
			String strQuery = "DELETE FROM testmethod WHERE TestMethodId="+cust;
			System.out.println(strQuery);
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}


