package VO;

import java.util.Calendar;

import Object.User;

/**
 * �û������Լ����ݴ��������
 * @author ����٩
 * @version 1.0
 * @see Object.User
 */

public class UserVO extends VO {

	public String username;
	public String useraccount;
	public String contactway;
	public String id;
	public boolean inorout;
	public int level;
	public long credit;
	public String membertype;
	public int type;//1���ͻ� 2���Ƶ깤����Ա 3����վӪ����Ա 4����վ������Ա
	public Calendar birthday;
	public String enterprise;
	public UserVO(){
	}
	public UserVO(String usern,String usera,String con,String ID,boolean io,int le,long cr,String mt,int t,Calendar birth,String enter){
		username=usern;
		useraccount=usera;
		contactway=con;
		id=ID;
		inorout=io;
		level=le;
		credit=cr;
		membertype=mt;
		type=t;
		birthday=birth;
		enterprise=enter;
	}
	/**
     * �����û���Ϣ
     * 
     * @param user UserVO�ͣ�һ�������������ݵ��û�����
     * @return 
     * @see VO.UserVO
     */
	public void update(UserVO user) {
		username=user.username;
		enterprise=user.enterprise;
		birthday=user.birthday;
		membertype=user.membertype;
		contactway=user.contactway;
		credit=user.credit;
		inorout=user.inorout;
		level=user.level;
	}
	
	/**
     * �����û�����
     * 
     * @return һ����ע����û�
     * @see Object.User
     */
	public User makeUser() {
		
		return new User();
	}
	
}
