package List;

import java.util.*;

import LineItem.OrderLineItem;
import VO.HotelVO;
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
			if(orders.get(i).getvo().hotelID.equals(name)){
				list.add(orders.get(i));
			}
		}
		return list;
	}
	/**
	 * ��ʾ���������Ķ���
	 * @param str String�ͣ�����
	 * @return ����list
	 */
	public List<OrderLineItem> find(String str) {
		List<OrderLineItem> list=new ArrayList<OrderLineItem>();
		for(int i=0;i<orders.size();i++){
			if(orders.get(i).getvo().roomType.equals(str)){
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
			if(orders.get(i).getvo().orderNumber.equals(orderID)){
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
			if(orders.get(i).getvo().orderNumber.equals(orderID)){
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
			if(orders.get(i).getvo().userID.equals(userID)&&
					orders.get(i).getvo().orderNumber.equals(orderID)){
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
			if(orders.get(i).getvo().orderNumber.equals(iD)){
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
			if(orders.get(i).getvo().userID.equals(vo.id)){
				list.add(orders.get(i));
			}
		}
		return list;
	}
	public boolean generation (String userID){
		List<OrderLineItem> list=new ArrayList<OrderLineItem>();
		for(int i=0;i<orders.size();i++){
			if(orders.get(i).getvo().userID.equals(userID)){
				list.add(orders.get(i));
			}
		}
		if(list.isEmpty()){
			return false;
		}
		else{
			return true;
		}
	}
}
