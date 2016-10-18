package PO;

import java.io.Serializable;
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
	private String type;
	private String birthday;
	private String enterprise;
	/**
	 * ����ͻ�����ʵ��
	 * @param un String�ͣ��߼��㴫���Ŀͻ�����
	 * @param ua String�ͣ��߼��㴫���Ŀͻ��˺�
	 * @param co String�ͣ��߼��㴫���Ŀͻ���ϵ��ʽ
	 * @param l int�ͣ��߼��㴫���Ŀͻ���Ա�ȼ�
	 * @param t String�ͣ��߼��㴫���Ŀͻ�����
	 * @param b String�ͣ��߼��㴫���Ŀͻ�����
	 * @param e String�ͣ��߼��㴫���Ŀͻ�������ҵ
	 * @return 
	 * @throws
	 * @see
	 */
	public UserPO(String un,String ua,String co,int l,String t,String b,String e){
		username=un;
		useraccount=ua;
		contactway=co;
		level=l;
		type=t;
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
	 * ��ȡ�ͻ�����
	 * @param
	 * @return ���ؿͻ�����
	 * @throws
	 * @see
	 */
	public String getType(){
		return type;
	}
	/**
	 * ���ÿͻ�����
	 * @param t String �ͣ��߼��㴫���Ŀͻ�����
	 * @return
	 * @throws
	 * @see
	 */
	public void setType(String t){
		type=t;
	}
	/**
	 * ��ȡ�ͻ�����
	 * @param
	 * @return ���ؿͻ�����
	 * @throws
	 * @see
	 */
	public String getBirthday(){
		return birthday;
	}
	/**
	 * ���ÿͻ�����
	 * @param b String�ͣ��߼��㴫���Ŀͻ�����
	 * @return 
	 * @throws
	 * @see
	 */
	public void setBirthday(String b){
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
