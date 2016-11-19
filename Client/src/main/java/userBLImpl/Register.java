package userBLImpl;

import java.rmi.RemoteException;

import VO.UserVO;
/**
 * ������ע����ص�����
 * @author LZ
 * @version 1.0
 * @see VO.UserVO
 */
public class Register {
	private User user;
	public Register(){
		user=new User();
	}
	/**
	 * ����һλ�û�
	 * @param vo ����㴫����VO����
	 * @throws RemoteException
	 * @see VO.UserVO
	 */
	public void add(UserVO vo) throws RemoteException{
		user.create(vo);
	}
	/**
	 * ��ȡ�û���Ϣ
	 * @param id ����㴫�����û�ID
	 * @return �������ڴ�ID���û���Ϣ
	 * @see VO.UserVO
	 */
	public UserVO getUser(String id){
		if(user.findByID(id) != null){
			return user.findByID(id);
		}
		else{
			return null;
		}
	}
}
