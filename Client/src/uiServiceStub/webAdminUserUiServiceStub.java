package uiServiceStub;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import uiService.webAdminUserUiService;

/**
 * ����ʵ�־Ƶ����ϵͳ����վ������Ա�Ľ���Ŀ�����
 * @author ����٩
 * @version 1.0
 * @see uiService.webAdminUserUiService
 * @see javax.swing.JFrame
 * @see java.awt.event.WindowAdapter;
 * @see java.awt.event.WindowEvent;
 * 
 */
public class webAdminUserUiServiceStub extends JFrame implements webAdminUserUiService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * ��վ������Ա�ĳ�ʼ����
     * 
     * @param 
     * @return 
     */
	public void init() {
		this.setLocation(400, 300);
		this.setSize(300, 300);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
}

