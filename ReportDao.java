package medicalLabDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import databaseConnection.DBConnectionMySQL;
import medicalLabEntities.Report;

public class ReportDao
{
	Connection theCon;
	Statement stmt;
	static ArrayList<Report> sList= new ArrayList<Report>();
	static int count = 0;
	public ReportDao()
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
	public void insert(Report r)
	{
		try 
		{
			String strQuery = "INSERT INTO report VALUES ("+r.getReportId()+",'"
		+r.getDescription()+"',"+r.getTestId()+")";
			System.out.println(strQuery);
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void update(Report r)
	{
		try 
		{
			String strQuery = "UPDATE report SET ReportId="
				+r.getReportId()+",Description='"+r.getDescription()+"',TestId="+r.getTestId()
				+" WHERE ReportId="+r.getReportId();
			System.out.println(strQuery);
			
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void deleteReport(int tst)
	{
		try 
		{
			String strQuery = "DELETE FROM report WHERE ReportId="+tst;
			System.out.println(strQuery);
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

