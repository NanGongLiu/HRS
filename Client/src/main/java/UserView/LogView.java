package UserView;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import UserView.MemberRegisterView;
import common.UserType;
import runner.ClientRunner;
import uiController.MemberRegisterUiController;
import uiController.customerMainViewControllerImpl;
import uiService.LoginViewControllerService;
import uiService.MemberRegisterUiService;
import uiService.customerMainViewControllerService;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;

public class LogView extends JPanel {
	private JPasswordField passwordField;
	private JTextField textField;
	private LoginViewControllerService controller;
    public JLabel admin;
    public JLabel password;
    public JButton login;
    public JButton register;
    public JButton find;
    private JComboBox<String> comboBox_1;
    private String type;
    private JPanel panel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    private JPanel k;
    
    /**
	 * Create the panel.
	 */
	public LogView(LoginViewControllerService controller) {
		this.controller=controller;
		setLayout(new BorderLayout(0, 0));
		k=this;
		panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
		panel.add(panel1);
		
		panel4 = new JPanel();
		panel1.add(panel4);
		label=new JLabel();
		label.setPreferredSize(new Dimension(70,250));
		panel4.add(label);
		panel5 = new JPanel();
		panel1.add(panel5);
		
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(panel2);
		panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(panel3);
		init_optionpannel();
		init_loginpannel();	
	}
	public void init_optionpannel(){
	}
	public void init_loginpannel(){
		
		List<String> list=new ArrayList<String>();
		comboBox_1=new JComboBox<String>();
		comboBox_1.setPreferredSize(new Dimension(100,20));
		list.add("客户");
		list.add("酒店营销人员");
		list.add("网站营销人员");
		list.add("网站管理人员");
		for (String str : list) {
			comboBox_1.addItem(str);
		}
		comboBox_1.setToolTipText("");
		comboBox_1.setFont(UIManager.getFont("Button.font"));
		
		panel5.add(comboBox_1);
		label3=new JLabel();
		label3.setPreferredSize(new Dimension(150,10));
		panel5.add(label3);
		
		admin = new JLabel("\u8D26\u53F7\u540D \uFF1A");
		admin.setForeground(new Color(0, 0, 0));
		admin.setFont(UIManager.getFont("Button.font"));
		panel2.add(admin);
		textField = new JTextField();
		textField.setFont(UIManager.getFont("Button.font"));
		textField.setColumns(15);
		panel2.add(textField);
		register = new JButton("\u6CE8\u518C\u8D26\u53F7");
        
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.register();
			}
		});
		register.setFont(UIManager.getFont("Button.font"));
		panel2.add(register);
		password = new JLabel("\u5BC6\u7801 \uFF1A");
		panel3.add(password);
		passwordField = new JPasswordField(15);

		passwordField.setFont(UIManager.getFont("Button.font"));
		panel3.add(passwordField);
		login = new JButton("\u767B\u5F55");

		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type=(String)comboBox_1.getSelectedItem();
				if(textField.getText().equals("")){					
					JOptionPane.showMessageDialog(k, "账号密码输入有误！","", JOptionPane.ERROR_MESSAGE);
					return;
				}
				controller.login(textField.getText(),String.valueOf(passwordField.getPassword()));
			}
		});
		panel3.add(login);
		label2=new JLabel();
		label2.setPreferredSize(new Dimension(10000,250));
		panel3.add(label2);
	}
	public void login(UserType type){
		if(this.type.equals("客户")){
		   customerMainViewControllerService con =  new customerMainViewControllerImpl(login.getText());
		   customerMainView vie = new customerMainView(con);
		   con.setView(vie);
		   ClientRunner.change(vie);
		}
		else if(this.type.equals("网站营销人员")){
		}
		else if(this.type.equals("酒店营销人员")){
	    }
		else {
			
	    }
	}
	public void register(){
		MemberRegisterUiService con=new MemberRegisterUiController();
		MemberRegisterView vie=new MemberRegisterView(con);
		con.setView(vie);
		ClientRunner.change(vie);
	}
}
