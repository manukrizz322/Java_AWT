package awtDemo;

import java.awt.*;
import java.awt.event.*;

public class MyAPP_List extends Frame {
	List lst;
	Button btn;
	Label lbl;

	public MyAPP_List() {
		super("Tutor Joes");
		setSize(1000, 600);
		setLayout(null);
		setVisible(true);
		lst = new List(4, true);
		lst.setBounds(10, 50, 100, 100);
		lst.add("Mercury");
		lst.add("venus");
		lst.add("Earth");
		lst.add("Mars");
		lst.add("jupiter");
		lst.add("Saturn");
		lst.add("Uranus");
		lst.add("Neptune");
		lst.add("Pluto");

		btn = new Button("Show Details");
		btn.setBounds(10, 170, 100, 30);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String List[] = lst.getSelectedItems();
				String data = "Selected Planet : ";
				for (String x : List) {
					data += x + ",";
					lbl.setText(data);
				}
			}
		});
		
		lbl=new Label("Empty Label");
		lbl.setBounds(200,170,300,30);
		
		add(lst);
		add(btn);
		add(lbl);
		
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
		});
	}
}
