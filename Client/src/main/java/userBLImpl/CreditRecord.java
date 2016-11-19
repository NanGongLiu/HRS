package userBLImpl;

import java.rmi.RemoteException;
import java.util.HashMap;

import PO.CreditRecordPO;
import VO.CreditRecordVO;
import dataService.CreditRecordDataService;
import dataService.DataFactoryService;
import rmi.RemoteHelper;
/**
 * ����������ü�¼�Ĳ���
 * @author LZ
 *@version 1.0
 *@see VO.CreditRecordVO
 */
public class CreditRecord {
	private HashMap<String,HashMap<String,CreditRecordVO>> map;
	private DataFactoryService df;
	public CreditRecord(){
		map=new HashMap<String,HashMap<String,CreditRecordVO>>();
		df=RemoteHelper.getInstance().getDataFactoryService();
	}
	/**
	 * ��ʾ���ü�¼
	 * @param id String�ͣ�����㴫���Ŀͻ�ID
	 * @return �������ڴ�ID���������ü�¼
	 * @see VO.CreditRecordVO
	 */
	public HashMap<String,CreditRecordVO> showCreditRecord(String id){
		return map.get(id);
	}
	/**
	 * �������ü�¼
	 * @param id String�ͣ�����㴫�����û�ID
	 * @param vo CreditRecordVO�ͣ�����㴫����VO����
	 * @throws RemoteException
	 * @see VO.CreditRecordVO
	 */
	public void updateCreditRecord(String id,CreditRecordVO vo) throws RemoteException{
		map.get(id).get(vo.orderID).account=vo.account;
		map.get(id).get(vo.orderID).action=vo.action;
		map.get(id).get(vo.orderID).creditchange=vo.creditchange;
		map.get(id).get(vo.orderID).currentcredit=vo.currentcredit;
		map.get(id).get(vo.orderID).time=vo.time;
		CreditRecordPO po=new CreditRecordPO(vo.orderID,vo.time,vo.action,vo.creditchange,vo.currentcredit);
		//CreditRecordDataService dh=(CreditRecordDataService) df.getDataService("CreditRecord");
		//dh.update(po);
	}
	/**
	 * �������ü�¼
	 * @param userID String�ͣ�����㴫���Ŀͻ�ID
	 * @param vo CreditRecordVO�ͣ�����㴫����vo����
	 * @throws RemoteException
	 * @see VO.CreditRecordVO
	 */
	public void add(String userID,CreditRecordVO vo) throws RemoteException{
		if(map.containsKey(userID)){
			map.get(userID).put(vo.orderID, vo);
			CreditRecordPO po=new CreditRecordPO(vo.orderID,vo.time,vo.action,vo.creditchange,vo.currentcredit);
			//CreditRecordDataService dh=(CreditRecordDataService) df.getDataService("CreditRecord");
			//dh.insert(po);
		}
		else{
			HashMap<String,CreditRecordVO> m=new HashMap<String,CreditRecordVO>();
			m.put(vo.orderID, vo);
			map.put(userID, m);
		}
	}
	/**
	 * ��ȡĳλ�ͻ���ĳ�����ü�¼
	 * @param userID String�ͣ�����㴫���Ŀͻ�ID
	 * @param orderID String�ͣ�����㴫���ļ�¼���
	 * @return �������ڴ˿ͻ�ID�ͼ�¼��ŵ�VO����
	 * @see VO.CreditRecordVO
	 */
	public CreditRecordVO getCreditRecord(String userID,String orderID){
		return map.get(userID).get(orderID);
	}
}
