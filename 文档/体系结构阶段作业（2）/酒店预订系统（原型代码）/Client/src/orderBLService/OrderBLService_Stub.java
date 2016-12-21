package orderBLService;

import java.util.ArrayList;

import Object.Hotel;
import Object.RoomType;
import Object.Time;
import VO.HotelVO;
import VO.OrderVO;
import VO.UserVO;
import common.Choice;
import common.ResultMessage;

/**
 * ����ʵ�ֶ�����������Ҫ��׮����
 * @author ������
 * @version 1.0
 * @see presentation.Order
 */
public class OrderBLService_Stub implements OrderBLService{
		String orderNumber;
		int orderState;
		String userName;
		String userNumber;
		String userPhone;
		int orderValue;
		String hotelName;
		String hotelLocation;
		String hotelPhone;
		String roomType;
		int roomNumber;
		Time expectedCheckIn;
		Time expectedCheckOut;
		String comment;
		int score;	

		public OrderBLService_Stub (String oNum, int state, String uName, String uNum, String uPhone, int value, String hName, String hLoca, String hPhone, String rType, int rNum, Time in, Time out, String comm, int sco) {
			
			orderNumber = oNum;
			orderState = state;
			userName = uName;
			userNumber = uNum;
			userPhone = uPhone;
			orderValue = value;
			hotelName = hName;
			hotelLocation = hLoca;
			hotelPhone = hPhone;
			roomType = rType;
			roomNumber = rNum;
			expectedCheckIn = in;
			expectedCheckOut = out;
			comment = comm;
			score = sco;

		}
	/**
     * ��ʾ���ж�����Ϣ
     * 
     * @return ArrayList<OrderVO>��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public ArrayList<OrderVO> show(){
		return new ArrayList<OrderVO>();
	}
	
	
	/**
     * ��ʾ�����й��ڷ������Ϣ
     * 
     * @param vo OrderVO�ͣ�һ��������ֵ����
     * @return ����ResultMessage��һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public ResultMessage getRoomInfo (OrderVO vo){
		return ResultMessage.Exist;
	}
	
	
	/**
     * �رն�������
     * 
     * @see bussinesslogic.Order
     */
	public void cancel(){
		System.out.println("cancel success");
	}
	
	
	/**
     * ��ʾ�����й��ڷ������Ϣ
     * 
     * @param vo UserVO�ͣ�һ���ͻ���ֵ����
     * @return ArrayList<Hotel> ��һ���Ƶ���б�
     * @see bussinesslogic.Order
     */
	public ArrayList<Hotel> gethistory(UserVO vo){
		return new ArrayList<Hotel>();
	}
	
	
	/**
     * ��ʾѡ�еľƵ��������ʷ����
     * 
     * @param vo HotelVO�ͣ�һ���Ƶ��ֵ����
     * @return ArrayList<Order> ��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public ArrayList<OrderVO> findByType(HotelVO vo){
		return new ArrayList<OrderVO>();
	}
	
	
	/**
     * ����ѡ������Ͳ������ж���������ʾ
     * 
     * @param type String�ͣ�һ�ֶ���������
     * @return ArrayList<OrderVO>��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public ArrayList<OrderVO> findByType(String type){
		return new ArrayList<OrderVO>();
	}
	
	
	/**
     * ���ݶ����Ų��Ҷ������飬����ʾ
     * 
     * @param orderID String�ͣ�������
     * @return OrderVO��һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public OrderVO showDetail(String orderID){
		return new OrderVO();
	}
	
	
	/**
     * ��һ���������ͱ�Ϊ�ѳ����������泷��ʱ��
     * 
     * @param orderID String�ͣ�������
     * @param currentTime Time�ͣ���ǰʱ��
     * @see bussinesslogic.Order
     */
	public void cancelOrder(String orderID,Time currentTime){
		System.out.println("cancel success");
	}
	
	
	/**
     * ���г��������Ĳ���
     * 
     * @param order OrderVO�ͣ�һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public void duduct(OrderVO order){
		System.out.println("duduct success");
	}
	
	
	/**
     * �ж϶����Ƿ��ѱ�����
     * 
     * @param orderID String�ͣ��ͻ����
     * @param currentTime Time�ͣ�����������ʱ��
     * @return ���ѳ����򷵻�true�����򷵻�false
     * @see bussinesslogic.Order
     */
	public Boolean whetherDeduct(Time currentTime,String orderID){
		return true;
	}
	
	
	/**
     * ����һ����������
     * 
     * @param currentTime Time�ͣ���ǰʱ��
     * @param in Time�ͣ���סʱ��
     * @param out Time�ͣ��뿪ʱ��
     * @param ddl Time�ͣ�Ԥ���뿪ʱ��
     * @param roomType RoomType�ͣ���������
     * @param num int�ͣ������
     * @param numOfPerson int�ͣ�ס������
     * @param hasChild Boolean�ͣ��Ƿ���С��
     * @see bussinesslogic.Order
     */
	public void makeOrder(Time currentTime,
			Time in,Time out,Time ddl,
			RoomType roomType,int num,
			int numOfPerson,
			boolean haveChild ) {
		System.out.println("make success");
	}
	
	
	
	/**
     * �ж϶����Ƿ�����
     * 
     * @param userID String�ͣ��ͻ����
     * @return ���������򷵻�true�����򷵻�false
     * @see bussinesslogic.Order
     */
	public boolean whetherMake(String uerID){
		return true;
	}
	
	
	
	/**
     * ���Ķ���״̬Ϊ��ִ�У�Ϊ�ͻ���������ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void done(String orderID,String userID){
		System.out.println("update success");
	}
	
	
	/**
     * ���¶�������Ϊ�쳣��Ϊ�ͻ���ȥ����ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void abnormalOrder(String orderID,String userID){
		System.out.println("update success");
	}
	
	
	/**
     * ���¶�������Ϊ��ִ�У�Ϊ�ͻ��ָ�����ֵ�����»�Ա�ȼ�  
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void delayIn(String orderID,String userID){
		System.out.println("update success");
	}
	
	
	/**
     * ��������ִ�����񣬳־û������漰�������������� ϵͳ����
     * 
     * @see bussinesslogic.Order
     */
	public void endExecute() {
		System.out.println("update success");
	}
	
	
	/**
     * ���¶�����Ϣ����ʾ����
     * 
     * @param comment String�ͣ��ͻ�����
     * @param order OrderVO�ͣ�һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public void comment(String comment,OrderVO order){
		System.out.println("update success");
	}
	
	
	/**
     * ���������ID���Ҷ�������ʾ
     * 
     * @param ID String�ͣ�������
     * @return OrderVO��һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public OrderVO findByID(String ID){
		return new OrderVO();
	}
	
	
	/**
     * �ָ��ͻ�����ֵ�����»�Ա�ȼ�
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @param choice Choice�ͣ�һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public void regain(OrderVO vo,Choice choice){
		System.out.println("update success");
	}
	
	
	/**
     * ���㶩����ֵ����ʾ
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @param userID String�ͣ��ͻ����
     * @return long�������ļ�ֵ
     * @see bussinesslogic.Order
     */
	public long getPrice(OrderVO vo,String userID){
		return 10000;
	}
	
	
	/**
     * ���㶩����ֵ����ʾ
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @return ResultMessage��һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public ResultMessage payment(OrderVO vo){
		return ResultMessage.Exist;
	}
}
