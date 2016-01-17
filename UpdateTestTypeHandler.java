package businessHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.TestTypeDao;
import medicalLabEntities.TestType;
import userInterface.UpdateTestTypeUI;

public class UpdateTestTypeHandler implements ActionListener 
{
	private UpdateTestTypeUI nttui;
	private TestTypeDao ttDao;
	
	public UpdateTestTypeHandler(UpdateTestTypeUI nttui) 
	{
		super();
		this.nttui = nttui;
		ttDao=new TestTypeDao();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Update"))
		{
			TestType tt=new TestType();
			String strcode=nttui.Testcodetext.getText();
			int Id=Integer.parseInt(strcode);
			String strrate=nttui.testidtext.getText();
			int rate=Integer.parseInt(strrate);
			String strdes=nttui.Discriptiontext.getText();
			String strtmid=nttui.Testmethodidtext.getText();
			int tmid=Integer.parseInt(strtmid);
			tt.setTestCode(Id);
			tt.setTestRate(rate);
			tt.setDescription(strdes);
			tt.setTestMethodId(tmid);
			ttDao.update(tt);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}

