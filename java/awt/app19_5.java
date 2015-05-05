import java.awt.*;
import java.awt.event.*;
public class app19_5 extends Frame
{
	static app19_5 frm = new app19_5();
	static MenuBar mb = new MenuBar();
	static Menu menu1 = new Menu("Color");
	static Menu menu2 = new Menu("Exit");
	static MenuItem mi1 = new MenuItem("Yellow");
	static MenuItem mi2 = new MenuItem("Orange");
	static MenuItem mi3 = new MenuItem("Pink");
	static MenuItem mi4 = new MenuItem("Close window");

	public static void main( String[] args )
	{
		mb.add(menu1);
		mb.add(menu2);
		menu1.add(mi1);
		menu1.add(mi2);
		menu1.add(mi3);
		menu2.add(mi4);
		frm.setMenuBar(mb);
		frm.setSize(200,250);
		frm.setVisible(true);
	}

}
