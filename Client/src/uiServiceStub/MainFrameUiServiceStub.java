package uiServiceStub;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import uiService.MainFrameUiService;

/**
 * ����ʵ�־Ƶ����ϵͳ������¼����Ŀ�����
 * @author ����٩
 * @version 1.0
 * @see uiService.MainFrameUiService
 * @see javax.swing.JFrame
 * @see java.awt.event.WindowAdapter;
 * @see java.awt.event.WindowEvent;
 * 
 */
public class MainFrameUiServiceStub extends JFrame implements MainFrameUiService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * �򿪳����������
     * 
     * @param args0  �����ʱ�Ĳ���
     * @return 
     */
	public void init(String[] args0) {
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

