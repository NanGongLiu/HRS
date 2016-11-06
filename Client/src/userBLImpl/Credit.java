package userBLImpl;

import java.rmi.RemoteException;
import java.util.HashMap;

import VO.CreditRecordVO;
/**
 * �����������ֵ�Ĳ���
 * @author LZ
 * @version 1.0
 * @see VO.CreditRecordVO
 */
public class Credit {
	private HashMap<String,Long> map;
	CreditRecord cr=new CreditRecord();
	public Credit(){
		map=new HashMap<String,Long>();
	}
	/**
	 * ��ʾ����ֵ
	 * @param id String�ͣ�����㴫���Ŀͻ�ID
	 * @return �������ڴ�ID������ֵ
	 */
	public long showCredit(String id){
		return map.get(id);
	}
	/**
	 * ��������ֵ
	 * @param userID String�ͣ�����㴫���Ŀͻ�ID
	 * @param vo CreditRecordVO�ͣ�����㴫����VO����
	 * @throws RemoteException
	 * @see VO.CreditRecordVO
	 */
	public void updateCredit(String userID,CreditRecordVO vo) throws RemoteException{
		map.put(userID, vo.currentcredit);
		cr.add(userID, vo);
	}
}
