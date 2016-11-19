package UserView;

import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import uiService.HotelSearchUiService;

public class HotelSearchView extends JPanel{
	private static final long serialVersionUID = 1L;
	private JButton button1,button2,button3;
	private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17;
	private JComboBox<String> comboBox1,comboBox2,comboBox8,comboBox16;
	private JComboBox<Integer> comboBox3,comboBox4,comboBox5,comboBox6,comboBox7,comboBox9,comboBox10,comboBox11,comboBox12,comboBox13,comboBox14,comboBox15;
	private JTable table;
	private DefaultTableModel model;
	private HotelSearchUiService controller;
    
	public HotelSearchView(HotelSearchUiService c){
		this.controller=c;
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		initReturnButton();
		initCombobox();
		initButton();
		initTable();
		this.validate();
	}
	private void initReturnButton() {
		JPanel panel= new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		button1=new JButton("����");
		panel.add(button1);
		this.add(panel);
		button1.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				controller.toUserView();
			}
		});
		
	}
	private void initCombobox() {
		        JPanel panel1 = new JPanel();
				panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
				label1=new JLabel("��ַ");
				comboBox1= new JComboBox<String>();
				label2=new JLabel("     ��Ȧ");
				comboBox2= new JComboBox<String>();
				label3=new JLabel("     �Ǽ�");
				comboBox3= new JComboBox<Integer>();
				for(int i=1;i<6;i++){
				   comboBox3.addItem(i);
					}
				panel1.add(label1);
				panel1.add(comboBox1);
				panel1.add(label2);
				panel1.add(comboBox2);
				panel1.add(label3);
				panel1.add(comboBox3);;
				this.add(panel1);
				JPanel panel2 = new JPanel();
				panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
				label4=new JLabel("�۸�����");
				comboBox4= new JComboBox<Integer>();
				for(int i=0;i<100;i++){
				    comboBox4.addItem(100*i);
					}
				label5=new JLabel("-");
				comboBox5= new JComboBox<Integer>();
				for(int i=0;i<100;i++){
				    comboBox5.addItem(100*i);
					}
				label6=new JLabel("     ��������");
				comboBox6= new JComboBox<Integer>();
				for(int i=0;i<6;i++){
				    comboBox6.addItem(i);
					}
				label7=new JLabel("-");
				comboBox7= new JComboBox<Integer>();
				for(int i=0;i<6;i++){
				    comboBox7.addItem(i);
					}
				panel2.add(label4);
				panel2.add(comboBox4);
				panel2.add(label5);
				panel2.add(comboBox5);
				panel2.add(label6);
				panel2.add(comboBox6);
				panel2.add(label7);
				panel2.add(comboBox7);
				this.add(panel2);
				JPanel panel3 = new JPanel();
				panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
				label8=new JLabel("��������");
				comboBox8= new JComboBox<String>();
				label9=new JLabel("     ��������");
				comboBox9= new JComboBox<Integer>();
				for(int i=1;i<101;i++){
				    comboBox9.addItem(i);
					}
				panel3.add(label8);
				panel3.add(comboBox8);
				panel3.add(label9);
				panel3.add(comboBox9);
				this.add(panel3);
				JPanel panel4 = new JPanel();
				panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
				label10=new JLabel("��ס����");
				comboBox10= new JComboBox<Integer>();
				for(int i=2016;i<2018;i++){
				    comboBox10.addItem(i);
					}
				label11=new JLabel("��");
				comboBox11= new JComboBox<Integer>();
				for(int i=1;i<13;i++){
				    comboBox11.addItem(i);
					}
				label12=new JLabel("��");
				comboBox12= new JComboBox<Integer>();
				for(int i=1;i<32;i++){
				    comboBox12.addItem(i);
					}
				label13=new JLabel("��");
				label14=new JLabel("     ��ס����");
				comboBox13= new JComboBox<Integer>();
				for(int i=2016;i<2018;i++){
				    comboBox13.addItem(i);
					}
				label15=new JLabel("��");
				comboBox14= new JComboBox<Integer>();
				for(int i=1;i<13;i++){
				    comboBox14.addItem(i);
					}
				label16=new JLabel("��");
				comboBox15= new JComboBox<Integer>();
				for(int i=1;i<32;i++){
				    comboBox15.addItem(i);
					}
				label17=new JLabel("��");
				panel4.add(label10);
				panel4.add(comboBox10);
				panel4.add(label11);
				panel4.add(comboBox11);
				panel4.add(label12);
				panel4.add(comboBox12);
				panel4.add(label13);
				panel4.add(label14);
				panel4.add(comboBox13);
				panel4.add(label15);
				panel4.add(comboBox14);
				panel4.add(label16);
				panel4.add(comboBox15);
				panel4.add(label17);
				this.add(panel4);
				JPanel panel5 = new JPanel();
				panel5.setLayout(new FlowLayout(FlowLayout.LEFT));
				comboBox16= new JComboBox<String>();
				comboBox16.addItem("���оƵ�");
				comboBox16.addItem("Ԥ�����ľƵ�");
				comboBox16.addItem("δԤ�����ľƵ�");
				panel5.add(comboBox16);
				this.add(panel5);
	}
	private void initButton(){
		JPanel panel6 = new JPanel();
		panel6.setLayout(new FlowLayout(FlowLayout.LEFT));
		button2=new JButton("����Ƶ���Ϣ");
		button3=new JButton("�¶���");
		panel6.add(button2);
		panel6.add(button3);
		this.add(panel6);
		button2.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				controller.toHotelBrowseView();
			}
		});
		button3.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				controller.toOrderBuildView();
			}
		});
	}
	private void initTable() {
        JScrollPane scrollPane = new JScrollPane();
        
		Vector<String> vColumns = new Vector<String>();
		vColumns.add("�Ƶ�����");
		vColumns.add("�Ƶ��ַ");
		vColumns.add("�Ƶ��Ǽ�");
		vColumns.add("�Ƶ�����");
		vColumns.add("Ӫ������");
		vColumns.add("�Ƶ�۸�");
		model= new DefaultTableModel(null, vColumns);
		table = new JTable(model){
			private static final long serialVersionUID = 1L;
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		table.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.getViewport().add(table);
		table.setFillsViewportHeight(true);
		this.add(scrollPane);
	}
}
