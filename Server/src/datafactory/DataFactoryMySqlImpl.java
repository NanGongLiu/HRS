package datafactory;

import java.io.Serializable;
import java.rmi.RemoteException;

import dataService.DataService;
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
	 * �ṩ���ݽӿ�
	 * @param
	 * @return ����DataService
	 * @throws RemoteException
	 * @see dataService.DataService
	 */
	@Override
	public DataService getDataService(String type) throws RemoteException{
		// TODO Auto-generated method stub
		return null;
	}
}
