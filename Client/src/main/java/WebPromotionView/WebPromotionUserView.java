package webPromotionView;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import uiService.webPromotionUserUiService;
import vo.OrderVO;
/**
 * 网站营销人员主界面
 * @author LZ
 *
 */
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
	private JTable orderTable;
	private DefaultTableModel orderListModel;
	public WebPromotionUserView(webPromotionUserUiService controller){
		this.controller=controller;
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		initButton();
		initDate();
		initOrderListTable();
		this.validate();
	}
	//初始化按钮
	private void initButton(){
		proStrategy=new JButton("制定营销策略");
		proStrategy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.toWebPromotionStrategyView();
			}
		});
		abnormalOrder=new JButton("处理异常申诉");
		abnormalOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.toProcessOrderOrderView();
			}
		});
		creditManage=new JButton("管理信用值");
		creditManage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.toCreditManagementView();
			}
		});
		memberLevel=new JButton("制定会员等级");
		memberLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.toMemberLevelSystemView();
			}
		});
		exit=new JButton("退出");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.toLogView();
			}
		});
		JPanel panel = new JPanel();	
		JToolBar toolBar = new JToolBar(JToolBar.VERTICAL);//JToolBar.VERTICAL
		panel.add(toolBar);
	    toolBar.setLayout(new FlowLayout(FlowLayout.CENTER));
	    toolBar.add(proStrategy);
	    toolBar.add(abnormalOrder);
	    toolBar.add(creditManage);
	    toolBar.add(memberLevel);
	    toolBar.add(exit);
		this.add(panel);
	}
	private void initDate(){
		JPanel p=new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label=new JLabel("未执行订单");
		p.add(label);
		JPanel q=new JPanel();
		q.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel yearLabel=new JLabel("年：");
		JTextField year=new JTextField(10);
		JLabel monthLabel=new JLabel("月：");
		JTextField month=new JTextField(10);
		JLabel dayLabel=new JLabel("日：");
		JTextField day=new JTextField(10);
		JButton search=new JButton("查找");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String mstr=month.getText();
				String dstr=day.getText();
				int m=Integer.parseInt(mstr);
				if(m<10&&mstr.charAt(0)!='0'){
					mstr="0"+mstr;
				}
				int d=Integer.parseInt(dstr);
				if(d<10&&dstr.charAt(0)!='0'){
					dstr="0"+dstr;
				}
				String date=year.getText()+"/"+mstr+"/"+dstr;
				controller.getUnfinishedOrders(date);
				orderListModel.setRowCount(0);
				List<OrderVO> list=controller.getUnfinishedOrders(date);
				if(!list.isEmpty()){
					for (OrderVO orderVo : list) {
						orderListModel.addRow(orderVo);
					}
				}
			}
		});
		q.add(yearLabel);
		q.add(year);
		q.add(monthLabel);
		q.add(month);
		q.add(dayLabel);
		q.add(day);
		q.add(search);
		this.add(p);
		this.add(q);
	}
	/**
     * 构造订单列表的表格
     */
	private void initOrderListTable() {
		JScrollPane scrollPane = new JScrollPane();
		
		//表头
		Vector<String> vColumns = new Vector<String>();
		vColumns.add("订单编号");
		vColumns.add("订单详情");
		vColumns.add("用户信息");
		vColumns.add("预计入住时间");
		vColumns.add("订单最晚执行时间");
		vColumns.add("订单状态");
		vColumns.add("订单价值");
	
		//数据
		Vector<OrderVO> vData = new Vector<OrderVO>();
		Calendar cal=Calendar.getInstance();  
		int month=cal.get(Calendar.MONTH)+1;
		String mstr=month+"";
		if(month<10){
			mstr="0"+mstr;
		}
		int day=cal.get(Calendar.DATE);
		String dstr=day+"";
		if(day<10){
			dstr="0"+day;
		}
		String date=cal.get(Calendar.YEAR)+"/"+mstr+"/"+dstr;
		vData.addAll(controller.getUnfinishedOrders(date));
		//模型
		orderListModel = new DefaultTableModel(vData, vColumns);
		//表格
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
}
