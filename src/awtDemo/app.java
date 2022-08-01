package awtDemo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class app extends Frame {
/**	public app() {
		super("Tutor Joes");
		setSize(1000, 600);// w,h
		setLayout(null);
		setVisible(true);
 
		add(new My_App_Canvas());
 
 
 
		// Close Button Code
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}**/

	public static void main(String[] args) {
		/**
		 * 01_method Frame frm=new Frame("Tutor Joes"); frm.setSize(1000,600);//w,h
		 * frm.setLayout(null);
		 * 
		 * Button btn=new Button("Click Me"); btn.setBounds(75,75,200,50);//X,Y,W,H
		 * 
		 * frm.add(btn); frm.setVisible(true);
		 **/

		// MyApp_CheckBox frm=new MyApp_CheckBox();
		// MyApp_RadioButton frm=new MyApp_RadioButton();
		// MyApp_TestField frm=new MyApp_TestField();
		// MyApp_Basic_Addition frm=new MyApp_Basic_Addition();
		// MyApp_TextArea frm=new MyApp_TextArea();
		// MyAPP_Count_Words_Characters frm=new MyAPP_Count_Words_Characters();
		// My_App_Choice_Java frm=new My_App_Choice_Java();
		// MyAPP_List frm=new MyAPP_List();
		//app frm = new app();
		//MyApp_Menu_bar frm=new MyApp_Menu_bar();
		//MyApp_Panel frm=new MyApp_Panel();
		//My_App_Form_Design frm=new My_App_Form_Design();
		UserFrame frm=new UserFrame();
	}

}
