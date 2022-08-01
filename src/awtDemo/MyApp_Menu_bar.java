package awtDemo;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyApp_Menu_bar extends Frame {
	
	public MyApp_Menu_bar() {
		super("Tutor Joes");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		MenuBar m=new MenuBar();
		Menu menu=new Menu("Menu");
		Menu submenu=new Menu("Sub Menu");
		MenuItem i1=new MenuItem("Item 1");
		MenuItem i2=new MenuItem("Item 2");  
        MenuItem i3=new MenuItem("Item 3");  
        MenuItem i4=new MenuItem("Item 4");  
        MenuItem i5=new MenuItem("Item 5");
        
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        m.add(menu);
        setMenuBar(m);
        
        this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
        });
		
	}
	
}
