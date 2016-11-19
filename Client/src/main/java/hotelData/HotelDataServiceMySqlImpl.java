package hotelData;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.HotelPO;
/**
 * ְ���ǽ��߼����淢��������ת������̨HotelData����
 * @author LZ
 * @version 1.0
 * @see businesslogic.Hotel
 */
public class HotelDataServiceMySqlImpl implements Serializable,dataService.HotelDataService{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ��ID���в��ҷ�����Ӧ��HotelPO���
	 * @param id String�ͣ��߼��㴫���ľƵ��˺�
	 * @return �����ҵ���POʵ��
	 * @throws RemoteException
	 * @see PO.HotelPO
	 */
	@Override
	public HotelPO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * �����ݿ�������һ��poʵ��
	 * @param po HotelPO�ͣ��߼��㴫����POʵ��
	 * @return 
	 * @throws RemoteException
	 * @see PO.HotelPO
	 */
	@Override
	public void insert(HotelPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����ݿ���ɾ��һ��po
	 * @param po HotelPO�ͣ��߼��㴫����POʵ��
	 * @return
	 * @throws RemoteException
	 * @see PO.HotelPO
	 */
	@Override
	public void delete(HotelPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����ݿ��и���һ��po
	 * @param po HotelPO�ͣ��߼��㴫����POʵ��
	 * @return
	 * @throws RemoteException
	 * @see PO.HotelPO
	 */
	@Override
	public void update(HotelPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * ����ʼ���־û����ݿ�
	 * @param
	 * @return
	 * @throws RemoteException
	 * @see PO.HotelPO
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
	 * @see PO.HotelPO
	 */
	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * �����ƽ��в��ҷ�����Ӧ��HotelPO���
	 * @param name String�ͣ��߼��㴫���ľƵ�����
	 * @return �����ҵ���POʵ��
	 * @throws RemoteException
	 * @see PO.HotelPO
	 */
	@Override
	public HotelPO findByName(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * ����Ȧ���в��ҷ�����Ӧ��HotelPO���
	 * @param district String �ͣ��߼��㴫���ľƵ���Ȧ
	 * @return �����ҵ���PO�б�
	 * @throws RemoteException
	 * @see PO.HotelPO
	 */
	@Override
	public ArrayList<HotelPO> findByDistrict(String district) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * ���Ǽ����в��ҷ�����Ӧ��HotelPO���
	 * @param star int�ͣ��߼��㴫���ľƵ��Ǽ�
	 * @return �����ҵ���PO�б�
	 * @throws RemoteException
	 * @see PO.HotelPO
	 */
	@Override
	public ArrayList<HotelPO> findByStar(int star) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 
	 * @param
	 * @return
	 * @throws RemoteException
	 * @see PO.HotelPO
	 */
	@Override
	public ArrayList<HotelPO> findByScore(double sco) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}
