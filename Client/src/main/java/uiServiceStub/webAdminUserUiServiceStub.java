package uiServiceStub;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import WebAdminView.WebAdminUserView;
import WebPromotionView.WebPromotionUserView;
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
	
	@Override
	public void toAddHotelView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toUserManagementView() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void toLogView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setView(WebAdminUserView view) {
		// TODO Auto-generated method stub
		
	}

}

