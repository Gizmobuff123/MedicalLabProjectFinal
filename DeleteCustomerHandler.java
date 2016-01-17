package businessHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.CustomerDao;
import userInterface.DeleteCustomerUI;

public class DeleteCustomerHandler implements ActionListener 
{
	private DeleteCustomerUI ncui;
	private CustomerDao cDao;
	
	
	public DeleteCustomerHandler(DeleteCustomerUI ncui) 
	{
		super();
		this.ncui = ncui;
		cDao=new CustomerDao();
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Delete"))
		{
			String strdel=ncui.Customeridtext.getText();
			int c=Integer.parseInt(strdel);
			cDao.deleteCustomer(c);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}

