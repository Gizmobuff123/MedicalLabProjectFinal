package medicalLabDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import databaseConnection.DBConnectionMySQL;
import medicalLabEntities.Test;

public class TestDao
{
	Connection theCon;
	Statement stmt;
	static ArrayList<Test> sList= new ArrayList<Test>();
	static int count = 0;
	public TestDao()
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
	public void insert(Test t)
	{
		try 
		{
			String strQuery = "INSERT INTO test  VALUES ("+t.getTestId()+","
		+t.getCustomerId()+","+t.getTestCode()+")";
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void update(Test t)
	{
		try 
		{
			String strQuery = "UPDATE test SET TestId="
				+t.getTestId()+",Customer_CustomerId="+t.getCustomerId()+",TestType_TestCode="+t.getTestCode()
				+" WHERE TestId="+t.getTestId();
			
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void deleteTest(int tst)
	{
		try 
		{
			String strQuery = "DELETE FROM test WHERE TestId="+tst;
			System.out.println(strQuery);
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

