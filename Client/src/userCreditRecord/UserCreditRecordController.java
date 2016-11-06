package userCreditRecord;
import java.rmi.RemoteException;

import VO.CreditRecordVO;
import VO.UserVO;
import common.ResultMessage;
import common.UserType;
import userBLService.UserBLService_realize;

public class UserCreditRecordController extends UserBLService_realize{
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
		 * ��ʾ����ֵ
		 * @param in MessageInput�ͣ����������û�ID
		 * @return String�ͣ����ؿͻ�������ֵ
		 * @see bussinesslogic.User
		 */
			public long showCredit(String userID) {
			return 200;
		}
			/**
			 * ���ü�¼��ʾ
			 * @param in MessageInput�ͣ�����ѡ�����Ϣ
			 * @return ����ResultMessage��һ��ö��ֵ
			 * @see bussinesslogic.User
			 */
				public CreditRecordVO showCreditRecord(UserVO vo) {
				CreditRecordVO cr=new CreditRecordVO("1@nju.edu.cn","2016/2/2 12/4/6","4728",0,50,3000);
				return cr;
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
