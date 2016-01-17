package medicalLabDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import databaseConnection.DBConnectionMySQL;
import medicalLabEntities.Objection;

public class ObjectionDao
{
	Connection theCon;
	Statement stmt;
	static ArrayList<Objection> sList= new ArrayList<Objection>();
	static int count = 0;
	public ObjectionDao()
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
	public void insert(Objection o)
	{
		try 
		{
			String strQuery = "INSERT INTO objection  VALUES ("+o.getObjectionId()+",'"
		+o.getDescription()+"',"+o.getCustomerId()+")";
			System.out.println(strQuery);
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void update(Objection o)
	{
		try 
		{
			String strQuery = "UPDATE objection SET ObjectionId="
				+o.getObjectionId()+",Description='"+o.getDescription()+"',Customer_CustomerId="+o.getCustomerId()
				+" WHERE ObjectionId="+o.getObjectionId();
			System.out.println(strQuery);
			
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void deleteObjection(int tst)
	{
		try 
		{
			String strQuery = "DELETE FROM objection WHERE ObjectionId="+tst;
			System.out.println(strQuery);
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

