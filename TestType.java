package medicalLabEntities;

public class TestType 
{
	private int testCode;
	private int testRate;
	private String description;
	private int testMethodId;
	public int getTestCode() 
	{
		return testCode;
	}
	public void setTestCode(int testCode) 
	{
		this.testCode = testCode;
	}
	public int getTestRate() 
	{
		return testRate;
	}
	public void setTestRate(int testRate) 
	{
		this.testRate = testRate;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public int getTestMethodId() 
	{
		return testMethodId;
	}
	public void setTestMethodId(int testMethodId) 
	{
		this.testMethodId = testMethodId;
	}
	public TestType(int testCode, int testRate, String description,
			int testMethodId) 
	{
		super();
		this.testCode = testCode;
		this.testRate = testRate;
		this.description = description;
		this.testMethodId = testMethodId;
	}
	public TestType() 
	{
		super();
	}
	
}
