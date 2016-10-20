package dataService;
import PO.*;
import dataService.DataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**����ʵ�ֶ������ݴ�������Ҫ�ķ���ӿ�
 * @author ��ΰ
 * @version 1.0
 * see presentation.Order
 */
public interface OrderDataService  extends DataService, Remote{
/**
 * ��ID���в��ҷ�����Ӧ��OrderPO���
 * @param in MessageInput�ͣ���������Ķ�������
 * @return ����ResultMessageö�ٵ�һ��
 * @see data.Order
 */
		public OrderPO find(String id) throws RemoteException;
/**
 * �����ͽ��в��ҷ�����Ӧ��OrderPO���
 * @param in MessageInput�ͣ���������Ŀͻ�ID
 * @return ����ResultMessageö�ٵ�һ��
 * @see data.Order
*/	
		public ArrayList<OrderPO> findByType(String type)throws RemoteException;
/**
 * �����ݿ�������һ��po��¼
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.Order
 */
		public void insert(OrderPO po) throws RemoteException;
/**
 * �����ݿ���ɾ��һ��po
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.Order
 */
		public void delete(OrderPO po) throws RemoteException;
/**
 *�����ݿ��и���һ��po
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.Order
 */
		public void update(OrderPO po) throws RemoteException;
/**
 * ����ʼ���־û����ݿ�
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.Order
 */
		public void init() throws RemoteException;
/**
 * �����־û����ݿ��ʹ��
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.Order
 */
		public void finish() throws RemoteException;
	}

