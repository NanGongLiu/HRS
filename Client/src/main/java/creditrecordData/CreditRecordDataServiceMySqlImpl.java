package creditrecordData;

import java.io.Serializable;
import java.rmi.RemoteException;

import PO.CreditRecordPO;
/**
 * ְ���ǽ��߼����淢��������ת������̨CreditRecordData����
 * @author LZ
 * @version 1.0
 * @see businesslogic.CreditRecord
 */
public class CreditRecordDataServiceMySqlImpl implements Serializable,dataService.CreditRecordDataService{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ��ID���в��ҷ�����Ӧ��CreditRecordPO���
	 * @param id String�ͣ��߼��㴫�������ü�¼���
	 * @return �����ҵ���POʵ��
	 * @throws Զ�̵���ʧ��
	 * @see PO.CreditRecordPO
	 */
	@Override
	public CreditRecordPO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * �����ݿ�������һ��poʵ��
	 * @param po CreditRecordPO�ͣ��߼��㴫�������ü�¼ʵ��
	 * @return
	 * @throws Զ�̵���ʧ�� 
	 * @see PO.CreditRecordPO
	 */
	@Override
	public void insert(CreditRecordPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����ݿ���ɾ��һ��po
	 * @param po CreditRecordPO�ͣ��߼��㴫�������ü�¼ʵ��
	 * @return
	 * @throws Զ�̵���ʧ��
	 * @see PO.CreditRecordPO
	 */
	@Override
	public void delete(CreditRecordPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����ݿ��и���һ��po
	 * @param po CreditRecordPO�ͣ��߼��㴫�������ü�¼ʵ��
	 * @return
	 * @throws Զ�̵���ʧ��
	 * @see PO.CreditRecordPO
	 */
	@Override
	public void update(CreditRecordPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * ����ʼ���־û����ݿ�
	 * @param
	 * @return
	 * @throws Զ�̵���ʧ��
	 * @see PO.CreditRecordPO
	 */
	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����־û����ݿ��ʹ��
	 * @param
	 * @return
	 * @throws Զ�̵���ʧ��
	 * @see PO.CreditRecordPO
	 */
	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
