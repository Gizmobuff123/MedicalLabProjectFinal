package userInterface;

import java.awt.HeadlessException;

import javax.swing.*;

import businessHandler.DeleteObjectionHandler;

public class DeleteObjectionUI extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton GoBackToObjection =new JButton();
	public JLabel Objectionid=new JLabel();

	public JTextField Objectionidtext=new JTextField();
	
	JButton DeleteObjection=new JButton();
	JButton Show=new JButton();
	
public DeleteObjectionUI() throws HeadlessException 
	{
		
		super();
		interface21();
	}

@SuppressWarnings("deprecation")
public void interface21()
{
	GoBackToObjection.setText("Back");
	GoBackToObjection.setBounds(30,30,70,45);

    Objectionid.setText("Objection id");
    Objectionid.setBounds(50,100,100,55);
    Objectionidtext.setBounds(175,100,100,55);
    
    DeleteObjection.setText("Delete");
	DeleteObjection.setBounds(100,200,85,55);
	
	Show.setText("Show");
	Show.setBounds(185,200,75,55);
	this.setSize(400,400);
    
	
	this.show();
	this.setLayout(null);
	this.add(GoBackToObjection);
	this.add(Objectionid);
	this.add(Objectionidtext);
	this.add(DeleteObjection);
	this.add(Show);
	DeleteObjectionHandler doh=new DeleteObjectionHandler(this);
	DeleteObjection.addActionListener(doh);
    
    
}



}

