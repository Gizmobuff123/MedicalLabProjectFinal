package medicalLabEntities;

public class Report 
{
	private int reportId;
	private String description;
	private int testId;
	public int getReportId() 
	{
		return reportId;
	}
	public void setReportId(int reportId) 
	{
		this.reportId = reportId;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public int getTestId() 
	{
		return testId;
	}
	public void setTestId(int testId) 
	{
		this.testId = testId;
	}
	public Report(int reportId, String description, int testId) 
	{
		super();
		this.reportId = reportId;
		this.description = description;
		this.testId = testId;
	}
	public Report() 
	{
		super();
	}
	
}
