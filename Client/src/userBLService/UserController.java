package userBLService;

import java.rmi.RemoteException;

import VO.CreditRecordVO;
import VO.UserVO;
import common.ResultMessage;
import common.UserType;

public class UserController implements UserBLService {
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
	 * �����ͻ���Ϣ
	 * @param in MessageInput�ͣ����������������Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage add(UserVO vo){
			return ResultMessage.Exist;
		}
	/**
	 * ɾ���ͻ���Ϣ
	 * @param in MessageInput�ͣ�����ѡ��ɾ������Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage delete(UserVO vo){
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
	 * ͨ����ֵ��������ֵ
	 * @param in MessageInput�ͣ���������ĸ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage updateCredit(UserVO vo,long credit){
			return ResultMessage.Exist;
		}
	/**
	 * ���»�Ա�ȼ�
	 * @param in MessageInput�ͣ���������ĸ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage updateLevel(UserVO vo){
			return ResultMessage.Exist;
		}
	/**
	 * �������ü�¼��������ֵ
	 * @param in MessageInput�ͣ���������ĸ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage updateCreditRecord(UserVO vo){
			return ResultMessage.Exist;
		}
	/**
	 * �ͻ�ע��
	 * @param in MessageInput�ͣ����������ע����Ϣ
	 * @return ����ResultMessage������ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage register(UserVO vo){
			return ResultMessage.Exist;
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
	 * ���ü�¼��ʾ
	 * @param in MessageInput�ͣ�����ѡ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public CreditRecordVO showCreditRecord(UserVO vo){
			return new CreditRecordVO("1@nju.edu.cn","2016/2/2 12/4/6","4728",0,50,3000);
		}
	/**
	 * ����֧���ɹ�������ø���
	 * @param in MessageInput�ͣ����������֧����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage topUp(long money){
			return ResultMessage.Exist;
		}
	/**
	 * ����δ֧�����
	 * @param in MessageInput�ͣ����������֧����Ϣ
	 * @return ����ResultMessage������ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage payment(long money){
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
