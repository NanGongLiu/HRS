package HotelWorkerView;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import VO.OrderVO;
import common.UserType;
import uiService.ProcessOrderUiService;

public class ProcessOrderView extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private int hotelId;
	
	private ProcessOrderUiService controller;
	
	private JComboBox<String> orderTypeComboBox;
	
	private JButton back;
	
	private JButton cancel;
	
	private JButton delayButton;
	
	private JButton entryButton;
	
	private JTable orderTable;
	
	private DefaultTableModel orderListModel;
	
	private JPanel delayPanel;
	
	private JPanel cancelPanel;
	
	private JLabel delayLabel;
	
	private JTextField delayTextField;
	
	private JButton delayProcessButton;
	
	private JButton cancelButton;
	
	private JFrame delayFrame;
	
	private JFrame cancelFrame;
	
	public ProcessOrderView(ProcessOrderUiService controller){
		this.controller = controller;
		this.hotelId = controller.getHotelId();
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		//��ʼ����������ѡ���
		initOrderTypeCombobox();
		
		//��ʼ��������ť
		initOrderProcessButtons();
		
		//��ʼ�������б�
		initOrderListTable();
		
		this.validate();
	}

	private void initOrderTypeCombobox() {
		
		orderTypeComboBox = new JComboBox<String>();
		
		//���������б�
		List<String> list=new ArrayList<String>();
		list.add("��������");
		list.add("δִ�ж���");
		list.add("��ִ�ж���");
		list.add("�쳣����");
		
		//��ʼ��combobox
		for (String str : list) {
			orderTypeComboBox.addItem(str);
		}
		
		//����ѡ���¼�
		orderTypeComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evt) {
			
				if(evt.getStateChange() == ItemEvent.SELECTED){
					
					String selected=(String)orderTypeComboBox.getSelectedItem();
					
					//��������Դ
					controller.updateListModel(selected);
				}
			}

		});
		
		//���������
		JPanel orderTypeJpanel = new JPanel();
		orderTypeJpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel orderTypeJLabel=new JLabel("�������ͣ�");
		orderTypeJpanel.add(orderTypeJLabel);
		orderTypeJpanel.add(orderTypeComboBox);
		this.add(orderTypeJpanel);
		
	}
	
	private void initOrderProcessButtons(){
	
		delayButton = new JButton("��������");
		//��Ӱ�ť�����¼�
		delayButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				//������ת
				controller.delayOrderButtonClicked();
			}
		});
		
		entryButton = new JButton("�ͻ���ס");
		//��Ӱ�ť�����¼�
		entryButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//����δִ�ж�����ť����¼�
				controller.processOrderButtonClicked();
				
			}
		});
		cancel=new JButton("����");
		cancel.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
                controller.cancelAbnormalOrder();
			}
		});
		back=new JButton("����");
		back.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
                back();
			}
		});
		//��Ӷ���������
		JPanel processPanel = new JPanel();
		processPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		processPanel.add(delayButton);
		processPanel.add(entryButton);
		processPanel.add(cancel);
		processPanel.add(back);
		delayButton.setEnabled(false);
		entryButton.setEnabled(false);
		cancel.setEnabled(false);
		this.add(processPanel);
	}
    private void back(){
		controller.back();
    }
	private void initOrderListTable() {
		JScrollPane scrollPane = new JScrollPane();
		
		//��ͷ
		Vector<String> vColumns = new Vector<String>();
		vColumns.add("�������");
		vColumns.add("��������");
		vColumns.add("�û���Ϣ");
		vColumns.add("��סʱ��");
		vColumns.add("��������ִ��ʱ��");
		vColumns.add("����״̬");
		vColumns.add("������ֵ");
	
		//����
		Vector<OrderVO> vData = new Vector<OrderVO>();
		vData.addAll(controller.getAllOrders(hotelId));
		//ģ��
		orderListModel = new DefaultTableModel(vData, vColumns);
		//���
		orderTable = new JTable(orderListModel){
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		orderTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollPane.getViewport().add(orderTable);
		orderTable.setFillsViewportHeight(true);
		this.add(scrollPane);
	}
	
	/**
	 * ��������ť����¼�
	 */
	public void processOrderButtonClicked() {
		int index = orderTable.getSelectedRow();
		if(index == -1){
			JOptionPane.showMessageDialog(null, "��ѡ�񶩵���","", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		int orderNo=Integer.valueOf((String)orderTable.getValueAt(index, 0));
		if(controller.processUnfinishedOrder(orderNo)){
			orderListModel.removeRow(index);
		}else{
			JOptionPane.showMessageDialog(null, "�����û���סʧ�ܣ�","", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * �ڶ������͸ı�֮������б�����Դ
	 * @param selected
	 */
	public void updateListModel(String selected) {
		if(selected == "��������"){
			//���¶����б�
			orderListModel.setRowCount(0);
			List<OrderVO> list=controller.getAllOrders(hotelId);
			if(!list.isEmpty()){
				for (OrderVO orderVo : controller.getAllOrders(hotelId)) {
					orderListModel.addRow(orderVo);
					cancel.setEnabled(false);
				}
			}
			//���ÿؼ���������
			cancel.setEnabled(false);
			delayButton.setEnabled(false);
			entryButton.setEnabled(false);
			
		}else if(selected == "δִ�ж���"){
			//���¶����б�
			orderListModel.setRowCount(0);
			List<OrderVO> list=controller.getUnfinishedOrders(hotelId);
			if(!list.isEmpty()){
				for (OrderVO orderVo : controller.getUnfinishedOrders(hotelId)) {
					orderListModel.addRow(orderVo);
				}
			}
			
			//���ÿؼ���������
			cancel.setEnabled(false);
			delayButton.setEnabled(false);
			entryButton.setEnabled(true);
			
		}else if(selected == "��ִ�ж���"){
			//���¶����б�
			orderListModel.setRowCount(0);
			List<OrderVO> list=controller.getFinishedOrders(hotelId);
			if(!list.isEmpty()){
				for (OrderVO orderVo : controller.getFinishedOrders(hotelId)) {
					orderListModel.addRow(orderVo);
				}
			}
			//���ÿؼ���������
			cancel.setEnabled(false);
			delayButton.setEnabled(false);
			entryButton.setEnabled(false);
		}else if(selected == "�쳣����"){
			//���¶����б�
			orderListModel.setRowCount(0);
			List<OrderVO> list=controller.getAbnormalOrders(hotelId);
			if(!list.isEmpty()){
				for (OrderVO orderVo : controller.getAbnormalOrders(hotelId)) {
					orderListModel.addRow(orderVo);
				}
			}
			//���ÿؼ���������
			cancel.setEnabled(false);
			delayButton.setEnabled(true);
			entryButton.setEnabled(false);
		}
	}
	
	/**
	 * ���쳣�����������
	 * @param index
	 */
	public void delayOrderButtonClicked(){
		
		int index = orderTable.getSelectedRow();
		
		if(index == -1){
			JOptionPane.showMessageDialog(null, "��ѡ�񶩵���","", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		final int rowIndex = index;
		final int orderNo =Integer.valueOf((String)orderTable.getValueAt(index, 0));
		
		delayFrame = new JFrame();
		delayFrame.setSize(600, 80);
		delayFrame.setLocation(400, 400);
		
		delayPanel = new JPanel();
		delayPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		delayLabel = new JLabel("��������������yyyy/MM/dd HH:mm:ss��");
		delayTextField = new JTextField(10);
		delayProcessButton = new JButton("����");
		//����������
		delayProcessButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				if(delayOrder(orderNo)){
					orderListModel.removeRow(rowIndex);
				}
				
			}
		});
		cancelButton = new JButton("ȡ��");
		//ȡ���������ڴ���
		cancelButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//�رմ���
				delayFrame.dispose();
				
			}
		});
		delayPanel = new JPanel();
		delayPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		delayPanel.add(delayLabel);
		delayPanel.add(delayTextField);
		delayPanel.add(delayProcessButton);
		delayPanel.add(cancelButton);
		
		delayFrame.getContentPane().add(delayPanel);
		delayFrame.setVisible(true);
		
	}
	
	//�������ڰ�ť����¼�
	private boolean delayOrder(int orderNo) {
	
		String delayTime = delayTextField.getText();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		try {
			Date date = sdf.parse(delayTime);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "�밴��ʽ��yyyy/MM/dd HH:mm:ss����дʱ�䣡","", JOptionPane.ERROR_MESSAGE);
			delayTextField.setText("");
			return false;
		}
		
		
		if(controller.processAbnormalOrder(orderNo,delayTime)){	
			delayFrame.dispose();
			return true;
		}else{
			JOptionPane.showMessageDialog(null, "�����쳣����ʧ�ܣ�","", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
	}

	public void cancelAbnormalOrder() {
		// TODO Auto-generated method stub
		int index = orderTable.getSelectedRow();
		if(index == -1){
			JOptionPane.showMessageDialog(null, "��ѡ�񶩵���","", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		final int rowIndex = index;
		final int orderNo =Integer.valueOf((String)orderTable.getValueAt(index, 0));
		
		cancelFrame = new JFrame();
		cancelFrame.setSize(1000, 700);
		cancelFrame.setLocation(10, 10);
		cancelPanel=new JPanel();
		cancelPanel.setLayout(new BoxLayout(cancelPanel,BoxLayout.Y_AXIS));
		JPanel p1=new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel jl=new JLabel("�ָ����ԣ�");
		JComboBox<String> strategy=new JComboBox<String>();
		strategy.addItem("ȫ��");
		strategy.addItem("һ��");
		strategy.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evt) {
				if(evt.getStateChange() == ItemEvent.SELECTED){

				}
			}
		});
		p1.add(jl);
		p1.add(strategy);
		cancelPanel.add(p1);
		JPanel p2=new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton Confir=new JButton("ȷ��");
		Confir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		JButton Cancel=new JButton("ȡ��");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cancelFrame.dispose();
			}
		});
		p2.add(Confir);
		p2.add(Cancel);
		cancelPanel.add(p2);
		cancelFrame.getContentPane().add(cancelPanel);
		cancelFrame.setVisible(true);
	}

	public void enableCancel() {
		// TODO Auto-generated method stub
		cancel.setEnabled(true);
	}
}
