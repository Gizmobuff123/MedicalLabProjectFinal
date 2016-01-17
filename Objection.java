package medicalLabEntities;

public class Objection 
{
	private int objectionId;
	private String description;
	private int customerId;
	public int getObjectionId() 
	{
		return objectionId;
	}
	public void setObjectionId(int objectionId) 
	{
		this.objectionId = objectionId;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public int getCustomerId() 
	{
		return customerId;
	}
	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}
	public Objection(int objectionId, String description, int customerId) 
	{
		super();
		this.objectionId = objectionId;
		this.description = description;
		this.customerId = customerId;
	}
	public Objection() 
	{
		super();
	}
	
}
