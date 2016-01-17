package businessHandler;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.ReportDao;
import medicalLabEntities.Report;
import userInterface.UpdateReportUI;



public class UpdateReportHandler implements ActionListener 
{
	private UpdateReportUI urui;
	private ReportDao rDao;
	
	public UpdateReportHandler(UpdateReportUI urui) 
	{
		super();
		this.urui = urui;
		rDao=new ReportDao();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Update"))
		{
			Report r=new Report();
			String strId=urui.Reportidtext.getText();
			int Id=Integer.parseInt(strId);
			String des=urui.Discriptiontext.getText();
			String strtid=urui.Testidtext.getText();
			int tid=Integer.parseInt(strtid);
			r.setReportId(Id);
			r.setDescription(des);
			r.setTestId(tid);
			rDao.update(r);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}

