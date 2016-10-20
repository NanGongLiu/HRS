package dataService;
import PO.*;
import dataService.DataService;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**����ʵ��Ӫ���������ݴ�������Ҫ�ķ���ӿ�
 * @author ��ΰ
 * @version 1.0
 * see presentation.Promotion
 */
public interface PromotionDataService  extends DataService,Remote{
	/**
	 * ��ID���в��ҷ�����Ӧ��PromotionPO���
	 * @param in MessageInput�ͣ���������Ŀͻ�ID
	 * @return ����ResultMessageö�ٵ�һ��
	 * @see data.Promotion
	 */
		public PromotionPO find(String id) throws RemoteException;
	/**
	 * �����ݿ�������һ��po��¼
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.Promotion
	 */
		public void insert(PromotionPO po) throws RemoteException;
	/**
	 * �����ݿ���ɾ��һ��po
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.Promotion
	 */
		public void delete(PromotionPO po) throws RemoteException;
	/**
	 *�����ݿ��и���һ��po
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.Promotion
	 */
		public void update(PromotionPO po) throws RemoteException;
	/**
	 * ����ʼ���־û����ݿ�
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.Promotion
	 */
		public void init() throws RemoteException;
	/**
	 * �����־û����ݿ��ʹ��
	 * @param in MessageInput�ͣ������ѡ��
	 * @return 
	 * @see data.Promotion
	 */
		public void finish() throws RemoteException;
	}

