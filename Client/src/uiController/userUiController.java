package uiController;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import uiService.userUiService;

/**
 * ����ʵ�־Ƶ����ϵͳ�Ŀͻ�����Ŀ�����
 * @author ����٩
 * @version 1.0
 * @see uiService.userUiService
 * @see javax.swing.JFrame
 * @see java.awt.event.WindowAdapter;
 * @see java.awt.event.WindowEvent;
 * 
 */

public class userUiController extends JFrame implements userUiService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * �ͻ��ĳ�ʼ����
     * 
     * @param 
     * @return 
     */
	public void init() {
		this.setLocation(400, 300);
		this.setSize(300, 200);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}

}

