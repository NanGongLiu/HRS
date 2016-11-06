package LineItem;

import java.util.Date;

import Object.Order;
import VO.OrderVO;
/**
 * OrderLineItem
 * @author ������
 * @version 1.0
 * @see
 */
public class OrderLineItem {
     Order order;
     OrderVO vo;

     /**
      * ��������
      * @param o Order�ͣ����붩������
      * @return ��������
      */
     public OrderLineItem(Order o){
    	 order=o;
     }
     public OrderLineItem(OrderVO vo){
    	 this.vo=vo;
     }
     public Order getorder(){
    	 return order;
     }
     /**
 	 * ȡ������
 	 * @param Time��ʱ��
 	 *
 	 */
     public void cancel(Date currentTime){
    	 order.setcancel(currentTime);
    	 order.setOrderState(-1);
     }
     /**
 	 * ȡ��������Ϊ
 	 * 
 	 */
     public void cancel(){
    	 order.setOrderState(-1);
     }
     /**
 	 * ���ȡ��ʱ��
 	 * @return ����ʱ��
 	 */
	public Date getcancel() {
		return order.getcancel();
	}
	/**
	 * �ж��Ƿ���ɶ���
	 * @param userID
	 * @return ����bool
	 */
	public boolean complete(String uerID) {
		return true;
	}
}
