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

import medicalLabEntities.TestType;



public class TestTypeTable extends JFrame 
{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public TestTypeTable()
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
 Logger.getLogger(TestTypeTable.class.getName()).log(Level.SEVERE, null, ex);
 }

 return con;
}

static ArrayList<TestType> getUsers()
{

 ArrayList<TestType> users = new ArrayList<TestType>();

 Connection con = getConnection();

 Statement st;

 ResultSet rs;

 TestType u;

 try 
 {

 st = con.createStatement();
 rs = st.executeQuery("SELECT * FROM testtype");

 while(rs.next())
 {

 u = new TestType(

 rs.getInt("TestCode"),
 rs.getInt("TestRate"),
 rs.getString("Description"),
 rs.getInt("TestMethod_TestMethodId")

 );

 users.add(u);
 }

 } catch (SQLException ex) 
 {
 Logger.getLogger(TestTypeTable.class.getName()).log(Level.SEVERE, null, ex);
 }

 return users;
}

public static void main(String[] args)
{

 JTable table = new JTable();

 DefaultTableModel model = new DefaultTableModel();

 Object[] columnsName = new Object[4];

 columnsName[0] = "TestCode";
 columnsName[1] = "TestRate";
 columnsName[2] = "Description";
 columnsName[3] = "TestMethodId";

 model.setColumnIdentifiers(columnsName);

 Object[] rowData = new Object[4];

 for(int i = 0; i < getUsers().size(); i++)
 {

 rowData[0] = getUsers().get(i).getTestCode();
 rowData[1] = getUsers().get(i).getTestRate();
 rowData[2] = getUsers().get(i).getDescription();
 rowData[3] = getUsers().get(i).getTestMethodId();

 model.addRow(rowData);
 }

 table.setModel(model);

// System.out.println(getUsers().size());

 TestTypeTable window = new TestTypeTable();

 JPanel panel = new JPanel();

 panel.setLayout(new BorderLayout());

 JScrollPane pane = new JScrollPane(table);

 panel.add(pane,BorderLayout.CENTER);

 window.setContentPane(panel);
 }
 }
