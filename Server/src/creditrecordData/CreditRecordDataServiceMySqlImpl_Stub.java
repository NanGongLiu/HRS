package creditrecordData;

import java.rmi.RemoteException;

import PO.CreditRecordPO;
import creditrecordDataService.CreditRecordDataService;

public class CreditRecordDataServiceMySqlImpl_Stub implements CreditRecordDataService{
	@Override
	public CreditRecordPO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Find Succeed!");
		CreditRecordPO po=new CreditRecordPO("2016/10/15 14/03",1,16,80);
		return po;
	}

	@Override
	public void insert(CreditRecordPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!");
	}

	@Override
	public void delete(CreditRecordPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeed!");
	}

	@Override
	public void update(CreditRecordPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!");
	}

	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Init Succeed!");
	}

	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("finish Succeed!");
	}

}