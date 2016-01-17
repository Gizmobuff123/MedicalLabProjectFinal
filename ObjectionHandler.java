package businessHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import userInterface.DeleteObjectionUI;
import userInterface.NewObjectionUI;
import userInterface.ObjectionUI;
import userInterface.UpdateObjectionUI;


public class ObjectionHandler implements ActionListener 
{
	private ObjectionUI oGui;
	

	public ObjectionUI getOGui() 
	{
		return oGui;
	}


	public void setObjectionGui(ObjectionUI oGui) 
	{
		this.oGui = oGui;
	}
	

	public ObjectionHandler(ObjectionUI oGui) 
	{
		super();
		this.oGui = oGui;
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("New Objection"))
		{
			
			NewObjectionUI tui=new NewObjectionUI();
			tui.validate();
		}
		else if (e.getActionCommand().equals("Update Objection"))
		{
			UpdateObjectionUI tui=new UpdateObjectionUI();
			tui.validate();
		}
		else if (e.getActionCommand().equals("Delete Objection"))
		{
			DeleteObjectionUI tui=new DeleteObjectionUI();
			tui.validate();
		}
	}

}

