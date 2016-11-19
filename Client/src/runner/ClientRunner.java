package runner;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import CreditView.CreditView;
import CreditView.CreditViewControllerImpl;
import CreditView.CreditViewControllerService;
import LoginView.LoginView;
import LoginView.LoginViewControllerImpl;
import LoginView.LoginViewControllerService;
import MemberRegisterView.MemberRegisterView;
import UserView.HotelBrowseView;
import UserView.HotelSearchView;
import UserView.OrderBuildView;
import VO.UserVO;
import WebAdminView.AddHotelView;
import WebAdminView.UserManagementView;
import WebAdminView.WebAdminUserView;
import rmi.RemoteHelper;
import uiController.HotelSearchUiController;
import uiController.MemberRegisterUiController;
import uiController.webAdminUserUiController;
import uiService.HotelSearchUiService;
import uiService.MemberRegisterUiService;
import uiService.webAdminUserUiService;
import userBLImpl.User;


public class ClientRunner implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RemoteHelper remoteHelper;
	static JFrame mFrame;
	public ClientRunner() throws RemoteException {
		linkToServer();
		initGUI();
	}
	
	private void linkToServer() {
		try {
			remoteHelper = RemoteHelper.getInstance();
			remoteHelper.setRemote(Naming.lookup("rmi://localhost:7777/DataRemoteObject"));
			System.out.println("linked");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
	
	private void initGUI() throws RemoteException {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	mFrame = new JFrame("HRS");
       	 	mFrame.setSize(1000, 700);
        	mFrame.setLocation(10, 10);
        	LoginViewControllerService controller =  new LoginViewControllerImpl();
    		LoginView view = new LoginView(controller);
    		controller.setView(view);
    		CreditViewControllerService con=new CreditViewControllerImpl("123");
    		CreditView vie=new CreditView(con);
    		con.setView(vie);
    		mFrame.getContentPane().add(view);
        	mFrame.setVisible(true);
		/*
		DataFactoryService df=RemoteHelper.getInstance().getDataFactoryService();
		HotelDataService dh=(HotelDataService) df.getDataService("Hotel");
		ArrayList<HotelPO> a=new ArrayList<HotelPO>();
		HotelPO po=dh.find("423523");
		a=dh.findByDistrict("����");
		po=dh.findByName("xxx");
		a=dh.findByScore(4);
		a=dh.findByStar(2);
		dh.insert(po);
		dh.update(po);
		dh.delete(po);
		dh.init();
		dh.finish();
		*/mFrame = new JFrame("Fuck");
		mFrame.setSize(1000, 700);
		mFrame.setLocation(10, 10);
		HotelSearchUiService con=new HotelSearchUiController();
		HotelSearchView view=new HotelSearchView(con);
		con.setView(view);
		mFrame.getContentPane().add(view);
		mFrame.setVisible(true);
	}
	public static void change(JPanel view){
		mFrame.getContentPane().removeAll();
		mFrame.getContentPane().add(view);
		mFrame.setVisible(true);
		if(view instanceof WebAdminUserView) {
        mFrame.setTitle("��վ������Ա������");
		}
		else if(view instanceof UserManagementView) {
	    mFrame.setTitle("�û�����");
		}
		else if(view instanceof AddHotelView) {
	    mFrame.setTitle("��ӾƵ�");
		}
		else if(view instanceof MemberRegisterView) {
		mFrame.setTitle("��Աע��");
		}
		else if(view instanceof HotelSearchView) {
		mFrame.setTitle("�Ƶ�����");
		}
		else if(view instanceof HotelBrowseView) {
		mFrame.setTitle("�Ƶ����");
		}
		else if(view instanceof OrderBuildView) {
		mFrame.setTitle("���ɶ���");
		}
	
		
	}

	
	public static void main(String[] args){
		try {
			ClientRunner cr = new ClientRunner();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
