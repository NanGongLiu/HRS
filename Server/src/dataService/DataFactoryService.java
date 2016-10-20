package dataService;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dataService.DataService;
/**
 * ְ���Ƕ����ṩ���ݽӿڵĽӿ�
 * @author LZ
 * @version 1.0
 * @see
 */
public interface DataFactoryService extends Remote{
	/**
	 * �����ṩ�ͻ����ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getUserData() throws RemoteException ;
	/**
	 * �����ṩ���ü�¼���ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getCreditRecordData() throws RemoteException ;
	/**
	 * �����ṩ�����������ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getPromotionData() throws RemoteException ;
	/**
	 * �����ṩ�������ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getOrderData() throws RemoteException ;
	/**
	 * �����ṩ�Ƶ����ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getHotelData() throws RemoteException ;
	/**
	 * �����ṩ�������ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getRoomData() throws RemoteException ;
}
