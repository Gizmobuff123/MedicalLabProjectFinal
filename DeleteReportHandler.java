package businessHandler;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.ReportDao;
import userInterface.DeleteReportUI;



public class DeleteReportHandler implements ActionListener 
{
	private DeleteReportUI drui;
	private ReportDao rDao;
	
	public DeleteReportHandler(DeleteReportUI drui) 
	{
		super();
		this.drui = drui;
		rDao=new ReportDao();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Delete"))
		{
			
			String strId=drui.Reportidtext.getText();
			int Id=Integer.parseInt(strId);
			
			rDao.deleteReport(Id);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}
