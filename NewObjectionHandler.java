package businessHandler;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.ObjectionDao;
import medicalLabEntities.Objection;
import userInterface.NewObjectionUI;



public class NewObjectionHandler implements ActionListener 
{
	private NewObjectionUI noui;
	private ObjectionDao oDao;
	
	public NewObjectionHandler(NewObjectionUI noui) 
	{
		super();
		this.noui = noui;
		oDao=new ObjectionDao();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Ok"))
		{
			Objection o=new Objection();
			String strId=noui.Objectionidtext.getText();
			int Id=Integer.parseInt(strId);
			String des=noui.Discriptiontext.getText();
			String strcid=noui.Customeridtext.getText();
			int cid=Integer.parseInt(strcid);
			o.setObjectionId(Id);
			o.setDescription(des);
			o.setCustomerId(cid);
			oDao.insert(o);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}
