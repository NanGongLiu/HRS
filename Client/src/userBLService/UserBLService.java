package userBLService;
import java.rmi.RemoteException;
import VO.*;
import common.*;
/**
 * ����ʵ���û������������Ҫ�ķ���ӿ�
 * @author ��ΰ
 * @version 1.0
 * @see presentation.User
 */
public interface UserBLService {
/**
 * ���ݿͻ�ID���ҿͻ���Ϣ������
 * @param  in MessageInput�ͣ���������Ŀͻ�ID
 * @return ����ResultMessage������ö��ֵ
 * @see bussinesslogic.User
 */
	public ResultMessage findByID(String userID);
/**
 * ���¿ͻ���Ϣ
 * @param in MessageInput�ͣ���������ĸ�����Ϣ
 * @return ����ResultMessage��һ��ö��ֵ
 * @see bussinesslogic.User
 */
	public ResultMessage update(UserVO vo);
/**
 * �����ͻ���Ϣ
 * @param in MessageInput�ͣ����������������Ϣ
 * @return ����ResultMessage��һ��ö��ֵ
 * @see bussinesslogic.User
 */
	public ResultMessage add(UserVO vo);
/**
 * ɾ���ͻ���Ϣ
 * @param in MessageInput�ͣ�����ѡ��ɾ������Ϣ
 * @return ����ResultMessage��һ��ö��ֵ
 * @see bussinesslogic.User
 */
	public ResultMessage delete(UserVO vo);
/**
 * ��ʾ����ֵ
 * @param in MessageInput�ͣ����������û�ID
 * @return String�ͣ����ؿͻ�������ֵ
 * @see bussinesslogic.User
 */
	public long showCredit(String userID);
/**
 * ͨ����ֵ��������ֵ
 * @param in MessageInput�ͣ���������ĸ�����Ϣ
 * @return ����ResultMessage��һ��ö��ֵ
 * @see bussinesslogic.User
 */
	public ResultMessage updateCredit(UserVO vo,long credit);
/**
 * ���»�Ա�ȼ�
 * @param in MessageInput�ͣ���������ĸ�����Ϣ
 * @return ����ResultMessage��һ��ö��ֵ
 * @see bussinesslogic.User
 */
	public ResultMessage updateLevel(UserVO vo);
/**
 * �������ü�¼��������ֵ
 * @param in MessageInput�ͣ���������ĸ�����Ϣ
 * @return ����ResultMessage��һ��ö��ֵ
 * @see bussinesslogic.User
 */
	public ResultMessage updateCreditRecord(UserVO vo);
/**
 * �ͻ�ע��
 * @param in MessageInput�ͣ����������ע����Ϣ
 * @return ����ResultMessage������ö��ֵ
 * @see bussinesslogic.User
 */
	public ResultMessage register(UserVO vo);
/**
 * ά���ͻ���Ϣ
 * @param in MessageInput�ͣ���������ĸ�����Ϣ
 * @return ����ResultMessage��һ��ö��ֵ
 * @see bussinesslogic.User
 */
	public ResultMessage maintainPeersonalInfo(UserVO vo);
/**
 * ���ü�¼��ʾ
 * @param in MessageInput�ͣ�����ѡ�����Ϣ
 * @return ����ResultMessage��һ��ö��ֵ
 * @see bussinesslogic.User
 */
	public CreditRecordVO showCreditRecord(UserVO vo);
/**
 * ����֧���ɹ�������ø���
 * @param in MessageInput�ͣ����������֧����Ϣ
 * @return ����ResultMessage��һ��ö��ֵ
 * @see bussinesslogic.User
 */
	public ResultMessage topUp(long money);
/**
 * ����δ֧�����
 * @param in MessageInput�ͣ����������֧����Ϣ
 * @return ����ResultMessage������ö��ֵ
 * @see bussinesslogic.User
 */
	public ResultMessage payment(long money);
/**
 * �ͻ���¼
 * @param in MessageInput�ͣ���������ĸ�����Ϣ
 * @return ����UserType������ö��ֵ
 * @see bussinesslogic.User
 */
	public UserType login(String ID, String password)throws RemoteException;
/**
 * �ͻ��ǳ�
 * @param in MessageInput�ͣ�����ѡ�����Ϣ
 * @return ����ResultMessage��һ��ö��ֵ
 * @see bussinesslogic.User
 */
	public ResultMessage logout(String ID);
	
    public UserVO findByAccount(String acc);
}
