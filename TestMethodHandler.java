package businessHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import userInterface.DeleteTestMethodUI;
import userInterface.NewTestMethodUI;
import userInterface.TestMethodUI;
import userInterface.UpdateTestMethodUI;


public class TestMethodHandler implements ActionListener 
{
	private TestMethodUI tmGui;
	public TestMethodUI getTmGui() 
	{
		return tmGui;
	}
	public void setTmGui(TestMethodUI tmGui) 
	{
		this.tmGui = tmGui;
	}
	

	public TestMethodHandler(TestMethodUI tmGui) 
	{
		super();
		this.tmGui = tmGui;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("New Test Method"))
		{
			
			NewTestMethodUI nttui=new NewTestMethodUI();
			nttui.validate();
		}
		else if (e.getActionCommand().equals("Update Test Method"))
		{
			UpdateTestMethodUI uttui=new UpdateTestMethodUI();
			uttui.validate();
		}
		else if (e.getActionCommand().equals("Delete Test Method"))
		{
			DeleteTestMethodUI dttui=new DeleteTestMethodUI();
			dttui.validate();
		}
	}

}
