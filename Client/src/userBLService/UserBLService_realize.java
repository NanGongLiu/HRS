package userBLService;

import java.rmi.RemoteException;

import VO.CreditRecordVO;
import VO.UserVO;
import common.ResultMessage;
import common.UserType;

public class UserBLService_realize implements UserBLService {
	/**
	 * ���ݿͻ�ID���ҿͻ���Ϣ������
	 * @param  in MessageInput�ͣ���������Ŀͻ�ID
	 * @return ����ResultMessage������ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage findByID(String userID) {
		return null;
	}
	/**
	 * ���¿ͻ���Ϣ
	 * @param in MessageInput�ͣ���������ĸ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage update(UserVO vo) {
		return null;
	}
	/**
	 * �����ͻ���Ϣ
	 * @param in MessageInput�ͣ����������������Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage add(UserVO vo) {
		return null;
	}
	/**
	 * ɾ���ͻ���Ϣ
	 * @param in MessageInput�ͣ�����ѡ��ɾ������Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage delete(UserVO vo) {
		return null;
	}
	/**
	 * ��ʾ����ֵ
	 * @param in MessageInput�ͣ����������û�ID
	 * @return String�ͣ����ؿͻ�������ֵ
	 * @see bussinesslogic.User
	 */
		public long showCredit(String userID) {
		return 0;
	}
	/**
	 * ͨ����ֵ��������ֵ
	 * @param in MessageInput�ͣ���������ĸ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage updateCredit(UserVO vo,long credit) {
		return null;
	}
	/**
	 * ���»�Ա�ȼ�
	 * @param in MessageInput�ͣ���������ĸ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage updateLevel(UserVO vo) {
		return null;
	}
	/**
	 * �������ü�¼��������ֵ
	 * @param in MessageInput�ͣ���������ĸ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage updateCreditRecord(UserVO vo) {
		return null;
	}
	/**
	 * �ͻ�ע��
	 * @param in MessageInput�ͣ����������ע����Ϣ
	 * @return ����ResultMessage������ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage register(UserVO vo) {
		return null;
	}
	/**
	 * ά���ͻ���Ϣ
	 * @param in MessageInput�ͣ���������ĸ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage maintainPeersonalInfo(UserVO vo) {
		return null;
	}
	/**
	 * ���ü�¼��ʾ
	 * @param in MessageInput�ͣ�����ѡ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public CreditRecordVO showCreditRecord(UserVO vo) {
		return null;
	}
	/**
	 * ����֧���ɹ�������ø���
	 * @param in MessageInput�ͣ����������֧����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage topUp(long money) {
		return null;
	}
	/**
	 * ����δ֧�����
	 * @param in MessageInput�ͣ����������֧����Ϣ
	 * @return ����ResultMessage������ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage payment(long money) {
		return null;
	}
	/**
	 * �ͻ���¼
	 * @param in MessageInput�ͣ���������ĸ�����Ϣ
	 * @return ����UserType������ö��ֵ
	 * @see bussinesslogic.User
	 */
		public UserType login(String ID, String password)throws RemoteException {
		return null;
	}
	/**
	 * �ͻ��ǳ�
	 * @param in MessageInput�ͣ�����ѡ�����Ϣ
	 * @return ����ResultMessage��һ��ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage logout(String ID) {
		return null;
	}
	/**
	 * ���˺Ų��ҿͻ�
	 */
	@Override
	public UserVO findByAccount(String acc) {
		// TODO Auto-generated method stub
		return null;
	}

}
