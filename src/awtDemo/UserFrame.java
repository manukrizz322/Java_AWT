package awtDemo;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserFrame extends Frame implements ActionListener  {

	Label lblTitle,lblId,lblName,lblCity,lblAge,lblStatus;
	TextField txtName,txtId,txtCity,txtAge;
	Button btnSave ,btnClear,btnDelete;
	
	String qry="";
	Connection con=null;
	PreparedStatement st=null;
	ResultSet rs= null;
	Statement stmt=null;
	
	
	//Database Connection
	public  void  connect() {
		
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/automation_db?characterEncoding=utf8";
		String username="root";
		String password="root";
	    con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
	
	//Clear Form Details
	public void Clear() {
		txtId.setText("");
		txtName.setText("");
		txtAge.setText("");
		txtCity.setText("");
		txtName.requestFocus();
		
	}
	public UserFrame() {
		connect();
		this.setVisible(true);
		this.setSize(1000,600);
		this.setTitle("User Management System");
		this.setLayout(null);
		Color formColor=new Color(53,59,72);
		this.setBackground(formColor);
		
		Font titleFont=new Font("arial",Font.BOLD,25);
		Font labelFont=new Font("arail",Font.PLAIN,18);
		Font textFont=new Font("arial",Font.PLAIN,18);
		
		lblTitle=new Label("User Management System");
		lblTitle.setBounds(250,40,400,50);
		lblTitle.setFont(titleFont);
		lblTitle.setForeground(Color.YELLOW);
		add(lblTitle);
		
		lblId=new Label("ID");
		lblId.setBounds(250,100,150,30);
		lblId.setFont(labelFont);
		lblId.setForeground(Color.WHITE);
		add(lblId);
		
		txtId=new TextField();
		txtId.setBounds(400,100,400,30);
		txtId.setFont(textFont);
		txtId.addActionListener(this);
		add(txtId);
		
		lblName=new Label("Name");
		lblName.setBounds(250,150,150,30);
		lblName.setFont(labelFont);
		lblName.setForeground(Color.WHITE);
		add(lblName);
		
		txtName=new TextField();
		txtName.setBounds(400,150,400,30);
		txtName.setFont(textFont);
		add(txtName);
		
		lblAge = new Label("Age");
		lblAge.setBounds(250, 200, 150, 30);
		lblAge.setFont(labelFont);
		lblAge.setForeground(Color.WHITE);
		add(lblAge);
 
		txtAge = new TextField();
		txtAge.setBounds(400, 200, 400, 30);
		txtAge.setFont(textFont);
		add(txtAge);
 
		lblCity = new Label("City");
		lblCity.setBounds(250, 250, 150, 30);
		lblCity.setFont(labelFont);
		lblCity.setForeground(Color.WHITE);
		add(lblCity);
 
		txtCity = new TextField();
		txtCity.setBounds(400, 250, 400, 30);
		txtCity.setFont(textFont);
		add(txtCity);
		
		btnSave=new Button("Save");
		btnSave.setBounds(400,300,100,30);
		btnSave.setBackground(Color.BLUE);
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(labelFont);
		btnSave.addActionListener(this);
		add(btnSave);
		
		btnClear=new Button("Clear");
		btnClear.setBounds(520,300,100,30);
		btnClear.setBackground(Color.ORANGE);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(labelFont);
		btnClear.addActionListener(this);
		add(btnClear);
		
		btnDelete=new Button("Delete");
		btnDelete.setBounds(640,300,100,30);
		btnDelete.setBackground(Color.RED);
		btnDelete.setForeground(Color.white);
		btnDelete.setFont(labelFont);
		btnDelete.addActionListener(this);
		add(btnDelete);
		
		lblStatus=new Label("------------------");
		lblStatus.setFont(labelFont);
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setBounds(400,350,300,30);
		add(lblStatus);
		
		this.addWindowListener(new WindowAdapter() {
		
		@Override
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String id=txtId.getText();
			String name=txtName.getText();
			String age=txtAge.getText();
			String city=txtCity.getText();
			
			if (e.getSource().equals(txtId)) {
				//Get User By ID
				qry="SELECT ID,NAME,AGE,CITY from users where ID="+txtId.getText();
				stmt=con.createStatement();
				rs=stmt.executeQuery(qry);
				if (rs.next()) {
					txtId.setText(rs.getString("ID"));
					txtName.setText(rs.getString("NAME"));
					txtAge.setText(rs.getString("AGE"));
					txtCity.setText(rs.getString("CITY"));
				}
				else {
					Clear();
					lblStatus.setText("Invalid ID");
					
				}
			
			}
			if(e.getSource().equals(btnClear)) {
				Clear();
			}
			else if (e.getSource().equals(btnSave)) {
				
				if(id.isEmpty()||id.equals("")) {
				//Save Details
				qry="insert into users (NAME,AGE,CITY) values(?,?,?)";
				st=con.prepareStatement(qry);
				st.setString(1, name);
				st.setString(2, age);
				st.setString(3, city);
				st.executeUpdate();
				Clear();
				
				lblStatus.setText("Data Insert Success");}
				
			else {
				//Update Details
				qry="update users set NAME=?,AGE=?,CITY=? where ID=?";
				st=con.prepareStatement(qry);
				st.setString(1, name);
				st.setString(2, age);
				st.setString(3, city);
				st.setString(4, id);
				st.executeUpdate();
				Clear();
				lblStatus.setText("Data Update Sucess");
				
			}
				
			}
			else if(e.getSource().equals(btnDelete)) {
				
				//Delete Details
					if (!id.isEmpty()||!id.equals("")) {
						qry="delete from users where ID=?";
						st=con.prepareStatement(qry);
						st.setString(1, id);
						st.executeUpdate();
						Clear();
						lblStatus.setText("Data Deleted Success");
						
					}else {
						lblStatus.setText("Please Enter The Correct ID");
						
					}
				
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
