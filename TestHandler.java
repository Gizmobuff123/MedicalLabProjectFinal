package businessHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import userInterface.DeleteTestUI;
import userInterface.NewTestUI;
import userInterface.TestUI;
import userInterface.UpdateTestUI;


public class TestHandler implements ActionListener 
{
	private TestUI testGui;
	

	public TestUI getTestGui() 
	{
		return testGui;
	}


	public void setTestGui(TestUI testGui) 
	{
		this.testGui = testGui;
	}
	

	public TestHandler(TestUI testGui) 
	{
		super();
		this.testGui = testGui;
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("New Test"))
		{
			
			NewTestUI tui=new NewTestUI();
			tui.validate();
		}
		else if (e.getActionCommand().equals("Update Test"))
		{
			UpdateTestUI tui=new UpdateTestUI();
			tui.validate();
		}
		else if (e.getActionCommand().equals("Delete Test"))
		{
			DeleteTestUI tui=new DeleteTestUI();
			tui.validate();
		}
	}

}
