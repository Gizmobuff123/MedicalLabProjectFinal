package businessHandler;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.TestMethodDao;
import userInterface.DeleteTestMethodUI;

public class DeleteTestMethodHandler implements ActionListener 
{
	private DeleteTestMethodUI nttui;
	private TestMethodDao ttDao;
	
	public DeleteTestMethodHandler(DeleteTestMethodUI nttui) 
	{
		super();
		this.nttui = nttui;
		ttDao=new TestMethodDao();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Delete"))
		{
			String strid=nttui.TestMethodidtext.getText();
			int Id=Integer.parseInt(strid);
			ttDao.deleteTestMethod(Id);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}


