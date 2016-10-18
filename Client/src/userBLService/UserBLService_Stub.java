package userBLService;

import java.rmi.RemoteException;

import VO.CreditRecordVO;
import VO.UserVO;
import common.ResultMessage;
import common.UserType;

/**
 * ����ʵ���û������������Ҫ��׮����
 * @author ��ΰ
 * @version 1.0
 * @see presentation.User
 */
public class UserBLService_Stub implements UserBLService{
	public String username;
	public String useraccount;
	public String contactway;
	public int level;
	public String type;
	public String birthday;
	public String enterprise;
    public UserBLService_Stub(String uname,String uaccount,String contact,int lev,String typ,String birth,
    		String enter){
    	username=uname;
    	useraccount=uaccount;
    	contactway=contact;
    	level=lev;
    	type=typ;
    	birthday=birth;
    	enterprise=enter;
    }
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
			return new CreditRecordVO();
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
