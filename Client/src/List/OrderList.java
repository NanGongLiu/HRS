package List;

import java.util.*;

import LineItem.OrderLineItem;
import VO.HotelVO;
import VO.OrderVO;
import VO.UserVO;
/**
 * OrderLIst
 * @author ������
 * @version 1.0
 * @see
 */
public class OrderList {
	List<OrderLineItem> orders;	
	/**
	 * �����б�
	 * @param
	 * @return
	 */
	public OrderList () {		
		orders = new ArrayList<OrderLineItem>();		
	}
	
	/**
	 * ��ӵ�������
	 * @param oli OrderLineItem�ͣ���ӵĵ�������
	 * @return 
	 */
	public void addOrderLineItems(OrderLineItem  oli) {
		orders.add(oli);
	}
	/**
	 * ��ʾ�����б�
	 * @param oli OrderLineItem�ͣ���ʾ�ĵ�������
	 * @return list�б�
	 */
	public List<OrderLineItem> show(){
		return orders;
	}
	/**
	 * �õ�����
	 * @param
	 * @return ���ض���
	 */
	public int getOrderInfo() {
		return orders.size();
	}
	
	/**
	 * �õ�����
	 * @param
	 * @return ���ض���
	 */
	public int getOrder() {
		return orders.size();
	}
	/**
	 * ��ʾ��ʷ����
	 * @param vo HotelVOt�ͣ��Ƶ�
	 * @return ����list
	 */
	public List<OrderLineItem> gethotel(HotelVO vo) {		
		String name=vo.hotelName;
		List<OrderLineItem> list=new ArrayList<OrderLineItem>();
		for(int i=0;i<orders.size();i++){
			if(orders.get(i).gethotelID().equals(name)){
				list.add(orders.get(i));
			}
		}
		return list;
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
	 		OrderVO b=new OrderVO();
	 		b.generationTime=currentTime;
	 		b.expectedCheckIn=in;
	 		b.expectedCheckOut=out;
	 		b.roomType=roomType;
	 		b.roomNumber=num;
	 		b.numOfPerson=numOfPerson;
	 		b.child=haveChild;
	 	    OrderLineItem item=new OrderLineItem(b);
	 	    orders.add(item);
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
		if(showdetail(orderID).getcancel()==currentTime){
			return true;
		}
		else{
			return false;
		}
	}
	/**
	 * ��ʾ���������Ķ���
	 * @param str String�ͣ�����
	 * @return ����list
	 */
	public List<OrderLineItem> find(String str) {
		List<OrderLineItem> list=new ArrayList<OrderLineItem>();
		for(int i=0;i<orders.size();i++){
			if(orders.get(i).getroomType().equals(str)){
				list.add(orders.get(i));
			}
		}
		return list;
	}
	/**
	 * ��ʾ���������Ķ���
	 * @param str String�ͣ�������
	 * @return ���ض���
	 */
	public OrderLineItem showdetail(String orderID) {
		for(int i=0;i<orders.size();i++){
			if(orders.get(i).getorderID().equals(orderID)){
				return orders.get(i);
			}
		}
		return null;
	}
	/**
	 * ȡ������
	 * @param str String�ͣ�id
	 * @param time Time�ͣ�����ʱ��
	 */
	public void cancel(String orderID, Date currentTime) {
		for(int i=0;i<orders.size();i++){
			if(orders.get(i).getorderID().equals(orderID)){
				orders.get(i).cancel(currentTime);
			}
		}
	}
	/**
	 * ȡ������
	 *
	 */
	public void cancel() {
		orders.get(0).cancel();
	}
	/**
	 * ���Ҷ���
	 * @param str String�ͣ�id
	 * @param str String�ͣ�orderid
	 * 
	 */
	public OrderLineItem find(String userID, String orderID) {
		for(int i=0;i<orders.size();i++){
			if(orders.get(i).getuserID().equals(userID)&&
					orders.get(i).getorderID().equals(orderID)){
				return orders.get(i);
			}
		}
		return null;
	}
	/**
	 * ���Ҷ���
	 * @param str String�ͣ�id
	 * @return orderItem
	 * 
	 */
	public OrderLineItem findByID(String iD) {
		for(int i=0;i<orders.size();i++){
			if(orders.get(i).getorderID().equals(iD)){
				return orders.get(i);
			}
		}
		return null;
	}
	/**
	 * ��ʾ��ʷ����
	 * @param vo UserVOt�ͣ��û�
	 * @return ����list
	 */
	public List<OrderLineItem> gethistory(UserVO vo) {
		List<OrderLineItem> list=new ArrayList<OrderLineItem>();
		for(int i=0;i<orders.size();i++){
			if(orders.get(i).getuserID().equals(vo.id)){
				list.add(orders.get(i));
			}
		}
		return list;
	}
	public boolean generation (String userID){
		List<OrderLineItem> list=new ArrayList<OrderLineItem>();
		for(int i=0;i<orders.size();i++){
			if(orders.get(i).getuserID().equals(userID)){
				list.add(orders.get(i));
			}
		}
		if(list.isEmpty()){
			return false;
		}
		else{
			return true;
		}
	}/**
     * ���¶������ͣ�Ϊ�ͻ��޸�����ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	private void update(String orderID,String userID,int state){
		find(userID,orderID).update(orderID,userID,state);
	}
	public void updatedone(String orderID,String userID){
		update(orderID,userID,3);
	}
	public void updateabnormal(String orderID,String userID){
		update(orderID,userID,1);
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
		return find(userID, orderID).getprice();
	}
	/**
     * ���¶�����Ϣ����ʾ����
     * 
     * @param comment String�ͣ��ͻ�����
     * @param order OrderVO�ͣ�һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public void comment(String comment,OrderVO vo){
		find(vo.userID,vo.orderNumber).comment(comment);
	}
	private OrderLineItem find(OrderVO vo){
		for(int i=0;i<orders.size();i++){
			if(orders.get(i).getorderID().equals(vo.orderNumber)&&
					orders.get(i).getuserID().equals(vo.userID)){
				return orders.get(i);
			}
		}
		return null;
	}
	
}
