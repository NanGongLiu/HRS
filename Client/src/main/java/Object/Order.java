package Object;

import java.util.List;

import LineItem.CreditRecordLineItem;
import LineItem.HotelLineItem;
import LineItem.OrderLineItem;
import LineItem.RoomLineItem;
import LineItem.UserLineItem;
import List.HotelList;
import List.OrderList;
import List.RoomList;
import List.UserList;

import java.util.Date;
import VO.HotelVO;
import VO.OrderVO;
import VO.UserVO;
import common.Choice;
import common.ResultMessage;
/**
 * Order
 * @author ������
 * @version 1.0
 * @see
 */
public class Order {
	OrderList orderlist;
	public void addorderlist(OrderList list){
		orderlist=list;
	}
	/**
     * ��ʾ���ж�����Ϣ
     * 
     * @return ArrayList<OrderVO>��һ������ֵ������б�
     * @see bussinesslogic.Order
     */

	public List<OrderLineItem> show(){
		return  orderlist.show();
	}
	
	
	/**
     * ��ʾ�����й��ڷ������Ϣ
     * 
     * @param vo OrderVO�ͣ�һ��������ֵ����
     * @return ����ResultMessage��һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public ResultMessage getRoomInfo(Order vo){
		return ResultMessage.Exist;
	}
	
	/**
     * ��ʾ�û���������ʷ����
     * 
     * @param vo UserVO�ͣ�һ���ͻ���ֵ����
     * @return ArrayList<Hotel> ��һ���������б�
     * @see bussinesslogic.Order
     */
	public List<OrderLineItem> gethistory(UserVO vo){
		return  orderlist.gethistory(vo);
	}
	
	
	/**
     * ��ʾѡ�еľƵ��������ʷ����
     * 
     * @param vo HotelVO�ͣ�һ���Ƶ��ֵ����
     * @return ArrayList<Order> ��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public List<OrderLineItem> findByHotel(HotelVO vo){
		return orderlist.gethotel(vo);
	}
	
	
	/**
     * ����ѡ������Ͳ������ж���������ʾ
     * 
     * @param type String�ͣ�һ�ֶ���������
     * @return ArrayList<OrderVO>��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public List<OrderLineItem> findByType(String type){
		return orderlist.find(type);
	}
	
	
	/**
     * ���ݶ����Ų��Ҷ������飬����ʾ
     * 
     * @param orderID String�ͣ�������
     * @return OrderVO��һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public OrderLineItem showDetail(String orderID){
		return orderlist.showdetail(orderID);
	}
	
	
	/**
     * ��һ���������ͱ�Ϊ�ѳ����������泷��ʱ��
     * 
     * @param orderID String�ͣ�������
     * @param currentTime Time�ͣ���ǰʱ��
     * @see bussinesslogic.Order
     */
	public void cancelOrder(String orderID,Date currentTime){
		orderlist.cancel(orderID,currentTime);
	}
	
	
	/**
     * ���г��������Ĳ���
     * 
     * @param order OrderVO�ͣ�һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public void duduct(OrderVO order){
		orderlist.cancel();
	}
	
	
	/**
     * �ж϶����Ƿ��ѱ�����
     * 
     * @param orderID String�ͣ��ͻ����
     * @param currentTime Time�ͣ�����������ʱ��
     * @return ���ѳ����򷵻�true�����򷵻�false
     * @see bussinesslogic.Order
     */
	public Boolean whetherDeduct(Date currentTime,String orderID){
		return orderlist.whetherDeduct(currentTime, orderID);
	}
	
	
	/**
     * ����һ����������
     * 
     * @param currentTime Time�ͣ���ǰʱ��
     * @param in Time�ͣ�Ԥ����סʱ��
     * @param out Time�ͣ�Ԥ���뿪ʱ��
     * @param roomType RoomType�ͣ���������
     * @param num int�ͣ������
     * @param numOfPerson int�ͣ�ס������
     * @param hasChild Boolean�ͣ��Ƿ���С��
     * @see bussinesslogic.Order
     */
	public void makeOrder(Date currentTime,
			Date in,Date out,
			String roomType,int num,
			int numOfPerson,
			boolean haveChild ) {
		orderlist.makeOrder(currentTime, in, out, roomType, num, numOfPerson, haveChild);
	}
	
	
	
	/**
     * �ж϶����Ƿ�����
     * 
     * @param userID String�ͣ��ͻ����
     * @return ���������򷵻�true�����򷵻�false
     * @see bussinesslogic.Order
     */
	public boolean whetherMake(String userID){
		return orderlist.generation(userID);
	}
	
	
	
	/**
     * ���Ķ���״̬Ϊ��ִ�У�Ϊ�ͻ���������ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void done(String orderID,String userID){
		orderlist.updatedone(orderID,userID);
	}
	
	
	/**
     * ���¶�������Ϊ�쳣��Ϊ�ͻ���ȥ����ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void abnormalOrder(String orderID,String userID){
		orderlist.updateabnormal(orderID,userID);
	}
	
	
	/**
     * ���¶�������Ϊ��ִ�У�Ϊ�ͻ��ָ�����ֵ�����»�Ա�ȼ�  
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void delayIn(String orderID,String userID){
		orderlist.updatedone(orderID, userID);
	}
	
	
	/**
     * ��������ִ�����񣬳־û������漰�������������� ϵͳ����
     * 
     * @see bussinesslogic.Order
     */
	public ResultMessage endExecute() {
		return ResultMessage.Exist;
	}
	
	
	/**
     * ���¶�����Ϣ����ʾ����
     * 
     * @param comment String�ͣ��ͻ�����
     * @param order OrderVO�ͣ�һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public void comment(String comment,OrderVO vo){
		orderlist.comment(comment,vo);
	}
	
	
	/**
     * ���������ID���Ҷ�������ʾ
     * 
     * @param ID String�ͣ�������
     * @return OrderVO��һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public OrderLineItem findByID(String ID){
		return orderlist.findByID(ID);
	}
	
	
	/**
     * �ָ��ͻ�����ֵ�����»�Ա�ȼ�
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @param choice Choice�ͣ�һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public void regain(OrderVO vo,Choice choice){
		orderlist.updatedone(vo.orderNumber, vo.userID);
	}
	
	
	/**
     * ���㶩����ֵ����ʾ
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @param userID String�ͣ��ͻ����
     * @return long�������ļ�ֵ
     * @see bussinesslogic.Order
     */
	public long getPrice(String orderID,String userID){
		return orderlist.getPrice(orderID,userID);
	}
	
	
	/**
     * δ֧������
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @return ResultMessage��һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public ResultMessage payment(OrderVO vo){
		return ResultMessage.Exist;
	}
}
