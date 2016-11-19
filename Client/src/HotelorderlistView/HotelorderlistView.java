package HotelorderlistView;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import CreditView.CreditViewControllerService;
import LoginView.main;
import VO.CreditRecordVO;
import VO.OrderVO;
import customerMainView.customerMainView;
import customerMainView.customerMainViewControllerImpl;
import customerMainView.customerMainViewControllerService;

public class HotelorderlistView extends JPanel {
	private HotelorderlistViewControllerService controller;
    
	private JPanel panel;
	private JPanel panel_1;
	private JButton back;
	private JTable table;
	private JLabel label;
	private JLabel hotelname;
	private JScrollPane scrollPane;
	private String UserID;
	/**
	 * Create the panel.
	 */
	public HotelorderlistView(HotelorderlistViewControllerService controller) {
		setLayout(null);
		this.controller=controller;
		init_exit();
		UserID=controller.getUserID();
		init_table();
	}
	public void init_exit(){
		panel = new JPanel();
		panel.setBounds(784, 46, 174, 81);
		add(panel);
		panel.setLayout(null);
		
		back = new JButton("\u8FD4\u56DE");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			controller.exit();
			}
		});
		back.setFont(new Font("����", Font.PLAIN, 30));
		back.setBounds(10, 5, 150, 60);
		panel.add(back);
	}
	public void init_table(){
		panel_1 = new JPanel();
		panel_1.setBounds(78, 100, 842, 539);
		add(panel_1);
		panel_1.setLayout(null);
		
		label = new JLabel("\u9152\u5E97\u540D\u79F0\uFF1A");
		label.setFont(new Font("΢���ź�", Font.PLAIN, 30));
		label.setBounds(22, 37, 180, 64);
		panel_1.add(label);
		
		hotelname = new JLabel("");
		hotelname.setText("");
		hotelname.setFont(new Font("΢���ź�", Font.PLAIN, 30));
		hotelname.setBounds(227, 37, 180, 64);
		panel_1.add(hotelname);
		
		Vector<OrderVO> Data=new Vector<OrderVO>();
		//Data.addAll(controller.getOrderList());
		Vector<String> Columns=new Vector<String>();
		Columns.add("������");
		Columns.add("����״̬");
		Columns.add("�ͻ�����");
		Columns.add("�ͻ���ϵ��ʽ");
		Columns.add("��ס����");
		Columns.add("��ֵ");
		Columns.add("��������");
		Columns.add("��������");
		Columns.add("��סʱ��");
		Columns.add("����ִ��ʱ��");
		table = new JTable(Data,Columns){
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		table.setFont(new Font("����", Font.PLAIN, 15));
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		scrollPane.setEnabled(false);
		scrollPane.setBounds(10, 111, 822, 404);
		table.setFillsViewportHeight(true);
		panel_1.add(scrollPane);
	}
	public void exit(){
		customerMainViewControllerService con =  new customerMainViewControllerImpl(UserID);
		customerMainView vie = new customerMainView(con);
		con.setView(vie);
		main.change(this,vie);
	}
}
