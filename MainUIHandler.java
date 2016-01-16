package businessHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import userInterface.CustomerUI;
import userInterface.MainUI;
import userInterface.TestMethodUI;
import userInterface.TestTypeUI;
import userInterface.TestUI;

public class MainUIHandler implements ActionListener 
{
	private MainUI mainGui;
	public MainUIHandler(MainUI mainGui) 
	{
		super();
		this.mainGui = mainGui;
	}
	
	public MainUI getMainGui() 
	{
		return mainGui;
	}

	public void setMainGui(MainUI mainGui) 
	{
		this.mainGui = mainGui;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Customer"))
		{
			CustomerUI cui=new CustomerUI();
			cui.validate();
		}
		if (e.getActionCommand().equals("Test"))
		{
			TestUI cui=new TestUI();
			cui.validate();
		}
		if (e.getActionCommand().equals("TestType"))
		{
			TestTypeUI cui=new TestTypeUI();
			cui.validate();
		}
		if (e.getActionCommand().equals("TestMethod"))
		{
			TestMethodUI cui=new TestMethodUI();
			cui.validate();
		}
	}

}
