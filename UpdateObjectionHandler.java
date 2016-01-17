package businessHandler;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.ObjectionDao;
import medicalLabEntities.Objection;
import userInterface.UpdateObjectionUI;



public class UpdateObjectionHandler implements ActionListener 
{
	private UpdateObjectionUI noui;
	private ObjectionDao oDao;
	
	public UpdateObjectionHandler(UpdateObjectionUI noui) 
	{
		super();
		this.noui = noui;
		oDao=new ObjectionDao();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Update"))
		{
			Objection o=new Objection();
			String strId=noui.Objctionidtext.getText();
			int Id=Integer.parseInt(strId);
			String des=noui.Discriptiontext.getText();
			String strcid=noui.Customeridtext.getText();
			int cid=Integer.parseInt(strcid);
			o.setObjectionId(Id);
			o.setDescription(des);
			o.setCustomerId(cid);
			oDao.update(o);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}
