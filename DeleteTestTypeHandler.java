package businessHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.TestTypeDao;
import userInterface.DeleteTestTypeUI;

public class DeleteTestTypeHandler implements ActionListener 
{
	private DeleteTestTypeUI nttui;
	private TestTypeDao ttDao;
	
	public DeleteTestTypeHandler(DeleteTestTypeUI nttui) 
	{
		super();
		this.nttui = nttui;
		ttDao=new TestTypeDao();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Delete"))
		{
			String strcode=nttui.Testcodetext.getText();
			int Id=Integer.parseInt(strcode);
			ttDao.deleteTestType(Id);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}


