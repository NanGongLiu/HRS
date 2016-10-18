package PO;

import java.io.Serializable;
/**
 * ���ü�¼������ʵ��
 * @author LZ
 * @version 1.0
 * @see
 */
public class CreditRecordPO  extends PO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String time;
	private int action;
	private long creditchange;
	private long currentcredit;
	/**
	 * �������ü�¼ʵ��
	 * 
	 * @param t String�ͣ��߼��㴫�������ü�¼ʱ��
	 * @param act int�ͣ��߼��㴫���Ķ���
	 * @param ch long�ͣ��߼��㴫�������ñ仯
	 * @param cu long�ͣ��߼��㴫���ĵ�ǰ����ֵ
	 * 
	 */
	public CreditRecordPO(String t,int act,long ch,long cu){
		time=t;
		action=act;
		creditchange=ch;
		currentcredit=cu;
	}
	/**
	 * ��ȡʱ��
	 * @param
	 * @return �������ü�¼ʱ��
	 * @throws
	 * @see
	 */
	public String getTime(){
		return time;
	}
	/**
	 * �������ü�¼ʱ��
	 * @param t String�ͣ��߼��㴫����ʱ��
	 * @return
	 * @throws
	 * @see
	 */
	public void setTime(String t){
		time=t;
	}
	/**
	 * ��ȡ��Ϊ
	 * @param
	 * @return action int��
	 * @throws ������Ϊ
	 * @see
	 */
	public int getAction(){
		return action;
	}
	/**
	 * �������ü�¼����Ϊ
	 * @param act int�ͣ��߼��㴫������Ϊ
	 * @return
	 * @throws
	 * @see
	 */
	public void setAction(int act){
		action=act;
	}
	/**
	 * ��ȡ����ֵ�仯
	 * @param
	 * @return �������ñ仯
	 * @throws
	 * @see
	 */
	public long getCreditchange(){
		return creditchange;
	}
	/**
	 * �������ü�¼������ֵ�仯
	 * @param ch long�ͣ��߼��㴫���������ñ仯ֵ
	 * @return
	 * @throws
	 * @see
	 */
	public void setCreditchange(long ch){
		creditchange=ch;
	}
	/**
	 * ��ȡ��ǰ����ֵ
	 * @param
	 * @return ���ص�ǰ����ֵ
	 * @throws
	 * @see
	 */
	public long getCurrentcredit(){
		return currentcredit;
	}
	/**
	 * �������ü�¼�ĵ�ǰ����ֵ
	 * @param cu long�ͣ��߼��㴫���ĵ�ǰ����ֵ
	 * @return
	 * @throws
	 * @see
	 */
	public void setCurrentcredit(long cu){
		currentcredit=cu;
	}

}
