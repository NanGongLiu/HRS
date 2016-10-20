package uiController;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import uiService.hotelUserUiService;

/**
 * ����ʵ�־Ƶ����ϵͳ�ľƵ깤����Ա����Ŀ�����
 * @author ����٩
 * @version 1.0
 * @see uiService.hotelUserUiService
 * @see javax.swing.JFrame
 * @see java.awt.event.WindowAdapter;
 * @see java.awt.event.WindowEvent;
 * 
 */
public class hotelUserUiController extends JFrame implements hotelUserUiService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * �Ƶ깤����Ա�ĳ�ʼ����
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

