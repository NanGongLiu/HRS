package datafactory;

import java.io.Serializable;
import java.rmi.RemoteException;

import dataService.DataService;
import hotelData.HotelDataServiceMySqlImpl_Stub;
/**
 * ְ�����ṩ��ͬ��������ݽӿ�
 * @author LZ
 * @version 1.0
 * @see datafactoryService.DataFactoryService
 */
public class DataFactoryMySqlImpl implements Serializable,dataService.DataFactoryService{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * �ṩ�ͻ����ݽӿ�
	 * @param
	 * @return ����DataService
	 * @throws RemoteException
	 * @see dataService.DataService
	 */
	@Override
	public DataService getUserData() throws RemoteException{
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * �ṩ���ü�¼���ݽӿ�
	 * @param
	 * @return ����DataService
	 * @throws RemoteException
	 * @see dataService.DataService
	 */
	@Override
	public DataService getCreditRecordData()  throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * �ṩ�����������ݽӿ�
	 * @param
	 * @return ����DataService
	 * @throws RemoteException
	 * @see dataService.DataService
	 */
	@Override
	public DataService getPromotionData() throws RemoteException  {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * �ṩ�������ݽӿ�
	 * @param
	 * @return ����DataService
	 * @throws RemoteException
	 * @see dataService.DataService
	 */
	@Override
	public DataService getOrderData()  throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * �ṩ�Ƶ����ݽӿ�
	 * @param
	 * @return ����DataService
	 * @throws RemoteException
	 * @see dataService.DataService
	 */
	
	@Override
	public DataService getHotelData() throws RemoteException  {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * �ṩ�������ݽӿ�
	 * @param
	 * @return ����DataService
	 * @throws RemoteException
	 * @see dataService.DataService
	 */
	@Override
	public DataService getRoomData() throws RemoteException  {
		// TODO Auto-generated method stub
		return null;
	}

}
