package dataService;

import java.rmi.Remote;
import java.rmi.RemoteException;

import dataService.DataService;
/**
 * ְ���Ƕ����ṩ���ݽӿڵĽӿ�
 * @author LZ
 * @version 2.0
 * @see
 */
public interface DataFactoryService extends Remote{
	/**
	 * �����ṩ���ݵĽӿ�
	 * @param
	 * @return
	 * @throws
	 * @see dataService.DataService
	 */
	public DataService getDataService(String type) throws RemoteException ;
}
