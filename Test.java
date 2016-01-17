package medicalLabEntities;

public class Test
{
	private int profileId;
	private int testCode;
	
	public int getProfileId() 
	{
		return profileId;
	}
	public void setProfileId(int profileId) 
	{
		this.profileId = profileId;
	}
	public int getTestCode() 
	{
		return testCode;
	}
	public void setTestCode(int testCode) 
	{
		this.testCode = testCode;
	}
	public Test(int profileId, int testCode) 
	{
		super();
		this.profileId = profileId;
		this.testCode = testCode;
	}
	public Test() 
	{
		super();
	}
	
}
