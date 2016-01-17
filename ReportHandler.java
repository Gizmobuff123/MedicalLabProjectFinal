package businessHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import userInterface.DeleteReportUI;
import userInterface.NewReportUI;
import userInterface.ReportUI;
import userInterface.UpdateReportUI;


public class ReportHandler implements ActionListener 
{
	private ReportUI rGui;
	

	public ReportUI getRGui() 
	{
		return rGui;
	}


	public void setRGui(ReportUI rGui) 
	{
		this.rGui = rGui;
	}
	

	public ReportHandler(ReportUI rGui) 
	{
		super();
		this.rGui = rGui;
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("New Report"))
		{
			
			NewReportUI tui=new NewReportUI();
			tui.validate();
		}
		else if (e.getActionCommand().equals("Update Report"))
		{
			UpdateReportUI tui=new UpdateReportUI();
			tui.validate();
		}
		else if (e.getActionCommand().equals("Delete Report"))
		{
			DeleteReportUI tui=new DeleteReportUI();
			tui.validate();
		}
	}

}

