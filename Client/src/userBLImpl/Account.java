package userBLImpl;

import java.rmi.RemoteException;
import java.util.HashMap;

import PO.UserPO;
import VO.UserVO;
import dataService.DataFactoryService;
import dataService.UserDataService;
import rmi.RemoteHelper;
/**
 * ��������˻��Ĳ���
 * @author LZ
 * @version 1.0
 * @see VO.UserVO
 */
public class Account{
	private AccountList al;
	private DataFactoryService df;
	private HashMap<String,UserVO> map;
	private int type;
	public Account(int i){
		al=new AccountFactory();
		map=al.getAccountList(i);
		df=RemoteHelper.getInstance().getDataFactoryService();
		type=i;
	}
	/**
	 * ��ȡ���д��˺ŵĿͻ�����Ϣ
	 * @param account String�ͣ�����㴫�����˻����
	 * @return ���س��д��˺ŵ��û���Ϣ
	 * @see VO.UserVO
	 */
	public UserVO getUser(String account){
		if(map.get(account) != null){
			return map.get(account);
		}
		else{
			return null;
		}
	}
	/**
	 * �����˻���Ϣ
	 * @param vo UserVO�ͣ�����㴫����VO����
	 * @throws RemoteException
	 * @see VO.UserVO
	 */
	public void update(UserVO vo) throws RemoteException{
		if(type==vo.type){
			if(map.get(vo.useraccount) != null){
				map.get(vo.useraccount).update(vo);
				UserPO userpo=new UserPO(vo.username,vo.useraccount,vo.contactway,vo.level,vo.membertype,vo.type,vo.birthday,vo.enterprise);
				UserDataService dh=(UserDataService) df.getDataService("User");
				dh.update(userpo);
			}
		}
	}
	/**
	 * ɾ��ĳ���˻�
	 * @param vo UserVO�ͣ�����㴫����VO����
	 * @throws RemoteException
	 * @see VO.UserVO
	 */
	public void delete(UserVO vo) throws RemoteException{
		if(type==vo.type){
			if(map.get(vo.useraccount) != null){
				map.remove(vo.useraccount);
				UserPO userpo=new UserPO(vo.username,vo.useraccount,vo.contactway,vo.level,vo.membertype,vo.type,vo.birthday,vo.enterprise);
				UserDataService dh=(UserDataService) df.getDataService("User");
				dh.delete(userpo);
			}
		}
	}
	/**
	 * ����һ���˻�
	 * @param vo UserVO�ͣ�����㴫����VO����
	 * @throws RemoteException
	 * @see VO.UserVO
	 */
	public void add(UserVO vo) throws RemoteException{
		if(type==vo.type){
			if(map.get(vo.useraccount)==null){
				map.put(vo.useraccount, vo);
				UserPO userpo=new UserPO(vo.username,vo.useraccount,vo.contactway,vo.level,vo.membertype,vo.type,vo.birthday,vo.enterprise);
				UserDataService dh=(UserDataService) df.getDataService("User");
				dh.insert(userpo);
			}
		}
	}
}
