package promotionData;

import java.rmi.RemoteException;

import PO.PromotionPO;
import promotionDataService.PromotionDataService;
/**
 * ְ���ǽ��߼����淢��������ת������̨PromotionData����
 * @author LZ
 * @version 1.0
 * @see businesslogic.Promotion
 */
public class PromotionDataServiceMySqlImpl implements PromotionDataService{
	/**
	 * ��ID���в��ҷ�����Ӧ��PromotionPO���
	 * @param id String �ͣ��߼��㴫���Ĳ��Ա��
	 * @return �����ҵ���POʵ��
	 * @throws RemoteException
	 * @see PO.PromotionPO
	 */
	@Override
	public PromotionPO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * �����ݿ�������һ��poʵ��
	 * @param po PromotionPO�ͣ��߼��㴫����POʵ��
	 * @return
	 * @throws RemoteException
	 * @see PO.PromotionPO
	 */
	@Override
	public void insert(PromotionPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����ݿ���ɾ��һ��po
	 * @param po PromotionPO�ͣ��߼��㴫����POʵ��
	 * @return
	 * @throws RemoteException
	 * @see PO.PromotionPO
	 */
	@Override
	public void delete(PromotionPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����ݿ��и���һ��po
	 * @param po PromotionPO�ͣ��߼��㴫����POʵ��
	 * @return
	 * @throws RemoteException
	 * @see PO.PromotionPO
	 */
	@Override
	public void update(PromotionPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * ����ʼ���־û����ݿ�
	 * @param
	 * @return
	 * @throws RemoteException
	 * @see PO.PromotionPO
	 */
	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����־û����ݿ��ʹ��
	 * @param
	 * @return
	 * @throws RemoteException
	 * @see PO.PromotionPO
	 */
	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
