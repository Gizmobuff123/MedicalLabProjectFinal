package businessHandler;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.TestDao;
import medicalLabEntities.Test;
import userInterface.NewTestUI;



public class NewTestHandler implements ActionListener 
{
	private NewTestUI ntui;
	private TestDao tDao;
	
	public NewTestHandler(NewTestUI ntui) 
	{
		super();
		this.ntui = ntui;
		tDao=new TestDao();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Add Test"))
		{
			Test t=new Test();
			String strId=ntui.Testidtext.getText();
			int Id=Integer.parseInt(strId);
			String scid=ntui.Customeridtext.getText();
			int Cid=Integer.parseInt(scid);
			String strtcode=ntui.Testcodetext.getText();
			int Tcode=Integer.parseInt(strtcode);
			t.setTestId(Id);
			t.setCustomerId(Cid);
			t.setTestCode(Tcode);
			tDao.insert(t);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}
