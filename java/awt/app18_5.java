import java.awt.*;
import java.awt.event.*;
public class app18_5 extends Frame implements ItemListener
{
	static app18_5 frm = new app18_5();
	static Checkbox ckb1 = new Checkbox("5900L");
	static Checkbox ckb2 = new Checkbox("HP");
	static Label lab = new Label(" Select a printer");

	public static void main( String[] args )
	{
		CheckboxGroup grp = new CheckboxGroup();
		frm.setSize(200,150);
		frm.setTitle("Item Event");
		frm.setLayout(new FlowLayout(FlowLayout.LEFT));
		ckb1.setCheckboxGroup(grp);
		ckb2.setCheckboxGroup(grp);
		lab.setBackground(Color.orange);
		ckb1.addItemListener(frm);
		ckb2.addItemListener(frm);
		frm.add(ckb1);
		frm.add(ckb2);
		frm.add(lab);
		frm.setVisible(true);
	}	
	public void itemStateChanged( ItemEvent e )
	{
		if(ckb1.getState() == true)
			lab.setText(" 5900L ");
		else if(ckb2.getState() == true)
			lab.setText("HP");
	}
}
