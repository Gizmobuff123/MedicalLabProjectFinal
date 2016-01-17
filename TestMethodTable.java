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

import medicalLabEntities.TestMethod;



public class TestMethodTable extends JFrame 
{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public TestMethodTable()
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
 Logger.getLogger(TestMethodTable.class.getName()).log(Level.SEVERE, null, ex);
 }

 return con;
}

static ArrayList<TestMethod> getUsers()
{

 ArrayList<TestMethod> users = new ArrayList<TestMethod>();

 Connection con = getConnection();

 Statement st;

 ResultSet rs;

 TestMethod u;

 try 
 {

 st = con.createStatement();
 rs = st.executeQuery("SELECT * FROM testmethod");

 while(rs.next())
 {

 u = new TestMethod(

 rs.getInt("TestMethodId"),
 rs.getString("TestMethodName")
 );

 users.add(u);
 }

 } catch (SQLException ex) 
 {
 Logger.getLogger(TestMethodTable.class.getName()).log(Level.SEVERE, null, ex);
 }

 return users;
}

public static void main(String[] args)
{

 JTable table = new JTable();

 DefaultTableModel model = new DefaultTableModel();

 Object[] columnsName = new Object[2];

 columnsName[0] = "TestMethodId";
 columnsName[1] = "TestMethodName";

 model.setColumnIdentifiers(columnsName);

 Object[] rowData = new Object[2];

 for(int i = 0; i < getUsers().size(); i++)
 {

 rowData[0] = getUsers().get(i).getTestMethodId();
 rowData[1] = getUsers().get(i).getTestMethodName();

 model.addRow(rowData);
 }

 table.setModel(model);

// System.out.println(getUsers().size());

 TestMethodTable window = new TestMethodTable();

 JPanel panel = new JPanel();

 panel.setLayout(new BorderLayout());

 JScrollPane pane = new JScrollPane(table);

 panel.add(pane,BorderLayout.CENTER);

 window.setContentPane(panel);
 }
 }
