package OrderManagementView;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;

import HistroyHotelView.HistroyHotelViewControllerService;
import LoginView.main;
import VO.OrderVO;
import customerMainView.customerMainView;
import customerMainView.customerMainViewControllerImpl;
import customerMainView.customerMainViewControllerService;
import orderDetailView.orderDetailView;
import orderDetailView.orderDetailViewControllerService;
import orderDetailView.orderDetailViewControllerServiceImpl;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import CommentView.CommentView;
import CommentView.CommentViewControllerService;
import CommentView.CommentViewControllerServiceImpl;

public class OrderView extends JPanel {
	private OrderViewControllerService controller;
	private JPanel panel;
    private JButton back;
    private JPanel panel_1;
	
	private JComboBox<String> typebox;
	
	private JScrollPane scrollPane;
	
	private DefaultTableModel model;
	private JButton cancelorder ;
	
	private JButton commentorder ;
	private JTable table;
	private String UserID;
	
	
	/**
	 * Create the panel.
	 */
	public OrderView(OrderViewControllerService controller) {
		this.controller=controller;
		setLayout(null);
        this.controller=controller;
        UserID=controller.getUserID();
        init_exit();
        
        init_order();
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
	public void exit(){
		customerMainViewControllerService con =  new customerMainViewControllerImpl(UserID);
		customerMainView vie = new customerMainView(con);
		con.setView(vie);
		main.change(this,vie);
	}
	public void init_order(){
		panel_1 = new JPanel();
		panel_1.setBounds(10, 125, 980, 537);
		add(panel_1);
		panel_1.setLayout(null);
		
		typebox = new JComboBox<String>();
		Vector<String> type=new Vector<String>();
		type.add("��������");
		type.add("δִ�ж���");
		type.add("��ִ�ж���");
		type.add("�쳣����");
		type.add("��������");
		for(String i:type){
			typebox.addItem(i);
		}
		typebox.setFont(new Font("����", Font.PLAIN, 30));
		typebox.setBounds(29, 25, 206, 52);
		typebox.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent evt) {
				// TODO Auto-generated method stub
                if(evt.getStateChange() == ItemEvent.SELECTED){
					
					String selected=(String)typebox.getSelectedItem();
					
					//��������Դ
					controller.updateList(selected);
                }
			}			
		});
		panel_1.add(typebox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 100, 914, 414);
		panel_1.add(scrollPane);
		
		Vector<OrderVO> Data=new Vector<OrderVO>();
		//Data.addAll(controller.getOrderList());
		Vector<String> Columns=new Vector<String>();
		Columns.add("������");
		Columns.add("����״̬");
		Columns.add("�ͻ�����");
		Columns.add("��ֵ");
		Columns.add("��������");
		Columns.add("����");
		model=new DefaultTableModel(Data,Columns);
		table = new JTable(model){
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		
		table.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("����", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		
		cancelorder = new JButton("\u64A4\u9500\u8BA2\u5355");
		cancelorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = table.getSelectedRow();
				if(index == -1){
					JOptionPane.showMessageDialog(null, "��ѡ�񶩵���","", JOptionPane.ERROR_MESSAGE);
					return;
				}
				String id=(String)table.getValueAt(index, 0);
				controller.cancel(id);
			}
		});
		table.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.getClickCount()==2){
					int index = table.getSelectedRow();
					if(index == -1){
						JOptionPane.showMessageDialog(null, "��ѡ�񶩵���","", JOptionPane.ERROR_MESSAGE);
						return;
					}
					String id=(String) table.getValueAt(index, 0);
					controller.showDetail(id);
				}
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub		
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub	
			}
		});
		cancelorder.setEnabled(false);
		cancelorder.setFont(new Font("����", Font.PLAIN, 25));
		cancelorder.setBounds(355, 27, 147, 52);
		panel_1.add(cancelorder);
		
		commentorder = new JButton("\u8BC4\u4EF7\u8BA2\u5355");
		commentorder.setEnabled(false);
		commentorder.setFont(new Font("����", Font.PLAIN, 25));
		commentorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      controller.comment();
			}
		});
		commentorder.setBounds(566, 27, 147, 52);
		panel_1.add(commentorder);
	}
	public void updateList(Vector<OrderVO> list,String type){
		if(type.equals("δִ�ж���")){
		    model.setRowCount(0);
		    for(OrderVO vo:list){
		    	model.addRow(vo);
		    }
			cancelorder.setEnabled(true);
			commentorder.setEnabled(false);
		}
		else if(type.equals("��ִ�ж���")){
			model.setRowCount(0);
		    for(OrderVO vo:list){
		    	model.addRow(vo);
		    }
			cancelorder.setEnabled(false);
			commentorder.setEnabled(true);
		}
		else {
			model.setRowCount(0);
		    for(OrderVO vo:list){
		    	model.addRow(vo);
		    }
			cancelorder.setEnabled(false);
			commentorder.setEnabled(false);
		}
	}
	public void comment(){
		int index = table.getSelectedRow();
		if(index == -1){
			JOptionPane.showMessageDialog(null, "��ѡ�񶩵���","", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(!table.getValueAt(index, 5).equals("")){
			JOptionPane.showMessageDialog(null, "��������Ѿ������۹��ˣ�","", JOptionPane.ERROR_MESSAGE);
			return;
		}
		String id=(String)table.getValueAt(index, 0);
		CommentViewControllerService con =  new CommentViewControllerServiceImpl(controller.getUserID(),id);
		CommentView vie = new CommentView(con);
		con.setView(vie);
		main.change(this,vie);
	}
	public void cancel(){
		table.remove(table.getSelectedRow());
	}
	public void showDetail(String id){
		orderDetailViewControllerService con =  new orderDetailViewControllerServiceImpl(controller.getUserID(),id);
		orderDetailView vie = new orderDetailView(con);
		con.setView(vie);
		main.change(this, vie);
	}
}
