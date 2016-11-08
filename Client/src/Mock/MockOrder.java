package Mock;

import java.sql.Time;
import java.util.Date;

import Object.Order;
import VO.OrderVO;
/**
 * MockOrder
 * @author ������
 * @version 1.0
 * @see
 */
public class MockOrder extends OrderVO{
		private static final long serialVersionUID = 1L;
		/**
		 * ���충������ʵ��
		 * @param oNum String�ͣ��߼��㴫���Ķ������
		 * @param userID String�ͣ��߼��㴫�����û����
		 * @param hotelID String�ͣ��߼��㴫���ľƵ�id
		 * @param state int�ͣ��߼��㴫���Ķ���״̬
		 * @param value int�ͣ��߼��㴫���Ķ�����ֵ
		 * @param pnum int�ͣ��߼��㴫��������
		 * @param ch boolean�ͣ��߼��㴫�������޶�ͯ
		 * @param rType String�ͣ��߼��㴫���ķ�������
		 * @param rNum int�ͣ��߼��㴫���Ķ�������
		 * @param in Date�ͣ��߼��㴫����Ԥ����סʱ��
		 * @param out Date�ͣ��߼��㴫����Ԥ���뿪ʱ��
		 * @param la Date�ͣ��߼��㴫��������ִ��ʱ��
		 * @param can Date�ͣ��߼��㴫����ȡ��ʱ��
		 * @param gen Date�ͣ��߼��㴫���Ĳ���ʱ��
		 * @param comm String�ͣ��߼��㴫���Ķ�������
		 * @param sco int�ͣ��߼��㴫���Ķ�������
		 * @return
		 * @throws
		 * @see
		 */
		public MockOrder (String hotelID,String userid,String oNum, int state, int value, int pnum,boolean ch,String rType, int rNum, Date in, Date out,Date la ,Date can,Date gen,String comm, int sco) {
			userID=userid;
			this.hotelID=hotelID;
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
			cancel=can;
			generationTime=gen;
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
		/**
		 * ��ȡȡ��ʱ��
		 * @param
		 * @return ����ȡ��ʱ��
		 * @throws
		 * @see
		 */
		public Date getCancel() {
			return cancel;
		}
		/**
		 * ��ȡ����ʱ��
		 * @param
		 * @return ���ز���ʱ��
		 * @throws
		 * @see
		 */
		public Date getgenerationTime() {
			return generationTime;
		}
		/**
		 * ����ȡ��ʱ��
		 * @param can Date�ͣ��߼��㴫����ȡ��ʱ��
		 * @return
		 * @throws
		 * @see
		 */
		public void setcancel(Date can) {
			cancel = can;
		}
		/**
		 * ���ò���ʱ��
		 * @param gen Date�ͣ��߼��㴫���Ĳ���ʱ��
		 * @return
		 * @throws
		 * @see
		 */
		public void setgenerationTime(Date gen) {
			generationTime = gen;
		}
}
