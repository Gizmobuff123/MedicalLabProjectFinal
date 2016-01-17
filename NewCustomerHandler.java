package businessHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import medicalLabDao.CustomerDao;
import medicalLabEntities.Customer;
import userInterface.NewCustomerUI;

public class NewCustomerHandler implements ActionListener 
{
	private NewCustomerUI ncui;
	private CustomerDao cDao;
	
	public NewCustomerHandler(NewCustomerUI ncui) 
	{
		super();
		this.ncui = ncui;
		cDao=new CustomerDao();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Ok"))
		{
			Customer c=new Customer();
			String strId=ncui.Customeridtext.getText();
			int Id=Integer.parseInt(strId);
			String strName=ncui.CustomerNametext.getText();
			String strAdress=ncui.CAddresstext.getText();
			String strContact=ncui.CContactNotext.getText();
			String strEmail=ncui.CEmailtext.getText();
			String strCnic=ncui.CCNICtext.getText();
			c.setCustomerId(Id);
			c.setName(strName);
			c.setAddress(strAdress);
			c.setContactNo(strContact);
			c.setEmail(strEmail);
			c.setCnic(strCnic);
			cDao.insert(c);
			JOptionPane.showMessageDialog(null, "New Profile Created");	
		}
	}

}
