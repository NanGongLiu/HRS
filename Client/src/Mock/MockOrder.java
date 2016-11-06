package Mock;

import java.util.Date;

import Object.Order;
/**
 * MockOrder
 * @author ������
 * @version 1.0
 * @see
 */
public class MockOrder extends Order{
		private static final long serialVersionUID = 1L;
		private String orderNumber;
		private int orderState;
		private int orderValue;
		private int numOfPerson;
		private boolean child;
		private String roomType;
		private int roomNumber;
		private Date expectedCheckIn;
		private Date expectedCheckOut;
		private Date latest;
		private Date cancel;
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
		 * @param in Date�ͣ��߼��㴫����Ԥ����סʱ��
		 * @param out Date�ͣ��߼��㴫����Ԥ���뿪ʱ��
		 * @param la Date�ͣ��߼��㴫��������ִ��ʱ��
		 * @param comm String�ͣ��߼��㴫���Ķ�������
		 * @param sco int�ͣ��߼��㴫���Ķ�������
		 * @param cancel Date�ͣ��߼��㴫���ĳ���ʱ��
		 * @return
		 * @throws
		 * @see
		 */
		public MockOrder (String oNum, int state, int value, int pnum,boolean ch,String rType, int rNum, Date in, Date out,Date la, String comm, int sco,Date cancel) {
			
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
	        this.cancel=cancel;
		}
		public MockOrder(){}
		/**
		 * ��ȡ����ʱ��
		 * @param
		 * @return ����ʱ��
		 * @throws
		 * @see
		 */
		public Date getcancel() {
			return cancel;
		}
		/**
		 * ��ȡ�������
		 * @param
		 * @return ���ض������
		 * @throws
		 * @see
		 */
		public void setcancel(Date t) {
			cancel=t;
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
		public Date getExpectedCheckIn() {
			return expectedCheckIn;
		}
		/**
		 * ��ȡԤ���뿪ʱ��
		 * @param
		 * @return ����Ԥ���뿪ʱ��
		 * @throws
		 * @see
		 */
		public Date getExpectedCheckOut() {
			return expectedCheckOut;
		}
		/**
		 * ��ȡ����ִ��ʱ��
		 * @param
		 * @return ��������ִ��ʱ��
		 * @throws
		 * @see
		 */
		public Date getLatest(){
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
		public void setExpectedCheckIn(Date in) {
			expectedCheckIn = in;
		}
		/**
		 * ��������ִ��ʱ��
		 * @param la Time�ͣ��߼��㴫��������ִ��ʱ��
		 * @return
		 * @throws
		 * @see
		 */
		public void setLatest(Date la){
			latest=la;
		}
		/**
		 * ����Ԥ����סʱ��
		 * @param out Time�ͣ��߼��㴫����Ԥ���뿪ʱ��
		 * @return
		 * @throws
		 * @see
		 */
		public void setExpectedCheckOut(Date out) {
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
