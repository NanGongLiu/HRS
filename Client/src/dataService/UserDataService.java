package dataService;
import PO.*;
import dataService.DataService;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**����ʵ�ֿͻ����ݴ�������Ҫ�ķ���ӿ�
 * @author ��ΰ
 * @version 1.0
 * see presentation.User
 */
public interface UserDataService  extends DataService,Remote{
	/**
	 * ��ID���в��ҷ�����Ӧ��UserPO���
	 * @param in MessageInput�ͣ���������Ŀͻ�ID
	 * @return ����ResultMessageö�ٵ�һ��
	 * @see data.User
	 */
		public UserPO find(String id) throws RemoteException;
	/**
	 * �����ݿ�������һ��po��¼
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.User
	 */
		public void insert(UserPO po) throws RemoteException;
	/**
	 * �����ݿ���ɾ��һ��po
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.User
	 */
		public void delete(UserPO po) throws RemoteException;
	/**
	 *�����ݿ��и���һ��po
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.User
	 */
		public void update(UserPO po) throws RemoteException;
	/**
	 * ����ʼ���־û����ݿ�
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.User
	 */
		public void init() throws RemoteException;
	/**
	 * �����־û����ݿ��ʹ��
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.User
	 */
		public void finish() throws RemoteException;
	}

