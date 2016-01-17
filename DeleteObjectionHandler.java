package businessHandler;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.ObjectionDao;
import userInterface.DeleteObjectionUI;



public class DeleteObjectionHandler implements ActionListener 
{
	private DeleteObjectionUI doui;
	private ObjectionDao oDao;
	
	public DeleteObjectionHandler(DeleteObjectionUI doui) 
	{
		super();
		this.doui = doui;
		oDao=new ObjectionDao();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Delete"))
		{
			
			String strId=doui.Objectionidtext.getText();
			int Id=Integer.parseInt(strId);
			
			oDao.deleteObjection(Id);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}
