package VO;

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
	public int level;
	public String type;
	public String birthday;
	public String enterprise;

	/**
     * �����û���Ϣ
     * 
     * @param user User�ͣ�һ�������������ݵ��û�����
     * @return 
     * @see Object.User
     */
	public void update(User user) {
		
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
