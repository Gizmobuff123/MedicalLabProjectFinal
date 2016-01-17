package businessHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import userInterface.TestTypeUI;
import userInterface.DeleteTestTypeUI;
import userInterface.NewTestTypeUI;
import userInterface.UpdateTestTypeUI;

public class TestTypeHandler implements ActionListener 
{
	private TestTypeUI ttGui;
	

	public TestTypeUI getTtGui() 
	{
		return ttGui;
	}


	public void setTtGui(TestTypeUI ttGui) 
	{
		this.ttGui = ttGui;
	}
	
	public TestTypeHandler(TestTypeUI ttGui) 
	{
		super();
		this.ttGui = ttGui;
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("New Test Type"))
		{
			
			NewTestTypeUI nttui=new NewTestTypeUI();
			nttui.validate();
		}
		else if (e.getActionCommand().equals("Update Test Type"))
		{
			UpdateTestTypeUI uttui=new UpdateTestTypeUI();
			uttui.validate();
		}
		else if (e.getActionCommand().equals("Delete Test Type Record"))
		{
			DeleteTestTypeUI dttui=new DeleteTestTypeUI();
			dttui.validate();
		}
	}

}
