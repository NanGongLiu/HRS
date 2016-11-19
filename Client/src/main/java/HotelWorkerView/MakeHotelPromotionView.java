package HotelWorkerView;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import uiService.MakeHotelPromotionUiService;

public class MakeHotelPromotionView extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private MakeHotelPromotionUiService controller;
	
	private JTextField promotionNameTextField;
	private JTextField startTimeTextField;
	private JTextField endTimeTextField;
	private JTextField discountTextField;
	private JTextField birthdayDiscountTextField;
	private JTextField threeRoomsDiscountTextField;
	private JTextField businessDiscountTextField;
	
	JButton backButton;
	JButton submitButton;
	
	public MakeHotelPromotionView(MakeHotelPromotionUiService controller) {
		this.controller = controller;
		initPanel();
		this.validate();
	}

	private void initPanel() {
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(new BorderLayout(0, 0));
		
		JPanel backPanel = new JPanel();
		this.add(backPanel, BorderLayout.NORTH);
		backPanel.setLayout(new BorderLayout(0, 0));
		
		backButton = new JButton("����");
		backPanel.add(backButton, BorderLayout.EAST);
		backButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				controller.toHotelMainView();
			}
		});
		
		JPanel hotelPromotionPanel = new JPanel();
		this.add(hotelPromotionPanel, BorderLayout.CENTER);
		hotelPromotionPanel.setLayout(new GridLayout(16, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		hotelPromotionPanel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 4, 0, 0));
		
		JPanel panel_1_1 = new JPanel();
		panel_1.add(panel_1_1);
		
		JLabel promotionNameLabel = new JLabel("Ӫ���������ƣ�");
		promotionNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(promotionNameLabel);
		
		promotionNameTextField = new JTextField();
		panel_1.add(promotionNameTextField);
		promotionNameTextField.setColumns(10);
		
		JPanel panel_1_2 = new JPanel();
		panel_1.add(panel_1_2);
		
		JPanel panel_2 = new JPanel();
		hotelPromotionPanel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		hotelPromotionPanel.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 4, 0, 0));
		
		JPanel panel_3_1 = new JPanel();
		panel_3.add(panel_3_1);
		
		JLabel startTimeLabel = new JLabel("���ʼʱ�䣺");
		startTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(startTimeLabel);
		
		startTimeTextField = new JTextField();
		panel_3.add(startTimeTextField);
		startTimeTextField.setColumns(10);
		
		JPanel panel_3_2 = new JPanel();
		panel_3.add(panel_3_2);
		
		JPanel panel_4 = new JPanel();
		hotelPromotionPanel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		hotelPromotionPanel.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 4, 0, 0));
		
		JPanel panel_5_1 = new JPanel();
		panel_5.add(panel_5_1);
		
		JLabel endTimeLabel = new JLabel("�����ʱ�䣺");
		endTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(endTimeLabel);
		
		endTimeTextField = new JTextField();
		panel_5.add(endTimeTextField);
		endTimeTextField.setColumns(10);
		
		JPanel panel_5_2 = new JPanel();
		panel_5.add(panel_5_2);
		
		JPanel panel_6 = new JPanel();
		hotelPromotionPanel.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		hotelPromotionPanel.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 4, 0, 0));
		
		JPanel panel_7_1 = new JPanel();
		panel_7.add(panel_7_1);
		
		JLabel discountLabel = new JLabel("��ۿۣ�");
		discountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(discountLabel);
		
		discountTextField = new JTextField();
		panel_7.add(discountTextField);
		discountTextField.setColumns(10);
		
		JPanel panel_7_2 = new JPanel();
		panel_7.add(panel_7_2);
		
		JPanel panel_8 = new JPanel();
		hotelPromotionPanel.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		hotelPromotionPanel.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 4, 0, 0));
		
		JPanel panel_9_1 = new JPanel();
		panel_9.add(panel_9_1);
		
		JLabel birthdayDiscountLabel = new JLabel("�ͻ������Ż��ۿۣ�");
		birthdayDiscountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(birthdayDiscountLabel);
		
		birthdayDiscountTextField = new JTextField();
		panel_9.add(birthdayDiscountTextField);
		birthdayDiscountTextField.setColumns(10);
		
		JPanel panel_9_2 = new JPanel();
		panel_9.add(panel_9_2);
		
		JPanel panel_10 = new JPanel();
		hotelPromotionPanel.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		hotelPromotionPanel.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 4, 0, 0));
		
		JPanel panel_11_1 = new JPanel();
		panel_11.add(panel_11_1);
		
		JLabel threeRoomsDiscountLabel = new JLabel("�ͻ������������ۿۣ�");
		threeRoomsDiscountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(threeRoomsDiscountLabel);
		
		threeRoomsDiscountTextField = new JTextField();
		panel_11.add(threeRoomsDiscountTextField);
		threeRoomsDiscountTextField.setColumns(10);
		
		JPanel panel_11_2 = new JPanel();
		panel_11.add(panel_11_2);
		
		JPanel panel_12 = new JPanel();
		hotelPromotionPanel.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		hotelPromotionPanel.add(panel_13);
		panel_13.setLayout(new GridLayout(1, 4, 0, 0));
		
		JPanel panel_13_1 = new JPanel();
		panel_13.add(panel_13_1);
		
		JLabel businessDiscountLabel = new JLabel("��ҵ�����ͻ��ۿۣ�");
		businessDiscountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(businessDiscountLabel);
		
		businessDiscountTextField = new JTextField();
		panel_13.add(businessDiscountTextField);
		businessDiscountTextField.setColumns(10);
		
		JPanel panel_13_2 = new JPanel();
		panel_13.add(panel_13_2);
		
		JPanel panel_14 = new JPanel();
		hotelPromotionPanel.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		hotelPromotionPanel.add(panel_15);
		
		submitButton = new JButton("ȷ��");
		panel_15.add(submitButton);
		submitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				//ϵͳ��ӾƵ�Ӫ������
			}
			
		});
		
		JPanel panel_16 = new JPanel();
		hotelPromotionPanel.add(panel_16);
	}

}
