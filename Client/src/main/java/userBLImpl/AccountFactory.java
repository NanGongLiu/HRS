package userBLImpl;

import java.util.HashMap;

import VO.UserVO;
/**
 * ����AccountList�ӿڵ�ʵ��
 * @author LZ
 * @version 1.0
 * @see VO.UserVO
 */
public class AccountFactory implements AccountList{
	private HashMap<String,UserVO> customer;
	private HashMap<String,UserVO> hotelworker;
	private HashMap<String,UserVO> webpromotionworker;
	private HashMap<String,UserVO> webmanagehotelworker;
	public AccountFactory(){
		customer=new HashMap<String,UserVO>();
		hotelworker=new HashMap<String,UserVO>();
		webpromotionworker=new HashMap<String,UserVO>();
		webmanagehotelworker=new HashMap<String,UserVO>();
	}
	/**
	 * �����ض����͵��˻��б�
	 * @param type int�ͣ��߼��㴫�����˻�����
	 * @return �������ڴ����͵��˻��б�
	 * @see VO.UserVO
	 */
	@Override
	public HashMap<String, UserVO> getAccountList(int type) {
		// TODO Auto-generated method stub
		if(type==1){
			return customer;
		}
		else if(type==2){
			return hotelworker;
		}
		else if(type==3){
			return webpromotionworker;
		}
		else if(type==4){
			return webmanagehotelworker;
		}
		else{
			return null;
		}
	}
	
}
