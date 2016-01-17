package medicalLabDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import databaseConnection.DBConnectionMySQL;
import medicalLabEntities.TestType;

public class TestTypeDao
{
	Connection theCon;
	Statement stmt;
	static ArrayList<TestType> sList= new ArrayList<TestType>();
	static int count = 0;
	public TestTypeDao()
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
	public void insert(TestType tt)
	{
		try 
		{
			String strQuery = "INSERT INTO testtype VALUES ("+tt.getTestCode()+","
		+tt.getTestRate()+",'"+tt.getDescription()+"',"+tt.getTestMethodId()+")";
			System.out.println(strQuery);
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void update(TestType tt)
	{
		try 
		{
			String strQuery = "UPDATE testtype SET TestCode="
				+tt.getTestCode()+",TestRate="+tt.getTestRate()+",Description='"+tt.getDescription()
				+"',TestMethod_TestMethodId="+tt.getTestMethodId()+" WHERE TestCode="+tt.getTestCode();
			System.out.println(strQuery);
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void deleteTestType(int cust)
	{
		try 
		{
			String strQuery = "DELETE FROM testtype WHERE TestCode="+cust;
			System.out.println(strQuery);
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}


