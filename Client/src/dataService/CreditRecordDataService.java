package dataService;
import PO.*;
import dataService.DataService;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**����ʵ�����ü�¼���ݴ�������Ҫ�ķ���ӿ�
 * @author ��ΰ
 * @version 1.0
 * see presentation.CreditRecord
 */
public interface CreditRecordDataService extends DataService, Remote{
/**
 * ��ID���в��ҷ�����Ӧ��CreditRecordPO���
 * @param in MessageInput�ͣ���������Ŀͻ�ID
 * @return ����ResultMessageö�ٵ�һ��
 * @see data.CreditRecord
 */
	public CreditRecordPO find(String id) throws RemoteException;
/**
 * �����ݿ�������һ��po��¼
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.CreditRecord
 */
	public void insert(CreditRecordPO po) throws RemoteException;
/**
 * �����ݿ���ɾ��һ��po
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.CreditRecord
 */
	public void delete(CreditRecordPO po) throws RemoteException;
/**
 *�����ݿ��и���һ��po
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.CreditRecord
 */
	public void update(CreditRecordPO po) throws RemoteException;
/**
 * ����ʼ���־û����ݿ�
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.CreditRecord
 */
	public void init() throws RemoteException;
/**
 * �����־û����ݿ��ʹ��
 * @param in MessageInput�ͣ������ѡ��
 * @return 
 * @see data.CreditRecord
 */
	public void finish() throws RemoteException;
}
