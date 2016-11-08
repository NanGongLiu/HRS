package LineItem;

import java.util.Date;
import java.util.HashMap;

import Object.Order;
import VO.OrderVO;
/**
 * OrderLineItem
 * @author ������
 * @version 1.0
 * @see
 */
public class OrderLineItem {
	OrderVO vo;
     /**
      * ��������
      * @param o OrderVO�ͣ����붩������
      * @return ��������
      */
     public OrderLineItem(OrderVO vo){
    	 this.vo=vo;
     }
     public OrderVO getvo(){
    	 return vo;
     }
     /**
 	 * ȡ������
 	 * @param Time��ʱ��
 	 *
 	 */
     public void cancel(Date currentTime){
    	 vo.cancel=currentTime;
    	 vo.orderState=-1;
    	 
     }
     /**
 	 * ȡ��������Ϊ
 	 * 
 	 */
     public void cancel(){
    	 vo.orderState=-1;
     }
     /**
 	 * ���ȡ��ʱ��
 	 * @return ����ʱ��
 	 */
	public Date getcancel() {
		return vo.cancel;
	}
}
