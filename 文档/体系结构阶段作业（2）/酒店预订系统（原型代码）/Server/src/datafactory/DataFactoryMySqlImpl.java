package datafactory;

import java.rmi.RemoteException;

import dataService.DataService;
import datafactoryService.DataFactoryService;
/**
 * ְ�����ṩ��ͬ��������ݽӿ�
 * @author LZ
 * @version 1.0
 * @see datafactoryService.DataFactoryService
 */
public class DataFactoryMySqlImpl implements DataFactoryService{
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
