package userInformationMaintenance;

import java.rmi.RemoteException;

import VO.UserVO;
import common.ResultMessage;
import common.UserType;
import userBLService.UserBLService_realize;

public class UserInformationMaintenanceController extends UserBLService_realize{
	/**
	 * ���ݿͻ�ID���ҿͻ���Ϣ������
	 * @param  in MessageInput�ͣ���������Ŀͻ�ID
	 * @return ����ResultMessage������ö��ֵ
	 * @see bussinesslogic.User
	 */
	public ResultMessage findByID(String userID){
			return ResultMessage.Exist;
	}
	/**
	 * ���¿ͻ���Ϣ
	 * @param in MessageInput�ͣ���������ĸ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
	public ResultMessage update(UserVO vo){
			return ResultMessage.Exist;
	}
	/**
	 * ��ʾ����ֵ
	 * @param in MessageInput�ͣ����������û�ID
	 * @return String�ͣ����ؿͻ�������ֵ
	 * @see bussinesslogic.User
	 */
	public long showCredit(String userID){
				return 200;
	}
	/**
	 * ά���ͻ���Ϣ
	 * @param in MessageInput�ͣ���������ĸ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage maintainPeersonalInfo(UserVO vo){
			return ResultMessage.Exist;
		}
		/**
		 * �ͻ���¼
		 * @param in MessageInput�ͣ���������ĸ�����Ϣ
		 * @return ����UserType������ö��ֵ
		 * @see bussinesslogic.User
		 */
			public UserType login(String ID, String password)throws RemoteException{
				return UserType.Customer;
			}
		/**
		 * �ͻ��ǳ�
		 * @param in MessageInput�ͣ�����ѡ�����Ϣ
		 * @return ����ResultMessage��һ��ö��ֵ
		 * @see bussinesslogic.User
		 */
			public ResultMessage logout(String ID){
				return ResultMessage.Exist;
			}
		
}