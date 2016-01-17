package businessHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import userInterface.CustomerUI;
import userInterface.DeleteCustomerUI;
import userInterface.NewCustomerUI;
import userInterface.UpdateCustomerUI;

public class CustomerUIHandler implements ActionListener 
{
	private CustomerUI customerGui;
	public CustomerUI getCustomerGui() 
	{
		return customerGui;
	}

	public void setCustomerGui(CustomerUI customerGui) 
	{
		this.customerGui = customerGui;
	}
	
	public CustomerUIHandler(CustomerUI customerGui) 
	{
		super();
		this.customerGui = customerGui;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("New Customer"))
		{
			
			NewCustomerUI cui=new NewCustomerUI();
			cui.validate();
		}
		else if (e.getActionCommand().equals("Update Customer"))
		{
			UpdateCustomerUI cui=new UpdateCustomerUI();
			cui.validate();
		}
		else if (e.getActionCommand().equals("Delete Customer"))
		{
			DeleteCustomerUI cui=new DeleteCustomerUI();
			cui.validate();
		}
	}

}
