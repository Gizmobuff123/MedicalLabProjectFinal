package medicalLabEntities;

public class TestMethod 
{
	private int testMethodId;
	private String testMethodName;
	public int getTestMethodId() 
	{
		return testMethodId;
	}
	public void setTestMethodId(int testMethodId) 
	{
		this.testMethodId = testMethodId;
	}
	public String getTestMethodName() 
	{
		return testMethodName;
	}
	public void setTestMethodName(String testMethodName) 
	{
		this.testMethodName = testMethodName;
	}
	public TestMethod(int testMethodId, String testMethodName) 
	{
		super();
		this.testMethodId = testMethodId;
		this.testMethodName = testMethodName;
	}
	public TestMethod() 
	{
		super();
	}
	
}
