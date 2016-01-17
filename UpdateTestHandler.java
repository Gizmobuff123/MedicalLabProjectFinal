package businessHandler;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.TestDao;
import medicalLabEntities.Test;
import userInterface.UpdateTestUI;



public class UpdateTestHandler implements ActionListener 
{
	private UpdateTestUI utui;
	private TestDao tDao;
	
	public UpdateTestHandler(UpdateTestUI utui) 
	{
		super();
		this.utui = utui;
		tDao=new TestDao();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Update Test"))
		{
			Test t=new Test();
			String strId=utui.Testidtext.getText();
			int Id=Integer.parseInt(strId);
			String scid=utui.Customeridtext.getText();
			int Cid=Integer.parseInt(scid);
			String strtcode=utui.Testcodetext.getText();
			int Tcode=Integer.parseInt(strtcode);
			t.setTestId(Id);
			t.setCustomerId(Cid);
			t.setTestCode(Tcode);
			tDao.update(t);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}
