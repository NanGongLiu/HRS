package PO;

import java.io.Serializable;
import java.util.Calendar;
/**
 * �ͻ�������ʵ��
 * @author LZ
 * @version 1.0
 * @see
 */
public class UserPO extends PO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String username;
	private String useraccount;
	private String contactway;
	private int level;
	private String membertype;
	private int type;
	private Calendar birthday;
	private String enterprise;
	/**
	 * ����ͻ�����ʵ��
	 * @param un String�ͣ��߼��㴫���Ŀͻ�����
	 * @param ua String�ͣ��߼��㴫���Ŀͻ��˺�
	 * @param co String�ͣ��߼��㴫���Ŀͻ���ϵ��ʽ
	 * @param l int�ͣ��߼��㴫���Ŀͻ���Ա�ȼ�
	 * @param mt String�ͣ��߼��㴫���Ŀͻ���Ա����
	 * @param t int�ͣ��߼��㴫�����û�����
	 * @param b String�ͣ��߼��㴫���Ŀͻ�����
	 * @param e String�ͣ��߼��㴫���Ŀͻ�������ҵ
	 * @return 
	 * @throws
	 * @see
	 */
	public UserPO(String un,String ua,String co,int l,String mt,int t,Calendar b,String e){
		username=un;
		useraccount=ua;
		contactway=co;
		level=l;
		type=t;
		membertype=mt;
		birthday=b;
		enterprise=e;
	}
	/**
	 * ��ȡ�ͻ�����
	 * @param
	 * @return ���ؿͻ�����
	 * @throws
	 * @see
	 */
	public String getName(){
		return username;
	}
	/**
	 * ���ÿͻ�����
	 * @param un String�ͣ��߼��㴫���Ŀͻ�����
	 * @return
	 * @throws
	 * @see
	 */
	public void setName(String un){
		username=un;
	}
	/**
	 * ��ȡ�ͻ��˺�
	 * @param
	 * @retur ���ؿͻ��˺�
	 * @throws
	 * @see
	 */
	public String getAccount(){
		return useraccount;
	}
	/**
	 * ���ÿͻ��˺�
	 * @param ua String�ͣ��߼��㴫���Ŀͻ��˺�
	 * @return
	 * @throws
	 * @see
	 */
	public void setAccount(String ua){
		useraccount=ua;
	}
	/**
	 * ��ȡ�ͻ���ϵ��ʽ
	 * @param
	 * @return ���ؿͻ���ϵ��ʽ
	 * @throws
	 * @see
	 */
	public String getContact(){
		return contactway;
	}
	/**
	 * ���ÿͻ���ϵ��ʽ
	 * @param co String�ͣ��߼��㴫���Ŀͻ���ϵ��ʽ
	 * @return 
	 * @throws
	 * @see
	 */
	public void setContact(String co){
		contactway=co;
	}
	/**
	 * ��ȡ�ͻ���Ա�ȼ�
	 * @param
	 * @return ���ؿͻ���Ա�ȼ�
	 * @throws
	 * @see
	 */
	public int getLevel(){
		return level;
	}
	/**
	 * ���ÿͻ���Ա�ȼ�
	 * @param l int�ͣ��߼��㴫���Ŀͻ���Ա�ȼ�
	 * @return 
	 * @throws
	 * @see
	 */
	public void setLevel(int l){
		level=l;
	}
	/**
	 * ��ȡ�ͻ���Ա����
	 * @param
	 * @return ���ؿͻ���Ա����
	 * @throws
	 * @see
	 */
	public String getMemberType(){
		return membertype;
	}
	/**
	 * ���ÿͻ���Ա����
	 * @param t String �ͣ��߼��㴫���Ŀͻ���Ա����
	 * @return
	 * @throws
	 * @see
	 */
	public void setMemberType(String t){
		membertype=t;
	}
	/**
	 * ��ȡ�û�����
	 * @param
	 * @return �����û�����
	 * @throws
	 * @see
	 */
	public int getType(){
		return type;
	}
	/**
	 * �����û�����
	 * @param t String �ͣ��߼��㴫�����û�����
	 * @return
	 * @throws
	 * @see
	 */
	public void setType(int t){
		type=t;
	}
	/**
	 * ��ȡ�ͻ�����
	 * @param
	 * @return ���ؿͻ�����
	 * @throws
	 * @see
	 */
	public Calendar getBirthday(){
		return birthday;
	}
	/**
	 * ���ÿͻ�����
	 * @param b String�ͣ��߼��㴫���Ŀͻ�����
	 * @return 
	 * @throws
	 * @see
	 */
	public void setBirthday(Calendar b){
		birthday=b;
	}
	/**
	 * ��ȡ�ͻ�������ҵ
	 * @param
	 * @return ������ҵ����
	 * @throws
	 * @see
	 */
	public String getEnterprise(){
		return enterprise;
	}
	/**
	 * ���ÿͻ�������ҵ����
	 * @param e String�ͣ��߼��㴫���Ŀͻ�������ҵ����
	 * @return
	 * @throws
	 * @see
	 */
	public void setEnterprise(String e){
		enterprise=e;
	}

	
}
