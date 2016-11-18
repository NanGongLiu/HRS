package WebPromotionView;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import uiService.webPromotionUserUiService;

public class WebPromotionUserView extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private webPromotionUserUiService controller;
	private JButton proStrategy;
	private JButton abnormalOrder;
	private JButton creditManage;
	private JButton memberLevel;
	private JButton exit;
	public WebPromotionUserView(webPromotionUserUiService controller){
		this.controller=controller;
		this.setLayout(new BoxLayout(this,BoxLayout.LINE_AXIS));
		initButton();
		this.validate();
	}
	private void initButton(){
		proStrategy=new JButton("�ƶ�Ӫ������");
		proStrategy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.toWebPromotionStrategyView();
			}
		});
		abnormalOrder=new JButton("�����쳣����");
		abnormalOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.toProcessOrderOrderView();
			}
		});
		creditManage=new JButton("��������ֵ");
		creditManage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.toCreditManagementView();
			}
		});
		memberLevel=new JButton("�ƶ���Ա�ȼ�");
		memberLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.toMemberLevelSystemView();
			}
		});
		exit=new JButton("�˳�");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.toLogView();
			}
		});
		JPanel panel = new JPanel();	
		JToolBar toolBar = new JToolBar(JToolBar.VERTICAL);
		panel.add(toolBar);
	    toolBar.setLayout(new GridLayout(1,5));
	    toolBar.add(proStrategy);
	    toolBar.add(abnormalOrder);
	    toolBar.add(creditManage);
	    toolBar.add(memberLevel);
	    toolBar.add(exit);
		this.add(panel);
	}
}
