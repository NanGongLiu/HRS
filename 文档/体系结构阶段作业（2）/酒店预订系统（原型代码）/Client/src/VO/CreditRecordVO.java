package VO;
import Object.CreditRecord;
/**
 * ���ü�¼�����Լ����ݴ��������
 * @author ����٩
 * @version 1.0
 * @see Object.CreditRecord
 */

public class CreditRecordVO extends VO {

	public String account;
	public String time;
	public String orderID;
	public int action;
	public long creditchange;
	public long currentcredit;

	/**
     * �������ü�¼��Ϣ
     * 
     * @param creRco CreditRecord�ͣ�һ�������������ݵ����ü�¼����
     * @return 
     * @see Object.CreditRecord
     */
	public void update(CreditRecord creRco) {
		
	}
	
	/**
     * �������ü�¼����
     * 
     * @return һ�����û������ü�¼
     * @see Object.CreditRecord
     */
	public CreditRecord makeCreditRecord() {
		
		return new CreditRecord();
	}
	
}

