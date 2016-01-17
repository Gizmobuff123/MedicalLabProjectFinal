package jTable;


import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import medicalLabEntities.Customer;



public class CustomerTable extends JFrame 
{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public CustomerTable()
{

 super("Bind JTable From MySQL DataBase");

 setLocationRelativeTo(null);

 setSize(600,400);

 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 setVisible(true);


 }

static Connection getConnection(){
 Connection con = null;

 try {
 con = DriverManager.getConnection("jdbc:mysql://localhost/MedicalLab","root","Haxan7665");
 } catch (SQLException ex) 
 {
 Logger.getLogger(CustomerTable.class.getName()).log(Level.SEVERE, null, ex);
 }

 return con;
}

static ArrayList<Customer> getUsers()
{

 ArrayList<Customer> users = new ArrayList<Customer>();

 Connection con = getConnection();

 Statement st;

 ResultSet rs;

 Customer u;

 try 
 {

 st = con.createStatement();
 rs = st.executeQuery("SELECT * FROM customer");

 while(rs.next())
 {

 u = new Customer(

 rs.getInt("CustomerId"),
 rs.getString("Name"),
 rs.getString("Address"),
 rs.getString("Contact"),
 rs.getString("Email"),
 rs.getString("CNIC")

 );

 users.add(u);
 }

 } catch (SQLException ex) 
 {
 Logger.getLogger(CustomerTable.class.getName()).log(Level.SEVERE, null, ex);
 }

 return users;
}

public static void main(String[] args)
{

 JTable table = new JTable();

 DefaultTableModel model = new DefaultTableModel();

 Object[] columnsName = new Object[6];

 columnsName[0] = "CustomerId";
 columnsName[1] = "Name";
 columnsName[2] = "Address";
 columnsName[3] = "Contact";
 columnsName[4] = "Email";
 columnsName[5] = "Cnic";

 model.setColumnIdentifiers(columnsName);

 Object[] rowData = new Object[6];

 for(int i = 0; i < getUsers().size(); i++)
 {

 rowData[0] = getUsers().get(i).getCustomerId();
 rowData[1] = getUsers().get(i).getName();
 rowData[2] = getUsers().get(i).getAddress();
 rowData[3] = getUsers().get(i).getContactNo();
 rowData[4] = getUsers().get(i).getEmail();
 rowData[5] = getUsers().get(i).getCnic();

 model.addRow(rowData);
 }

 table.setModel(model);

// System.out.println(getUsers().size());

 CustomerTable window = new CustomerTable();

 JPanel panel = new JPanel();

 panel.setLayout(new BorderLayout());

 JScrollPane pane = new JScrollPane(table);

 panel.add(pane,BorderLayout.CENTER);

 window.setContentPane(panel);
 }
 }
