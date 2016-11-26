package UserView;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import uiService.HotelBrowseUiService;
import uiService.HotelSearchUiService;


public class HotelBrowseView extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label11,label12;
	private JButton button1,button2;
	private JTable table,table1;
	private DefaultTableModel model,model1;
	private HotelBrowseUiService controller;
	

	public HotelBrowseView(HotelBrowseUiService c){
		this.controller=c;
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));;
		initButton();
		initTable();
		this.validate();
	}

	private void initButton() {
		JPanel panel= new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		button1=new JButton("返回");
		panel.add(button1);
		this.add(panel);
		button1.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				controller.toHotelSearchView("id");
			}
		});
		JPanel panel1= new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		label1=new JLabel("酒店名称：");
		panel1.add(label1);
		this.add(panel1);
		JPanel panel2= new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		label2=new JLabel("酒店星级：");
		panel2.add(label2);
		this.add(panel2);
		JPanel panel11= new JPanel();
		panel11.setLayout(new FlowLayout(FlowLayout.LEFT));
		label11=new JLabel("酒店评分：");
		panel11.add(label11);
		this.add(panel11);
		JPanel panel12= new JPanel();		
		panel12.setLayout(new FlowLayout(FlowLayout.LEFT));
		label12=new JLabel("客房类型：");
		panel12.add(label12);
		this.add(panel12);
		JPanel panel3= new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		label3=new JLabel("所属地址：");
		panel3.add(label3);
		this.add(panel3);
		JPanel panel4= new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
		label4=new JLabel("所属商圈：");
		panel4.add(label4);
		this.add(panel4);
		JPanel panel5= new JPanel();
		panel5.setLayout(new FlowLayout(FlowLayout.LEFT));
		label5=new JLabel("设施服务：");
		panel5.add(label5);
		this.add(panel5);
		JPanel panel6= new JPanel();
		panel6.setLayout(new FlowLayout(FlowLayout.LEFT));
		label6=new JLabel("酒店简介：");
		panel6.add(label6);
		this.add(panel6);
		JPanel panel7= new JPanel();
		panel7.setLayout(new FlowLayout(FlowLayout.LEFT));
		label7=new JLabel("酒店联系方式：");
		panel7.add(label7);
		this.add(panel7);
		JPanel panel8= new JPanel();
		panel8.setLayout(new FlowLayout(FlowLayout.LEFT));
		label8=new JLabel("酒店营销策略：");
		panel8.add(label8);
		this.add(panel8);
		JPanel panel9= new JPanel();
		panel9.setLayout(new FlowLayout(FlowLayout.LEFT));
		label9=new JLabel("酒店各类型房间价格：");
		panel9.add(label9);
		this.add(panel9);
		
		
	}
	private void initTable() {
		JPanel panel1=new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel label1=new JLabel("历史订单：");
		panel1.add(label1);
		this.add(panel1);
        JScrollPane scrollPane1 = new JScrollPane();  
		Vector<String> vColumns1 = new Vector<String>();
		vColumns1.add("订单号");
		vColumns1.add("订单状态");
		vColumns1.add("入住时间");
		vColumns1.add("退房时间");
		vColumns1.add("房间类型");
		vColumns1.add("房间数量");
		vColumns1.add("价值");
		vColumns1.add("评分");
		model1= new DefaultTableModel(null, vColumns1);
		table1 = new JTable(model1){
			private static final long serialVersionUID = 1L;
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		table1.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane1.getViewport().add(table1);
		table1.setFillsViewportHeight(true);
		this.add(scrollPane1);
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel label=new JLabel("客户评价：");
		panel.add(label);
		this.add(panel);
        JScrollPane scrollPane = new JScrollPane();
        
		Vector<String> vColumns = new Vector<String>();
		vColumns.add("客户账号");
		vColumns.add("客户评价");
		vColumns.add("客户评分");
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
		JPanel panel10= new JPanel();
		panel10.setLayout(new FlowLayout(FlowLayout.CENTER));
		button2=new JButton("下订单");
		panel10.add(button2);
		this.add(panel10);
		button2.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				controller.toOrderBuildView("id");
			}
		});
	}
}

