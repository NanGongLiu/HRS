package roomData;

import java.rmi.RemoteException;

import PO.RoomPO;
import roomDataService.RoomDataService;

public class RoomDataServiceMySqlImpl_Stub implements RoomDataService{

	@Override
	public RoomPO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Find Succeed!");
		RoomPO po=new RoomPO("321","��Ԥ��","��ͳ�׷�",6,3000);
		return po;
	}

	@Override
	public void insert(RoomPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!");
	}

	@Override
	public void delete(RoomPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeed!");
	}

	@Override
	public void update(RoomPO po) throws RemoteException {
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
