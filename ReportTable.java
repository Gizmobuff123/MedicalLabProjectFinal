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

import medicalLabEntities.Report;



public class ReportTable extends JFrame 
{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public ReportTable()
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
 Logger.getLogger(ReportTable.class.getName()).log(Level.SEVERE, null, ex);
 }

 return con;
}

static ArrayList<Report> getUsers()
{

 ArrayList<Report> users = new ArrayList<Report>();

 Connection con = getConnection();

 Statement st;

 ResultSet rs;

 Report u;

 try 
 {

 st = con.createStatement();
 rs = st.executeQuery("SELECT * FROM report");

 while(rs.next())
 {

 u = new Report(

 rs.getInt("ReportId"),
 rs.getString("Description"),
 rs.getInt("TestId")
 );

 users.add(u);
 }

 } catch (SQLException ex) 
 {
 Logger.getLogger(ReportTable.class.getName()).log(Level.SEVERE, null, ex);
 }

 return users;
}

public static void main(String[] args)
{

 JTable table = new JTable();

 DefaultTableModel model = new DefaultTableModel();

 Object[] columnsName = new Object[3];

 columnsName[0] = "ReportId";
 columnsName[1] = "Description";
 columnsName[2] = "TestId";

 model.setColumnIdentifiers(columnsName);

 Object[] rowData = new Object[3];

 for(int i = 0; i < getUsers().size(); i++)
 {

 rowData[0] = getUsers().get(i).getReportId();
 rowData[1] = getUsers().get(i).getDescription();
 rowData[2] = getUsers().get(i).getTestId();
 model.addRow(rowData);
 }

 table.setModel(model);

// System.out.println(getUsers().size());

 ReportTable window = new ReportTable();

 JPanel panel = new JPanel();

 panel.setLayout(new BorderLayout());

 JScrollPane pane = new JScrollPane(table);

 panel.add(pane,BorderLayout.CENTER);

 window.setContentPane(panel);
 }
 }
