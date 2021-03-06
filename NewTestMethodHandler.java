package businessHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.TestMethodDao;
import medicalLabEntities.TestMethod;
import userInterface.NewTestMethodUI;

public class NewTestMethodHandler implements ActionListener 
{
	private NewTestMethodUI nttui;
	private TestMethodDao ttDao;
	
	public NewTestMethodHandler(NewTestMethodUI nttui) 
	{
		super();
		this.nttui = nttui;
		ttDao=new TestMethodDao();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Ok"))
		{
			TestMethod tt=new TestMethod();
			String strid=nttui.TestMethodidtext.getText();
			int Id=Integer.parseInt(strid);
			String strname=nttui.TestMethodNametext.getText();
			tt.setTestMethodId(Id);
			tt.setTestMethodName(strname);
			ttDao.insert(tt);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}

