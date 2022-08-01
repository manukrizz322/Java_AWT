package awtDemo;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyApp_RadioButton extends Frame {
	Label l1, l2;
	Checkbox c1, c2;
	CheckboxGroup cbg;

	public MyApp_RadioButton() {
		super("Tutor Joes");
		setSize(1000, 600);
		setLayout(null);
		setVisible(true);

		cbg = new CheckboxGroup();

		c1 = new Checkbox("Male", cbg, false);
		c1.setBounds(10, 50, 250, 30);

		l1 = new Label("Not Selected");
		l1.setBounds(300, 50, 600, 30);

		c2 = new Checkbox("Female", cbg, false);
		c2.setBounds(10, 100, 250, 30);

		l2 = new Label("Not Selected");
		l2.setBounds(300, 100, 600, 30);

		c1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				l1.setText((e.getStateChange() == 1 ? "checked" : "unchecked"));
				l2.setText("unchecked");
			}
		}

		);
		c2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				l1.setText("unchecked");
				l2.setText((e.getStateChange()==1?"checked":"unchecked"));
			}
		});
		
		add(c1);
		add(l1);
		add(c2);
		add(l2);
		
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
		
		});
	}

}
