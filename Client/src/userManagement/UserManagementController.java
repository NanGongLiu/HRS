package userManagement;

import java.rmi.RemoteException;
import VO.UserVO;
import common.ResultMessage;
import common.UserType;
import userBLService.UserBLService_realize;
public class UserManagementController extends UserBLService_realize{
	/**
	 * ���ݿͻ�ID���ҿͻ���Ϣ������
	 * @param  in MessageInput�ͣ���������Ŀͻ�ID
	 * @return ����ResultMessage������ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage findByID(String userID) {
		return ResultMessage.Exist;
	}
	/**
	 * ���¿ͻ���Ϣ
	 * @param in MessageInput�ͣ���������ĸ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage update(UserVO vo) {
		return ResultMessage.Exist;
	}
		/**
		 * �����ͻ���Ϣ
		 * @param in MessageInput�ͣ����������������Ϣ
		 * @return ����ResultMessage��һ��ö��ֵ
		 * @see bussinesslogic.User
		 */
			public ResultMessage add(UserVO vo) {
			return ResultMessage.Exist;
		}
		/**
		 * ɾ���ͻ���Ϣ
		 * @param in MessageInput�ͣ�����ѡ��ɾ������Ϣ
		 * @return ����ResultMessage��һ��ö��ֵ
		 * @see bussinesslogic.User
		 */
			public ResultMessage delete(UserVO vo) {
			return ResultMessage.Exist;
		}
		/**
		 * �ͻ���¼
		 * @param in MessageInput�ͣ���������ĸ�����Ϣ
		 * @return ����UserType������ö��ֵ
		 * @see bussinesslogic.User
		 */
			public UserType login(String ID, String password)throws RemoteException {
			return UserType.Customer;
		}
		/**
		 * �ͻ��ǳ�
		 * @param in MessageInput�ͣ�����ѡ�����Ϣ
		 * @return ����ResultMessage��һ��ö��ֵ
		 * @see bussinesslogic.User
		 */
			public ResultMessage logout(String ID) {
			return ResultMessage.Exist;
		}

}
