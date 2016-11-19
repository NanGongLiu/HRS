package PO;

import java.io.Serializable;
import java.sql.Time;
/**
 * ����������ʵ��
 * @author LZ
 * @version 1.0
 * @see
 */
public class OrderPO extends PO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String orderNumber;
	private int orderState;
	private int orderValue;
	private int numOfPerson;
	private boolean child;
	private String roomType;
	private int roomNumber;
	private Time expectedCheckIn;
	private Time expectedCheckOut;
	private Time latest;
	private String comment;
	private int score;	
	/**
	 * ���충������ʵ��
	 * @param oNum String�ͣ��߼��㴫���Ķ������
	 * @param state int�ͣ��߼��㴫���Ķ���״̬
	 * @param value int�ͣ��߼��㴫���Ķ�����ֵ
	 * @param pnum int�ͣ��߼��㴫��������
	 * @param ch boolean�ͣ��߼��㴫�������޶�ͯ
	 * @param rType String�ͣ��߼��㴫���ķ�������
	 * @param rNum int�ͣ��߼��㴫���Ķ�������
	 * @param in Time�ͣ��߼��㴫����Ԥ����סʱ��
	 * @param out Time�ͣ��߼��㴫����Ԥ���뿪ʱ��
	 * @param la Time�ͣ��߼��㴫��������ִ��ʱ��
	 * @param comm String�ͣ��߼��㴫���Ķ�������
	 * @param sco int�ͣ��߼��㴫���Ķ�������
	 * @return
	 * @throws
	 * @see
	 */
	public OrderPO (String oNum, int state, int value, int pnum,boolean ch,String rType, int rNum, Time in, Time out,Time la, String comm, int sco) {
		
		orderNumber = oNum;
		orderState = state;
		orderValue = value;
		numOfPerson=pnum;
		child=ch;
		roomType = rType;
		roomNumber = rNum;
		expectedCheckIn = in;
		expectedCheckOut = out;
		latest=la;
		comment = comm;
		score = sco;

	}
	/**
	 * ��ȡ�������
	 * @param
	 * @return ���ض������
	 * @throws
	 * @see
	 */
	public String getOrderNumber() {
		return orderNumber;
	}
	/**
	 * ��ȡ����״̬
	 * @param
	 * @return ���ض���״̬
	 * @throws
	 * @see
	 */
	public int getOrderState() {
		return orderState;
	}
	/**
	 * ��ȡ������ֵ
	 * @param
	 * @return ���ض�����ֵ
	 * @throws
	 * @see
	 */
	public int getOrderValue() {
		return orderValue;
	}
	/**
	 * ��ȡ����
	 * @param
	 * @return ��������
	 * @throws
	 * @see
	 */
	public int getNumOfPerson(){
		return numOfPerson;
	}
	/**
	 * ��ȡ���޶�ͯ
	 * @param
	 * @return �������޶�ͯ
	 * @throws
	 * @see
	 */
	public boolean getChild(){
		return child;
	}
	/**
	 * ��ȡ��������
	 * @param
	 * @return ���ط�������
	 * @throws
	 * @see
	 */
	public String getRoomType() {
		return roomType;
	}
	/**
	 * ��ȡ��������
	 * @param
	 * @return ���ض�������
	 * @throws
	 * @see
	 */
	public int getRoomNumber() {
		return roomNumber;
	}
	/**
	 * ��ȡԤ����סʱ��
	 * @param
	 * @return ����Ԥ����סʱ��
	 * @throws
	 * @see
	 */
	public Time getExpectedCheckIn() {
		return expectedCheckIn;
	}
	/**
	 * ��ȡԤ���뿪ʱ��
	 * @param
	 * @return ����Ԥ���뿪ʱ��
	 * @throws
	 * @see
	 */
	public Time getExpectedCheckOut() {
		return expectedCheckOut;
	}
	/**
	 * ��ȡ����ִ��ʱ��
	 * @param
	 * @return ��������ִ��ʱ��
	 * @throws
	 * @see
	 */
	public Time getLatest(){
		return latest;
	}
	/**
	 * ��ȡ��������
	 * @param
	 * @return ���ض�������
	 * @throws
	 * @see
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * ��ȡ��������
	 * @param
	 * @return ���ض�������
	 * @throws
	 * @see
	 */
	public int getScore() {
		return score;
	}
	/**
	 * ���ö������
	 * @param oNum String�ͣ��߼��㴫���Ķ������
	 * @return
	 * @throws
	 * @see
	 */
	public void setOrderNumber(String oNum) {
		orderNumber = oNum;

	}
	/**
	 * ���ö���״̬
	 * @param state int�ͣ��߼��㴫���Ķ���״̬
	 * @return
	 * @throws
	 * @see
	 */
	public void setOrderState(int state) {
		orderState = state;
	}

	/**
	 * ���ö�����ֵ
	 * @param value int�ͣ��߼��㴫���Ķ�����ֵ
	 * @return
	 * @throws
	 * @see
	 */
	public void setOrderValue(int value) {
		orderValue = value;
	}
	/**
	 * ��������
	 * @param pnum int�ͣ��߼��㴫��������
	 * @return
	 * @throws
	 * @see
	 */
	public void setNumOfPerson(int num){
		numOfPerson=num;
	}
	/**
	 * �������޶�ͯ
	 * @param ch boolean�ͣ��߼��㴫�������޶�ͯ
	 * @return
	 * @throws
	 * @see
	 */
	public void setChild(boolean ch){
		child=ch;
	}
	/**
	 * ���÷�������
	 * @param rType String�ͣ��߼��㴫���ķ�������
	 * @return
	 * @throws
	 * @see
	 */
	public void setRoomType(String rType) {
		roomType = rType;
	}
	/**
	 * ���ö�������
	 * @param rNum int�ͣ��߼��㴫���Ķ�������
	 * @return
	 * @throws
	 * @see
	 */
	public void setRoomNumber(int rNum) {
		roomNumber = rNum;
	}
	/**
	 * ����Ԥ����סʱ��
	 * @param in Time�ͣ��߼��㴫����Ԥ����סʱ��
	 * @return
	 * @throws
	 * @see
	 */
	public void setExpectedCheckIn(Time in) {
		expectedCheckIn = in;
	}
	/**
	 * ��������ִ��ʱ��
	 * @param la Time�ͣ��߼��㴫��������ִ��ʱ��
	 * @return
	 * @throws
	 * @see
	 */
	public void setLatest(Time la){
		latest=la;
	}
	/**
	 * ����Ԥ����סʱ��
	 * @param out Time�ͣ��߼��㴫����Ԥ���뿪ʱ��
	 * @return
	 * @throws
	 * @see
	 */
	public void setExpectedCheckOut(Time out) {
		expectedCheckOut = out;
	}
	/**
	 * ���ö�������
	 * @param comm String�ͣ��߼��㴫���Ķ�������
	 * @return
	 * @throws
	 * @see
	 */
	public void setComment(String comm) {
		comment = comm;
	}
	/**
	 * ���ö�������
	 * @param sco int�ͣ��߼��㴫���Ķ�������
	 * @return
	 * @throws
	 * @see
	 */
	public void setScore(int sco) {
		score = sco;
	}

}
