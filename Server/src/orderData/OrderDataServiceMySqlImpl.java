package orderData;

import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.OrderPO;
import orderDataService.OrderDataService;
/**
 * ְ���ǽ��߼����淢��������ת������̨OrderData����
 * @author LZ
 * @version 1.0
 * @see businesslogic.Order
 */
public class OrderDataServiceMySqlImpl implements OrderDataService{
	/**
	 * ��ID���в��ҷ�����Ӧ��OrderPO���
	 * @param id String�ͣ��߼��㴫���Ķ������
	 * @return �����ҵ���POʵ��
	 * @throws RemoteException
	 * @see PO.OrderPO
	 */
	@Override
	public OrderPO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * �����ݿ�������һ��poʵ��
	 * @param po OrderPO�ͣ��߼��㴫����POʵ��
	 * @return
	 * @throws RemoteException
	 * @see PO.OrderPO
	 */
	@Override
	public void insert(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����ݿ���ɾ��һ��po
	 * @param po OrderPO�ͣ��߼��㴫����POʵ��
	 * @return
	 * @throws RemoteException
	 * @see PO.OrderPO
	 */
	@Override
	public void delete(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����ݿ��и���һ��po
	 * @param po OrderPO�ͣ��߼��㴫����POʵ��
	 * @return 
	 * @throws RemoteException
	 * @see PO.OrderPO
	 */
	@Override
	public void update(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * ����ʼ���־û����ݿ�
	 * @param
	 * @return
	 * @throws RemoteException
	 * @see PO.OrderPO
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
	 * @see PO.OrderPO
	 */
	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����ͽ��в��ҷ�����Ӧ��OrderPO���
	 * @param type String�ͣ��߼��㴫���Ķ�������
	 * @return �����ҵ���POʵ���б�
	 * @throws RemoteException
	 * @see PO.OrderPO
	 */
	@Override
	public ArrayList<OrderPO> findByType(String type) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
