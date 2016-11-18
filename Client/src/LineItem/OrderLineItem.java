package LineItem;

import java.util.Date;
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
  	 * ��ö����۸�
  	 * @return �۸�long
  	 *
  	 */
     public long getprice(){
    	 return vo.orderValue;
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
	/**
 	 * ��ö���id
 	 * @return ����ʱ��
 	 */
	public String getorderID() {
		return vo.orderNumber;
	}
	/**
 	 * ����û�id
 	 * @return ����ʱ��
 	 */
	public String getuserID() {
		return vo.userID;
	}
	/**
 	 * ��þƵ�id
 	 * @return ����ʱ��
 	 */
	public String gethotelID() {
		return vo.hotelID;
	}
	/**
 	 * ��÷�������
 	 * @return ����ʱ��
 	 */
	public String getroomType() {
		return vo.roomType;
	}
	/**
     *
     * ���¶������ͣ�Ϊ�ͻ��޸�����ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void update(String orderID,String userID,int state){
		vo.credit=state;
		vo.userLevel=state;
		vo.orderState=state;
	}
	/**
     * ���¶�����Ϣ����ʾ����
     * 
     * @param comment String�ͣ��ͻ�����
     * @param order OrderVO�ͣ�һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public void comment(String comment){
		vo.comment=comment;
	}
}
