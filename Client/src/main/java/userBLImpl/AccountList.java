package userBLImpl;

import java.util.HashMap;

import VO.UserVO;
/**
 * �˻����������𷵻��ض����͵��˻��б�
 * @author LZ
 * @version 1.0
 * @see VO.UserVO
 */
public interface AccountList {
	/**
	 * �����ض����͵��˻��б�
	 * @param type int�ͣ��߼��㴫�����˻�����
	 * @return �������ڴ����͵��˻��б�
	 * @see VO.UserVO
	 */
	public HashMap<String,UserVO> getAccountList(int type);
}
