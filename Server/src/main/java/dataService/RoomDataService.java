package dataService;
import PO.*;
import dataService.DataService;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**����ʵ�ַ������ݴ�������Ҫ�ķ���ӿ�
 * @author ��ΰ
 * @version 1.0
 * see presentation.Room
 */
public interface RoomDataService  extends DataService,Remote{
	/**
	 * ��ID���в��ҷ�����Ӧ��RoomPO���
	 * @param in MessageInput�ͣ���������Ŀͻ�ID
	 * @return ����ResultMessageö�ٵ�һ��
	 * @see data.Room
	 */
		public RoomPO find(String id) throws RemoteException;
	/**
	 * �����ݿ�������һ��po��¼
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.Room
	 */
		public void insert(RoomPO po) throws RemoteException;
	/**
	 * �����ݿ���ɾ��һ��po
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.Room
	 */
		public void delete(RoomPO po) throws RemoteException;
	/**
	 *�����ݿ��и���һ��po
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.Room
	 */
		public void update(RoomPO po) throws RemoteException;
	/**
	 * ����ʼ���־û����ݿ�
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.Room
	 */
		public void init() throws RemoteException;
	/**
	 * �����־û����ݿ��ʹ��
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.Room
	 */
		public void finish() throws RemoteException;
	}
