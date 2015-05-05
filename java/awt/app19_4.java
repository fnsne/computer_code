import java.awt.*;
import java.awt.event.*;
public class app19_4 extends Frame implements ItemListener
{
	static app19_4 frm = new app19_4();
	static Choice chc = new Choice();
	public static void main(String[] args )
	{
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,25));
		frm.setTitle("List class");
		chc.add("yellow");
		chc.add("orange");
		chc.add("pink");
		chc.add("cyan");
		chc.addItemListener(frm);
		frm.add(chc);
		frm.setSize(300,200);
		frm.setVisible(true);
	}
	public void itemStateChanged( ItemEvent e )
	{
		String color = chc.getSelectedItem();
		if(color == "yellow")
			frm.setBackground(Color.yellow);
		else if(color == "orange")
			frm.setBackground(Color.orange);
		else if(color == "pink")
			frm.setBackground(Color.pink);
		else if(color == "cyan")
			frm.setBackground(Color.cyan);
		frm.setTitle("you select "+color);
	}
}	
