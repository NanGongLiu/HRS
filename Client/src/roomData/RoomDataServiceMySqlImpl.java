package roomData;

import java.io.Serializable;
import java.rmi.RemoteException;

import PO.RoomPO;
/**
 * ְ���ǽ��߼����淢��������ת������̨RoomData����
 * @author LZ
 * @version 1.0
 * @see businesslogic.Room
 */
public class RoomDataServiceMySqlImpl implements Serializable,dataService.RoomDataService{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ��ID���в��ҷ�����Ӧ��RoomPO���
	 * @param
	 * @return
	 * @throws RemoteException
	 * @see PO.RoomPO
	 */
	@Override
	public RoomPO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * �����ݿ�������һ��poʵ��
	 * @param po RoomPO�ͣ��߼��㴫����POʵ��
	 * @return
	 * @throws RemoteException
	 * @see PO.RoomPO
	 */
	@Override
	public void insert(RoomPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����ݿ���ɾ��һ��po
	 * @param po RoomPO�ͣ��߼��㴫����POʵ��
	 * @return
	 * @throws RemoteException
	 * @see PO.RoomPO
	 */
	@Override
	public void delete(RoomPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����ݿ��и���һ��po
	 * @param po RoomPO�ͣ��߼��㴫����POʵ��
	 * @return
	 * @throws RemoteException
	 * @see PO.RoomPO
	 */
	@Override
	public void update(RoomPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * ����ʼ���־û����ݿ�
	 * @param
	 * @return
	 * @throws RemoteException
	 * @see PO.RoomPO
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
	 * @see PO.RoomPO
	 */
	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
