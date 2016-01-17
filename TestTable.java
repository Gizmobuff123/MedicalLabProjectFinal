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

import medicalLabEntities.Test;



public class TestTable extends JFrame 
{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public TestTable()
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
 Logger.getLogger(TestTable.class.getName()).log(Level.SEVERE, null, ex);
 }

 return con;
}

static ArrayList<Test> getUsers()
{

 ArrayList<Test> users = new ArrayList<Test>();

 Connection con = getConnection();

 Statement st;

 ResultSet rs;

 Test u;

 try 
 {

 st = con.createStatement();
 rs = st.executeQuery("SELECT * FROM test");

 while(rs.next())
 {

 u = new Test(

 rs.getInt("TestId"),
 rs.getInt("Customer_CustomerId"),
 rs.getInt("TestType_TestCode")

 );

 users.add(u);
 }

 } catch (SQLException ex) 
 {
 Logger.getLogger(TestTable.class.getName()).log(Level.SEVERE, null, ex);
 }

 return users;
}

public static void main(String[] args)
{

 JTable table = new JTable();

 DefaultTableModel model = new DefaultTableModel();

 Object[] columnsName = new Object[3];

 columnsName[0] = "TestId";
 columnsName[1] = "CustomerId";
 columnsName[2] = "TestMethodId";

 model.setColumnIdentifiers(columnsName);

 Object[] rowData = new Object[3];

 for(int i = 0; i < getUsers().size(); i++)
 {

 rowData[0] = getUsers().get(i).getTestId();
 rowData[1] = getUsers().get(i).getCustomerId();
 rowData[2] = getUsers().get(i).getTestCode();

 model.addRow(rowData);
 }

 table.setModel(model);

// System.out.println(getUsers().size());

 TestTable window = new TestTable();

 JPanel panel = new JPanel();

 panel.setLayout(new BorderLayout());

 JScrollPane pane = new JScrollPane(table);

 panel.add(pane,BorderLayout.CENTER);

 window.setContentPane(panel);
 }
 }
